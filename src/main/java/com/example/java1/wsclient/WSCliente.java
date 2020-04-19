package com.example.java1.wsclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WSCliente implements IWSCliente {

	@Value("${java2.url}")
	private String java2_url;
	
	@Override
	public LegumbreDTO consultarServicio() {
		try {
			RestTemplate rest = new RestTemplate();
			ResponseEntity<LegumbreDTO> respuesta = rest.getForEntity("http://"+java2_url+":3002/java2/serv1", LegumbreDTO.class);
			if(respuesta.getStatusCode().equals(HttpStatus.OK)) {
				return respuesta.getBody();
			}
			throw new Exception("Servicio response con codigo: "+respuesta.getStatusCodeValue());
		}catch(Exception e) {
			LegumbreDTO legumbreDTO = new LegumbreDTO();
			legumbreDTO.setError(true);
			legumbreDTO.setMensaje(e.getMessage());
			return legumbreDTO;
		}
	}
	
}
