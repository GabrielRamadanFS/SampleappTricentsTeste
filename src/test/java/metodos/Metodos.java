package metodos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void clicarTratado(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Elemento clic�vel foi interceptado. Tentando for�ar o clique usando JavaScript...");

			WebElement webElement = driver.findElement(elemento);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
		} catch (NoSuchElementException e) {
			System.out.println("Elemento n�o encontrado: " + elemento);
		}
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	}

}
