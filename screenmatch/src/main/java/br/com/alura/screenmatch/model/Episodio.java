package br.com.alura.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
	private Integer temporada;
	private String titulo;
	private Integer numeroEpisodio;
	private Double avaliacao;
	private LocalDate dataDeLancamento;
	
	
	
	public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
		this.temporada = numeroTemporada;
		titulo = dadosEpisodio.titulo();
		numeroEpisodio = dadosEpisodio.numero();
		try {
			avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
		} catch (Exception e) {
			avaliacao = 0.0;
		}
		
		try {
			dataDeLancamento = LocalDate.parse(dadosEpisodio.dataDeLancamento());
		} catch (DateTimeParseException e) {
			dataDeLancamento = null;
		}
	}
	
	public Integer getTemporada() {
		return temporada;
	}
	public void setTemporada(Integer temporada) {
		this.temporada = temporada;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getNumeroEpisodio() {
		return numeroEpisodio;
	}
	public void setNumeroEpisodio(Integer numeroEpisodio) {
		this.numeroEpisodio = numeroEpisodio;
	}
	public Double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public LocalDate getDataDeLancamento() {
		return dataDeLancamento;
	}
	public void setDataDeLancamento(LocalDate dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	@Override
	public String toString() {
		return "temporada=" + temporada + ", titulo=" + titulo + ", numeroEpisodio=" + numeroEpisodio
				+ ", avaliacao=" + avaliacao + ", dataDeLancamento=" + dataDeLancamento;
	}
	
	
	
}
