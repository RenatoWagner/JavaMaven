package model;

import java.util.List;
import dao.ContatoDao;

public class TestaLista {

	public static void main(String[] args) throws ClassNotFoundException {
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			  System.out.println("Endereço: " + contato.getEndereco());
			  System.out.println("Data de Nascimento: " + 
			              contato.getDataNascimento().getTime() + "\n");
			  
		}
	}
}

