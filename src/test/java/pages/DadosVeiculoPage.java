package pages;

import elementos.Elementos;
import metodos.Metodos;


public class DadosVeiculoPage {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void preencherDadosDoVeiculo(String marca, String performance, String data, String nSeats, String fuel,
			String price, String mileage) {
		metodo.clicar(el.automobile);
		metodo.escrever(el.make, marca);
		metodo.escrever(el.engineperformance, performance);
		metodo.escrever(el.dateofmanufacture, data);
		metodo.escrever(el.numberofseats, nSeats);
		metodo.escrever(el.fuel, fuel);
		metodo.escrever(el.listprice, price);
		metodo.escrever(el.annualmileage, mileage);
		metodo.clicar(el.nextenterinsurantdata);
		
}
}
