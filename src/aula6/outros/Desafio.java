package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		List<Evento> lista = new ArrayList<Evento>();
		
		lista.add(new Evento("Natação", LocalDateTime.of(2020, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Festa", LocalDateTime.of(2025, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Aniversário", LocalDateTime.of(2026, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Apresentação", LocalDateTime.of(2026, 8, 6, 12, 0, 0), TipoEventoEnum.PROFISSIONAL));
		lista.add(new Evento("Manifestação", LocalDateTime.of(2026, 8, 6, 12, 0, 0), TipoEventoEnum.OUTROS));
		
		
		String evento = JOptionPane.showInputDialog("Digite o tipo de evento: ");
		
		TipoEventoEnum tipo = buscaTipoEvento(evento);
		
		Map<Boolean, List<Evento>> mapaEvento = formaMapa(lista, tipo);
		
		
		
		System.out.println("Eventos que já ocorreram");
		System.out.println(mapaEvento.get(true));
		
		System.out.println("Eventos que não ocorreram ainda: ");
		System.out.println(mapaEvento.get(false));
	}
	
	public static TipoEventoEnum buscaTipoEvento(String evento) {
		for(TipoEventoEnum t : TipoEventoEnum.values()) {
			if (t.name().equalsIgnoreCase(evento)) {
				return t;
			}
		}
		throw new IllegalArgumentException("Evento inválido!");
	}
	
	public static Map<Boolean, List<Evento>> formaMapa(List<Evento> eventos, TipoEventoEnum tipo){
		Map<Boolean, List<Evento>> mapa = eventos.stream().filter(e -> e.getTipoEvento().equals(tipo)).collect(Collectors.groupingBy(d -> d.getDataHora().isBefore(LocalDateTime.now())));
		
		if (mapa.isEmpty()) {
			throw new RuntimeException("Não há nenhum evento do tipo");
		}
		return mapa;
	}
}
