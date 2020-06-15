package br.com.senai.fatesg.primafaces.testes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteSeleniumAreaDeLazer {

	@Test
	public void preencheFormularioCadastraoAreaLazer() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		        "C:/Users/Usuário/Desktop/Jorge/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  // Visita a página do Correios
		  driver.get("http://localhost:8081/primefaces/Arealazer.xhtml");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("j_username")).sendKeys("admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("j_password")).sendKeys("123456");
		  Thread.sleep(2000);
		  
		  WebElement buttonBuscar = driver.findElement(By.cssSelector("input[type='submit'"));
		  buttonBuscar.click();
		  
		  WebElement buttonCadastrar = driver.findElement(By.id("salv"));
		  buttonCadastrar.click();
		  
		  driver.findElement(By.name("nome")).sendKeys("Piscina 2");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("local")).sendKeys("Rua 10");
		  Thread.sleep(2000);
		  
		  WebElement buttonConfirma = driver.findElement(By.id("formulario:confirma"));
		  buttonConfirma.click();
		  
		  
		  Thread.sleep(2000);
		  driver.quit();
			} 
	
}

