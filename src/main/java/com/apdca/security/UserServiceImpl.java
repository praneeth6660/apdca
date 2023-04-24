package com.apdca.security;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private OnlineUsersRepository onlineUserRepository;
	@Autowired
	private RolesRepository rolesRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JavaMailSender mailSender;

	@Override
	@Transactional
	@Modifying
	public OnlineUsers saveUser(OnlineUsersDto userDto) {
		OnlineUsers onlineUsers = new OnlineUsers();
		try {

			onlineUsers.setFirm_nm(userDto.getFirm_nm());
			onlineUsers.setFirm_no(userDto.getFirm_no());
			onlineUsers.setUser_nm(userDto.getUser_nm());
			onlineUsers.setReqloginnm(userDto.getReqloginnm());
			onlineUsers.setUser_pwd(passwordEncoder.encode(userDto.getUser_pwd()));
			onlineUsers.setEmail_id(userDto.getReqloginnm());
			onlineUsers.setMobile_no(userDto.getMobile_no());
			onlineUsers.setAddress(userDto.getAddress());
			onlineUsers.setArea(userDto.getArea());
			onlineUsers.setPincode(userDto.getPincode());
			onlineUsers.setDob(userDto.getDob());
			Roles role = rolesRepository.findByrolename("User");
			System.out.println("arrays" + Arrays.asList(role));
			onlineUsers.setRoles(Arrays.asList(role));
			onlineUsers.setRole_id(14);
			System.out.println("in service implementation");
			Random rnd = new Random();
			int number = rnd.nextInt(999999);
			// String randomCode = rm.RandomString.make(64);
			onlineUsers.setVerificationCode(String.format("%06d", number));
			onlineUsers.setEnabled(false);
			onlineUserRepository.save(onlineUsers);
			// sendVerificationEmail(onlineUsers, siteURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onlineUsers;
	}

	private void sendVerificationEmail(OnlineUsers user, String siteURL)
			throws MessagingException, UnsupportedEncodingException {
		String toAddress = user.getReqloginnm();
		System.out.println("toAddress is--->" + toAddress);
		String fromAddress = "praneeth.bandaru123@gmail.com";
		String senderName = "DCA Department";
		String subject = "Please verify your registration";
		String content = "Dear [[name]],<br>" + "Please click the link below to verify your registration:<br>"
				+ "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>" + "Thank you,<br>" + "Your company name.";

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom(fromAddress, senderName);
		helper.setTo(toAddress);
		helper.setSubject(subject);

		content = content.replace("[[name]]", user.getUser_nm());
		String verifyURL = siteURL + "/verify?code=" + user.getVerificationCode();

		content = content.replace("[[URL]]", verifyURL);

		helper.setText(content, true);

		mailSender.send(message);

	}

	@Override
	public OnlineUsers findUserByreqloginnm(String reqloginnm) {
		// TODO Auto-generated method stub
		return onlineUserRepository.findByreqloginnm(reqloginnm);
	}

	@Override
	public List<OnlineUsersDto> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
