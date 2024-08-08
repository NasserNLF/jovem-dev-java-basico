package aula7.testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		eventos.add(new Evento("Festa", LocalDateTime.of(2020, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		eventos.add(new Evento("Aniversário", LocalDateTime.of(2020, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		eventos.add(new Evento("Passeio no Parque", LocalDateTime.of(2029, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
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

	@Test
	void testeEventoForaLista() {
		String evento = "Outros";
		// Removendo elemento da categoria OUTROS
		eventos.remove(5);

		assertThrows(RuntimeException.class,
				() -> aula6.outros.Desafio.formaMapa(eventos, aula6.outros.Desafio.buscaTipoEvento(evento)));

	}

	@Test
	void retornandoUmaCategoria() {
		String evento = "Lazer";

		// Eventos true - eventos antes da data atual
		// Eventos false - eventos depois da data atual

		// Removendo elemento da categoria LAZER false
		eventos.remove(3);

		TipoEventoEnum tipo = aula6.outros.Desafio.buscaTipoEvento(evento);
		Map<Boolean, List<Evento>> mapa = aula6.outros.Desafio.formaMapa(eventos, tipo);

		assertEquals(true, mapa.get(false) == null && mapa.get(true) != null);
	}

	@Test
	void retornandoAmbasCategorias() {
		String evento = "Lazer";

		// Eventos true - eventos antes da data atual
		// Eventos false - eventos depois da data atual

		TipoEventoEnum tipo = aula6.outros.Desafio.buscaTipoEvento(evento);
		Map<Boolean, List<Evento>> mapa = aula6.outros.Desafio.formaMapa(eventos, tipo);

		assertEquals(true, mapa.get(false) != null && mapa.get(true) != null);
	}

}
