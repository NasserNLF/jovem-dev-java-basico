package aula6.outros;

import java.time.LocalDateTime;

public class Evento {
	private String descricao;
	private LocalDateTime dataHora;
	private TipoEventoEnum tipoEvento;
	
	public Evento(String descricao, LocalDateTime localDateTime, TipoEventoEnum tipoEvento) {
		this.descricao = descricao;
		this.dataHora = localDateTime;
		this.tipoEvento = tipoEvento;
	}

	@Override
	public String toString() {
		return "Evento [descricao=" + descricao + ", dataHora=" + dataHora + ", tipoEvento=" + tipoEvento + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}





	
}
