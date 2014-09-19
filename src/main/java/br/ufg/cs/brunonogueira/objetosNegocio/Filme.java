package br.ufg.cs.brunonogueira.objetosNegocio;

public class Filme {

	public static final int NORMAL = 0;
	public static final int INFANTIL = 1;
	public static final int LANCAMENTO = 2;

	private String titulo;
	private int faixaPreco;

	public Filme(String titulo, int faixaPreco) {
		this.titulo = titulo;
		setFaixaPreco(faixaPreco);
	}

	public int getFaixaPreco() {
		return faixaPreco;
	}

	public void setFaixaPreco(int faixaPreco) {

		this.faixaPreco = 0;

		if (faixaPreco >= 0 && faixaPreco <= 2)
			this.faixaPreco = faixaPreco;

	}

	public String getTitulo() {
		return titulo;
	}

	// Esse método define e calcula o preco de cada filme por seu tipo
	public double calculaPrecoFilme() {

		double precoFilme = 0;

		switch (getFaixaPreco()) {
		case NORMAL:
			precoFilme = 1.5;
			break;
		case INFANTIL:
			precoFilme = 2;
			break;
		case LANCAMENTO:
			precoFilme = 3;
		}

		return precoFilme;
	}
}