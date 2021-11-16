package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoRepository;

@Controller

public class EventosController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/eventos/formEvento")
	public String form() {
		return "eventoss/formEvento";
	}
	
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		System.out.println(evento);
		er.save(evento);
		return "eventoss/evento-adicionado";
	}
}
