package com.jhonatan.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonatan.os.domain.Cliente;
import com.jhonatan.os.domain.OS;
import com.jhonatan.os.domain.Tecnico;
import com.jhonatan.os.domain.enums.Prioridade;
import com.jhonatan.os.domain.enums.Status;
import com.jhonatan.os.repositories.ClienteRepository;
import com.jhonatan.os.repositories.OSRepository;
import com.jhonatan.os.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public <S> void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Jhonatan Oliveira", "386.669.470-98", "(55) 91234-5678");
		Cliente c1 = new Cliente(null, "Betina Campos", "286.970.210-81", "(55) 98877-6655");

		OS os1 = new OS(null, Prioridade.ALTA, "Trocar fonte do notebook", Status.ANDAMENTO, t1, c1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}