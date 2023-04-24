package com.apdca.masters.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JurisdictionId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String circd;
	private String areacd;
	private String jurcd;
	
	
}
