package pages;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class ValidoCotacaoPage extends Drivers {
	Elementos el = new Elementos();
	Metodos metodo = new Metodos();

	public void preencherValidoCotacao(String email, String username, String password, String confirmpassword) {

		metodo.escrever(el.email, email);
		metodo.escrever(el.username, username);
		metodo.escrever(el.password, password);
		metodo.escrever(el.confirmpassword, confirmpassword);
		metodo.clicar(el.sendemail);
		metodo.aguardarElemento(el.BtnConfirm);
		metodo.clicar(el.BtnConfirm);
	}

}
