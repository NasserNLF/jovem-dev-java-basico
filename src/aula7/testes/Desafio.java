package aula7.testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula6.outros.Evento;
import aula6.outros.TipoEventoEnum;

class Desafio {
	
	private List<Evento> eventos = new ArrayList<>();
	
	@BeforeEach
	void setup() {
		eventos.add(new Evento("Natação", LocalDateTime.of(2020, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		eventos.add(new Evento("Festa", LocalDateTime.of(2025, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		eventos.add(new Evento("Aniversário", LocalDateTime.of(2026, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		eventos.add(new Evento("Apresentação", LocalDateTime.of(2026, 8, 6, 12, 0, 0), TipoEventoEnum.PROFISSIONAL));
		eventos.add(new Evento("Manifestação", LocalDateTime.of(2026, 8, 6, 12, 0, 0), TipoEventoEnum.OUTROS));
	}
	
	@AfterEach
	void fim() {
		eventos.clear();
	}

	@Test
	void testeEventoInvalido() {
		String evento = "teste";
		
		assertThrows(RuntimeException.class, () -> aula6.outros.Desafio.buscaTipoEvento(evento));
	}

}
