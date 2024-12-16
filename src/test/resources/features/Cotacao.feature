#language:pt


@cotacaoSeguro
 Funcionalidade: Realizar cotação de seguro
Como usuario do site
Quero realizar cotação
Para obter os valores

Contexto: Acessar o site
Dado que eu acesso o site "https://sampleapp.tricentis.com/101/index.php"

Cenário: Cotação de Seguro
Quando acesso automobile e preencho dados do veiculo
E preencho dados do seguro
E preencho dados do produto
E seleciono a opção de preço
Então valido a cotação enviada
 