package com.neosoft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document()
@Data
@NoArgsConstructor
public class Contact {


	@Id
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;
    
	public Long getcId() {
		return cId;
	}
	
}
