package aula5.anotacoes;

import java.time.LocalDateTime;
import java.util.Optional;

public class TesteOptional {
	public static void main(String[] args) {
		new TesteOptional();
	}

	public TesteOptional() {
		String s = getString();

		// Ajuda a identificar valores nulos
		Optional<String> optS = Optional.ofNullable(s);

//		//Sem Supllier
//		System.out.println(optS.orElse("Não foi possível retornar resultado"));

//		//Com Supllier
//		System.out.println(optS.orElseGet(this::getValorPadrao));

		// Throw
		System.out.println(optS.orElseThrow(() -> new IllegalArgumentException("Valor incorreto")));

	}

	private String getString() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}

	// Para o supllier
//	private String getValorPadrao() {
//		System.out.println("ENTROU NO MÉTODO GETVALORPADRÃO");
//		return "Não foi possível";
//	}
}
