package com.example.java1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java1.dao.ServicioDAO;
import com.example.java1.dto.VerduraDTO;
import com.example.java1.dto.VerduraLegumbreDTO;
import com.example.java1.wsclient.IWSCliente;
import com.example.java1.wsclient.LegumbreDTO;

@Service
public class SevicioBO implements IServicioBO {

	@Autowired
	private ServicioDAO servicioDAO;
	
	@Autowired
	private IWSCliente iWSCliente;

	@Override
	public VerduraDTO obtenerVegetales() {
		VerduraDTO verduraDTO = new VerduraDTO();
		try {
			verduraDTO.setVegetales(servicioDAO.findAll());
			verduraDTO.setMensaje("Transacción exitosa");
		}catch(Exception e) {
			verduraDTO.setError(true);
			verduraDTO.setMensaje("Error al consultar datos: "+e.getMessage());
		}
		return verduraDTO;
	}

	@Override
	public VerduraLegumbreDTO obtenerVerdurasYlegumbres() {
		VerduraLegumbreDTO verds = new VerduraLegumbreDTO();
		try {
			verds.setVerduras(servicioDAO.findAll());
			LegumbreDTO legumbreDTO = iWSCliente.consultarServicio();
			if(legumbreDTO.isError()) {
				throw new Exception("Error en el WS: "+legumbreDTO.getMensaje());
			}
			verds.setLegumbres(legumbreDTO.getLegumbres());
			verds.setMensaje("Transacción exitosa");
		}catch(Exception e) {
			verds.setError(true);
			verds.setMensaje(e.getMessage());
		}
		return verds;
	}
	
	
	
}
