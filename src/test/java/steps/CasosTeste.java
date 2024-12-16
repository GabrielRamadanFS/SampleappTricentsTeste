package steps;

import drivers.Drivers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import navegadores.Navegadores;
import pages.DadosDeProdutoPage;
import pages.DadosSeguroPage;
import pages.DadosVeiculoPage;
import pages.OpcaoDePrecoPage;
import pages.ValidoCotacaoPage;

public class CasosTeste extends Drivers {

	DadosVeiculoPage dadosVeiculos = new DadosVeiculoPage();
	DadosSeguroPage dadosSeguro = new DadosSeguroPage();
	DadosDeProdutoPage dadosProduto = new DadosDeProdutoPage();
	OpcaoDePrecoPage opcaoPreco = new OpcaoDePrecoPage();
	ValidoCotacaoPage validoCotacao = new ValidoCotacaoPage();
	Navegadores navegadores = new Navegadores();

	@Dado("que eu acesso o site {string}")
	public void que_eu_acesso_o_site(String url) {
		navegadores.iniciarTeste(url);

	}

	@Quando("acesso automobile e preencho dados do veiculo")
	public void acesso_automobile_e_preencho_dados_do_veiculo() {
		dadosVeiculos.preencherDadosDoVeiculo("BMW", "1", "08/10/2024", "5", "Gas", "500", "100");

	}

	@Quando("preencho dados do seguro")
	public void preencho_dados_do_seguro() {
		dadosSeguro.preencherDadosSeguro("Gabriel", "Ramadan", "02/28/1996", "Masculino", "Brazil", "0000", "Farmer",
				"Other");

	}

	@Quando("preencho dados do produto")
	public void preencho_dados_do_produto() {
		dadosProduto.preencherDadosProduto("12/01/2025", " 3.000.000,00", "Super Bonus", "No Coverage",
				"Euro Protection", "No");

	}

	@Quando("seleciono a opção de preço")
	public void seleciono_a_opção_de_preço() {
		opcaoPreco.selecionarOpcao("select");

	}

	@Então("valido a cotação enviada")
	public void valido_a_cotação_enviada() {
		validoCotacao.preencherValidoCotacao("ramadan6991@gmail.com", "Gabriel1996", "123123Gg!", "123123Gg!");
		navegadores.encerrarTeste();

	}
	
	
		
}
	
