package com.example.java1.service;

import com.example.java1.dto.VerduraDTO;
import com.example.java1.dto.VerduraLegumbreDTO;

public interface IServicioBO {

	VerduraDTO obtenerVegetales();
	
	VerduraLegumbreDTO obtenerVerdurasYlegumbres();
	
}
