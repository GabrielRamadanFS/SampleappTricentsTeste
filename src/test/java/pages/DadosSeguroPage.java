package pages;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class DadosSeguroPage extends Drivers {
	Elementos el = new Elementos();
	Metodos metodo = new Metodos();

	public void preencherDadosSeguro(String firstname, String lastName, String DateofBirth, String Gender,
			String country, String zipcode, String Occupation, String hobbies) {

		metodo.escrever(el.firstname, firstname);
		metodo.escrever(el.lastname, lastName);
		metodo.escrever(el.birthdate, DateofBirth);
		if (Gender.equalsIgnoreCase("masculino")) {
			metodo.clicar(el.gendermale);
		} else {
			metodo.clicar(el.genderfemale);
		}
		metodo.escrever(el.country, country);
		metodo.escrever(el.zipcode, zipcode);
		metodo.escrever(el.occupation, Occupation);

		if (hobbies.equalsIgnoreCase("Speeding")) {
			metodo.clicar(el.speeding);
		} else if (hobbies.equalsIgnoreCase("Bungee")) {
			metodo.clicar(el.bungeejumping);
		} else if (hobbies.equalsIgnoreCase("Cliff")) {
			metodo.clicar(el.cliffdiving);
		} else if (hobbies.equalsIgnoreCase("Skydiving")) {
			metodo.clicar(el.skydiving);
		} else {
			metodo.clicar(el.other);
		}
		metodo.clicar(el.nextenterproductdata);
	}
}
