package com.example.java1.dto;

import java.util.List;

import com.example.java1.model.Verdura;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerduraDTO extends ResponseDTO {

	private List<Verdura> vegetales;
	
}
