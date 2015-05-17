package model;

import java.util.Calendar;

import dao.ContatoDao;

public class TestaInsere {

	public static void main(String[] args) throws ClassNotFoundException {
		Contato contato = new Contato();
		contato.setNome("Renato");
		contato.setEmail("renatowgnerx@gmail.com");
		contato.setEndereco("R. Joselita Reis Brasileiro");
		contato.setDataNascimento(Calendar.getInstance());

		 // grave nessa conex�o!!!

		 ContatoDao dao = new ContatoDao();

		 // m�todo elegante
		 dao.adiciona(contato);
		 
		 System.out.println("Gravado!");
		 
	}
}
