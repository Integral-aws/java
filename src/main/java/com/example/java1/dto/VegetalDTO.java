package com.example.java1.dto;

import java.util.List;

import com.example.java1.model.Vegetal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VegetalDTO extends ResponseDTO {

	private List<Vegetal> vegetales;
	
}
