package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Elementos Page Dados do Veiculo
	public By make = By.id("make");
	public By engineperformance = By.id("engineperformance");
	public By dateofmanufacture = By.id("dateofmanufacture");
	public By numberofseats = By.id("numberofseats");
	public By fuel = By.id("fuel");
	public By listprice = By.id("listprice");
	public By annualmileage = By.id("annualmileage");
	public By nextenterinsurantdata = By.id("nextenterinsurantdata");
	public By automobile = By.id("nav_automobile");

	// Elementos Dados do Seguro
	public By firstname = By.id("firstname");
	public By lastname = By.id("lastname");
	public By birthdate = By.id("birthdate");
	public By gendermale = By.xpath("//*[text()='Male']/span");
	public By genderfemale = By.xpath("//*[text()='Female']/span");
	public By country = By.id("country");
	public By zipcode = By.id("zipcode");
	public By occupation = By.id("occupation");
	public By speeding = By.xpath("//*[text()=' Speeding'/span");
	public By bungeejumping = By.xpath("//*[text()=' Bungee Jumping']/span");
	public By cliffdiving = By.xpath("//*[text()=' Cliff Diving']/span");
	public By skydiving = By.xpath("//*[text()=' Skydiving']/span");
	public By other = By.xpath("//*[text()=' Other']/span");
	public By nextenterproductdata = By.id("nextenterproductdata");

	// Elementos Dados de Produto

	public By startdate = By.id("startdate");
	public By insurancesum = By.id("insurancesum");
	public By meritrating = By.id("meritrating");
	public By damageinsurance = By.id("damageinsurance");
	public By europrotection = By.xpath("//*[text()='Euro Protection']");
	public By legaldefense = By.xpath("//*[text()='Legal Defense Insurance']");
	public By courtesycaryno = By.xpath("//*[text()=' No']");
	public By courtesycaryes = By.xpath("//*[text()=' Yes']");
	public By nextselectpriceoption = By.id("nextselectpriceoption");

	// Elementos Op��o de Pre�o

	public By selectsilver = By.xpath("//*[@id='selectsilver']");
	public By selectgold = By.xpath("//*[@id='selectgold']");
	public By selectplatinum = By.xpath("//*[@id='selectplatinum']");
	public By selectultimate = By.xpath("//*[@id='selectultimate']");
	public By nextsendquote = By.id("nextsendquote");
	
	// Elementos Valido Cotacao
	
	public By email = By.id("email");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confirmpassword = By.id("confirmpassword");
	public By sendemail = By.id("sendemail");
	public By BtnConfirm = By.xpath("//*[@class='confirm']");

}
