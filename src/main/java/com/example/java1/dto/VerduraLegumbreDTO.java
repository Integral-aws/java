package com.example.java1.dto;

import java.util.List;

import com.example.java1.model.Verdura;
import com.example.java1.wsclient.Legumbre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerduraLegumbreDTO extends ResponseDTO {

	private List<Verdura> verduras;
	private List<Legumbre> legumbres;
	
}
