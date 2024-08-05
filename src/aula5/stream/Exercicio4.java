package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<Pessoa>();
		// Criando as pessoa
		lista.add(new Pessoa("Nasser", "(30)30303030", LocalDate.parse("2004-12-07")));
		lista.add(new Pessoa("Ana", "(30)30303031", LocalDate.parse("2004-11-07")));
		lista.add(new Pessoa("João", "(30)30303032", LocalDate.parse("2004-10-07")));
		lista.add(new Pessoa("Nicolas", "(30)30303033", LocalDate.parse("2004-09-07")));
		lista.add(new Pessoa("Felipe", "(30)30303034", LocalDate.parse("2004-08-07")));
		lista.add(new Pessoa("Thiago", "(30)30303035", LocalDate.parse("2004-05-07")));
		lista.add(new Pessoa("Igor", "(30)30303036", LocalDate.parse("2004-05-07")));
		lista.add(new Pessoa("Nacim", "(30)30303037", LocalDate.parse("2004-05-07")));
		lista.add(new Pessoa("Patricia", "(30)30303038", LocalDate.parse("2004-01-07")));
		lista.add(new Pessoa("Messi", "(30)30303039", LocalDate.parse("2004-02-07")));

		lista.stream().filter(p -> p.getDataNasc().getMonthValue() == 5).map(Pessoa::getNome).sorted()
				.forEach(System.out::println);

	}
}
