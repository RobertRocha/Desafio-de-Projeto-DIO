package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	 //protected = pode ser acessado por herança ou se estiver no mesmo pacote --- final = referente a constante
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	//abstract = não é possível instanciar(criar) um conteudo na classe main. está sendo criado para usar de herança.
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
