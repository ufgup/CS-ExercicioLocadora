package br.ufg.cs.brunonogueira.services;

import br.ufg.cs.brunonogueira.objetosNegocio.Cliente;
import br.ufg.cs.brunonogueira.objetosNegocio.Filme;

public class TesteDrive {

	public static void main(String[] args) {
		
		ServicesCliente service = new ServicesCliente();
		
		service.cadastrarCliente( createCliente("Bruno") );
		service.cadastrarCliente( createCliente("Daniel") );
		service.cadastrarCliente( createCliente("Ana Letícia") );
		service.cadastrarCliente( createCliente("Eduardo") );
		service.cadastrarCliente( createCliente("Jessica") );
		
		service.cadastrarFilme(createFilme("Poderoso chefão", 0));
		service.cadastrarFilme(createFilme("Rei Leão", 1));
		service.cadastrarFilme(createFilme("Homem de Ferro", 2));
		
		service.ListarClientes();
		service.ListarFilmes();
		
		for(int i = 0; i < 20; i++) {
			service.AlugarFilme(service.getCliente(), service.getFilme());
		}
		
		service.ListarAlugueis();

	}
	
	private static Cliente createCliente(String nome) {
		return new Cliente(nome);
	}
	
	private static Filme createFilme(String titulo, int faixaPreco) {
		return new Filme(titulo, faixaPreco);
	}

}
