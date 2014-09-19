package br.ufg.cs.brunonogueira.services;

import java.util.ArrayList;
import java.util.List;

import br.ufg.cs.brunonogueira.objetosNegocio.Aluguel;
import br.ufg.cs.brunonogueira.objetosNegocio.Cliente;
import br.ufg.cs.brunonogueira.objetosNegocio.Filme;

public class ServicesCliente {
	
	private static List<Cliente> clientes;
	private static List<Filme> filmes;
	
	public ServicesCliente() {
		clientes = new ArrayList<Cliente>();
		filmes = new ArrayList<Filme>();
	}
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Cliente getCliente() {
		return clientes.get( (int) ((Math.random() * 1000)  % clientes.size()) );
	}
	
	public void cadastrarFilme(Filme filme) {
		filmes.add(filme);
	}
	public Filme getFilme() {
		return filmes.get( (int) ((Math.random() * 1000)  % filmes.size()) );
	}
	
	public void ListarClientes() {
		for(Cliente atual : clientes) {
			System.out.println( atual.getNome() );
		}
	}
	
	public void ListarAlugueis() {
		for(Cliente atual : clientes) {
			System.out.println(atual.exibirRegistroAlugueis());
			System.out.printf("\n\n");
		}
	}
	
	public void ListarFilmes() {
		for(Filme atual : filmes) {
			System.out.println( atual.getTitulo() + " " + atual.calculaPrecoFilme() );
		}
	}
	
	public void AlugarFilme(Cliente cliente, Filme filme) {
		int random = (int) ( (Math.random() * 10 ) % 5);
		Aluguel aluguel = new Aluguel(filme, random);
		
		cliente.addAluguel(aluguel);
	}
	
}
