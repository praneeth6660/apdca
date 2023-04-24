package com.apdca.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class AuthController {

	@Autowired
	private UserService userService;
	@Autowired
	private RecaptchaService recaptchaService;

	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationForm(Model model) {
		OnlineUsersDto user = new OnlineUsersDto();
		model.addAttribute("user", user);
		return "register";
	}

	@PostMapping("/register/save")
	public String registration(@Valid @ModelAttribute("user") OnlineUsersDto userDto, BindingResult result, Model model,
			@RequestParam(name = "g-recaptcha-response") String recaptchaResponse, HttpServletRequest request) {
		// captch Code//
		String ip = request.getRemoteAddr();
		String captchaVerifyMessage = recaptchaService.verifyRecaptcha(ip, recaptchaResponse);
		if (!captchaVerifyMessage.equals("")) {
			Map<String, Object> response = new HashMap<>();
			response.put("message", captchaVerifyMessage);
			result.rejectValue("captcha", null, captchaVerifyMessage);
		}
		// captch Code END//
		OnlineUsers existingUser = userService.findUserByreqloginnm(userDto.getReqloginnm());
		if (existingUser != null && existingUser.getReqloginnm() != null && !existingUser.getReqloginnm().isEmpty()) {
			result.rejectValue("reqloginnm", null, "There is already an account registered with the same email");
		}

		if (result.hasErrors()) {
			model.addAttribute("user", userDto);
			return "/register";
		}

		userService.saveUser(userDto);
		 return "redirect:/register?success";
	}

	  private String getSiteURL(HttpServletRequest request) {
	        String siteURL = request.getRequestURL().toString();
	        return siteURL.replace(request.getServletPath(), "");
	    }  
	
//	  
//	  @GetMapping("/verify")
//	  public String verifyUser(@Param("code") String code) {
//		  System.out.println("in verify"+code);
//		  return "success";
////	      if (service.verify(code)) {
////	          return "verify_success";
////	      } else {
////	          return "verify_fail";
////	      }
//	  }
//	  
	  
	
	@GetMapping("/login")
	public String login() {
		System.out.println("in login");
		return "login";
	}
	
	   @PostMapping("/login")
	    public String postLogin(HttpServletRequest request, Authentication authentication) {
		   System.out.println("in postLogin");
	        HttpSession session = request.getSession();
	        System.out.println("session name ---->"+authentication.getName());
	        session.setAttribute("username", authentication.getName());
	        
	        return "redirect:/users";
	    }

	@GetMapping("/users")
	public String users() {
		return "users";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("in logout");
		return "login";
	}
	
	@RequestMapping("/403")
	public String accessDenied() {
		System.out.println("in 403");
	    return "/error/403";
	}

}
