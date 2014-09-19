package br.ufg.cs.brunonogueira.objetosNegocio;

public class Aluguel {

	private static final double MULTA = 1.5;
	private Filme filme;
	private int diasAluguel;

	public Aluguel(Filme filme, int diasAluguel) {
		this.filme = filme;
		this.diasAluguel = diasAluguel;
	}

	public Filme getFilme() {
		return filme;
	}

	public int getDiasAluguel() {
		return diasAluguel;
	}

	public int calculaPonto() {
		int pontos = 0;

		// Adiciona um ponto
		pontos++;

		// B�nus para mais de dois dias com um lan�amento
		if (getFilme().calculaPrecoFilme() == Filme.LANCAMENTO
				&& getDiasAluguel() > 2)
			pontos++;

		return pontos;
	}

	// Crio um método que é específico para calcular o valor de cada aluguel do
	// cliente;
	// Esse método pode ser reaproveitado por outro método
	public double calculaValorAluguel(Aluguel aluguel) {

		double valor = 0;

		// Calcula o valor do aluguel
		switch (aluguel.getFilme().getFaixaPreco()) {
		case Filme.NORMAL:
			valor += getFilme().calculaPrecoFilme();
			if (aluguel.getDiasAluguel() > 3)
				valor += (aluguel.getDiasAluguel() - 3) * MULTA;
			break;

		case Filme.INFANTIL:
			valor += getFilme().calculaPrecoFilme();
			if (aluguel.getDiasAluguel() > 2)
				valor += (aluguel.getDiasAluguel() - 2) * MULTA;
			break;

		case Filme.LANCAMENTO:
			valor += aluguel.getDiasAluguel() * getFilme().calculaPrecoFilme();
			break;
		}

		return valor;
	}
}