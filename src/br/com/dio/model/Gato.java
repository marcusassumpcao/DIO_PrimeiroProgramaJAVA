/**
 * 
 */
package br.com.dio.model;

/**
 * @author Marcus
 *
 */
public class Gato {
	private String nome;
	private String cor;
	private Integer idade;

	public Gato() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/*
	 * public Gato(String nome, String cor, Interger idade) { this.nome= nome;
	 * this.cor= cor; this.idade= idade; }
	 */
}