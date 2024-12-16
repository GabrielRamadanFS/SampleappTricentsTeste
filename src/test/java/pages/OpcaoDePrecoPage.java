package pages;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class OpcaoDePrecoPage extends Drivers {
	Elementos el = new Elementos();
	Metodos metodo = new Metodos();

	public void selecionarOpcao(String select) {

		if (select.equalsIgnoreCase("Silver")) {
			metodo.clicarTratado(el.selectsilver);
		} else if (select.equalsIgnoreCase("Gold")) {
			metodo.clicarTratado(el.selectgold);
		} else if (select.equalsIgnoreCase("Platinum")) {
			metodo.clicarTratado(el.selectplatinum);
		} else {
			metodo.clicarTratado(el.selectultimate);
		}
		metodo.aguardarElemento(el.nextsendquote);
		metodo.clicarTratado(el.nextsendquote);

	}

}
