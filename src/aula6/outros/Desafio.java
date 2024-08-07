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
		
		String input = JOptionPane.showInputDialog("Digite um tipo de evento");
		TipoEventoEnum tipo = TipoEventoEnum.valueOf(input);
		
		Map<Boolean, List<Evento>> mapa = lista.stream().filter(e -> e.getTipoEvento().equals(tipo)).collect(Collectors.groupingBy(d -> d.getDataHora().isBefore(LocalDateTime.now())));
		
		System.out.println("Eventos que já ocorreram");
		System.out.println(mapa.get(true));
		
		System.out.println("Eventos que não ocorreram ainda: ");
		System.out.println(mapa.get(false));
		
		
		
	}
}
