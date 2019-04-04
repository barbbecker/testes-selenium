package com.barbbecker.fundatec.provatestes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera {

	private WebDriver driver = null;

	@Before
	public void preCondicao() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tecnico\\Desktop\\Barbara/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.coursera.org/");
	}

	@Test
	public void testandoBuscaDeCurso() {

		driver.findElement(By.xpath(
				"//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/input"))
				.click();
		driver.findElement(By.className("react-autosuggest__input")).sendKeys("Testes");
		driver.findElement(By.xpath(
				"//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/button[2]/div/svg"))
				.click();
	}

	@Test
	public void testandoCadastroNaPlataforma() {

		driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[5]/a")).click();
		System.out.println("Cliquei em inscrever-se");
		driver.findElement(By.id("nameInput_27-input")).sendKeys("Barbara Becker");
		System.out.println("Coloquei o nome");
		driver.findElement(By.id("emailInput_70-input")).sendKeys("beckinhaks@gmail.com");
		System.out.println("Coloquei o email");
		driver.findElement(By.id("passwordInput_131-input")).sendKeys("suahsuah122");
		System.out.println("Coloquei a senha");

		driver.findElement(
				By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div[1]/div[1]/form/div/button/span"))
				.click();
	}

	@Test
	public void testandoLoginComContaCadastrada() {

		driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[4]/a")).click();
		System.out.println("Cliquei em login");
		driver.findElement(By.id("emailInput_27-input")).sendKeys("beckinhaks@gmail.com");
		System.out.println("Coloquei o email");
		driver.findElement(By.id("passwordInput_68-input")).sendKeys("suahsuah122");
		System.out.println("Coloquei a senha");

		driver.findElement(
				By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div/div[1]/form/div[1]/button/span"))
				.click();
	}
}
