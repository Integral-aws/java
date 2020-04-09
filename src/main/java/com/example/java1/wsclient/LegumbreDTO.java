package com.example.java1.wsclient;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegumbreDTO {

	private boolean error;
	private String mensaje;
	private List<Legumbre> legumbres;
	
}
