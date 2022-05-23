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
		Tecnico t2 = new Tecnico(null, "Maik Wazolski", "300.022.910-88", "(11) 99123-2078");
		Tecnico t3 = new Tecnico(null, "Andrew Stuart", "366.173.020-79", "(12) 98123-3178");
		Tecnico t4 = new Tecnico(null, "Harry Potter", "697.199.460-40", "(11) 99123-4378");
		Tecnico t5 = new Tecnico(null, "Alan Turing", "913.169.670-85", "(16) 99123-7678");
		Tecnico t6 = new Tecnico(null, "Isaac Newton", "720.813.260-78", "(15) 99123-4378");
		Tecnico t7 = new Tecnico(null, "Bruce Wayne", "390.289.900-03", "(21) 99123-7178");
		Tecnico t8 = new Tecnico(null, "João Pontes", "409.088.350-43", "(12) 99123-1278");

		Cliente c1 = new Cliente(null, "Betina Campos", "286.970.210-81", "(55) 98877-9955");
		Cliente c2 = new Cliente(null, "José Bento Sales", "063.343.980-08", "(55) 98877-7855");
		Cliente c3 = new Cliente(null, "Eduardo Amorim", "116.183.470-20", "(55) 98877-1155");
		Cliente c4 = new Cliente(null, "Michele Ambrosio", "155.398.180-40", "(55) 98877-1555");
		Cliente c5 = new Cliente(null, "Raquel Yamanaka", "875.155.080-60", "(55) 98877-2355");
		Cliente c6 = new Cliente(null, "Roberto Almeida", "706.153.960-70", "(55) 98877-5655");
		Cliente c7 = new Cliente(null, "Junior Brand", "504.161.040-10", "(55) 98877-2255");
		Cliente c8 = new Cliente(null, "Joshua Schilace", "083.162.490-65", "(55) 98987-7255");

		OS os1 = new OS(null, Prioridade.ALTA, "Trocar fonte do notebook", Status.ABERTO, t1, c1);
		OS os2 = new OS(null, Prioridade.MEDIA, "Formatar computador", Status.ANDAMENTO, t2, c2);
		OS os3 = new OS(null, Prioridade.ALTA, "Pintar paredes externas", Status.ABERTO, t3, c3);
		OS os4 = new OS(null, Prioridade.BAIXA, "Cortar a grama", Status.ANDAMENTO, t4, c4);
		OS os5 = new OS(null, Prioridade.ALTA, "Montar um computador", Status.ABERTO, t5, c5);
		OS os6 = new OS(null, Prioridade.BAIXA, "Trocar resistência do chuveiro", Status.ENCERRADO, t6, c6);
		OS os7 = new OS(null, Prioridade.MEDIA, "Fazer mudança", Status.ANDAMENTO, t7, c7);
		OS os8 = new OS(null, Prioridade.ALTA, "Instalar televisor", Status.ENCERRADO, t8, c8);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8));
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8));
		osRepository.saveAll(Arrays.asList(os1, os2, os3, os4, os5, os6, os7, os8));
	}

}
