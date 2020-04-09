package com.example.java1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java1.dto.VerduraDTO;
import com.example.java1.dto.VerduraLegumbreDTO;
import com.example.java1.service.IServicioBO;

@RestController
public class EntradaServicio {
	
	@Autowired
	private IServicioBO iServicioBO;

	@GetMapping("serv1")
	public ResponseEntity<VerduraDTO> servicio() {
		VerduraDTO verduraDTO = iServicioBO.obtenerVegetales();
		if(verduraDTO.isError()) {
			return new ResponseEntity<VerduraDTO>(verduraDTO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<VerduraDTO>(verduraDTO, HttpStatus.OK);
	}
	
	@RequestMapping("serv2")
	public ResponseEntity<VerduraLegumbreDTO> obtenerVegetalesYlegumbres(){
		VerduraLegumbreDTO verds = iServicioBO.obtenerVerdurasYlegumbres();
		if(verds.isError()) {
			return new ResponseEntity<VerduraLegumbreDTO>(verds, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<VerduraLegumbreDTO>(verds, HttpStatus.OK);
	}
	
}
