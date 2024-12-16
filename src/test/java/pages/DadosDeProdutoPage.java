package pages;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class DadosDeProdutoPage extends Drivers {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherDadosProduto(String startdate, String insurancesum, String meritrating, String damageinsurance,
			String Optional, String Courtesy) {

		metodo.escrever(el.startdate, startdate);
		metodo.escrever(el.insurancesum, insurancesum);
		metodo.escrever(el.meritrating, meritrating);
		metodo.escrever(el.damageinsurance, damageinsurance);
		if (Optional.equalsIgnoreCase("Euro Protection")) {
			metodo.clicar(el.europrotection);
		} else {
			metodo.clicar(el.legaldefense);
		}
		if (Courtesy.equalsIgnoreCase("No")) {
			metodo.clicar(el.courtesycaryno);
		} else {
			metodo.clicar(el.courtesycaryes);
		}
		metodo.clicar(el.nextselectpriceoption);
	}

}
