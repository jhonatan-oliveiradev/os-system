package com.jhonatan.os.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonatan.os.dtos.OSDTO;
import com.jhonatan.os.services.OSService;

@RestController
@RequestMapping(value = "/os")
public class OSResource {

	@Autowired
	private OSService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<OSDTO> findById(@PathVariable Integer id) {
		OSDTO obj = new OSDTO(service.findById(id));
		return ResponseEntity.ok().body(obj);
	}
}
