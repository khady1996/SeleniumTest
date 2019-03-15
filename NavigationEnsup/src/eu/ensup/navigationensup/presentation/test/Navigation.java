package eu.ensup.navigationensup.presentation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public String baseUrl;
	public String actualTitle;

	public String openJavadoc() {

		// Permet de d�finir le driver qui sera utilis�
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Khady NDIAYE\\Documents\\ENSUP\\GTM\\Java\\chromedriver_win32\\chromedriver.exe");

		// Permet de cr�er une instance
		WebDriver driver = new ChromeDriver();

		// Permet de d�finir l'URL de base
		this.baseUrl = "https://www.google.com/";
		driver.get(baseUrl);

		this.actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		// Trouve sur la page web l'�l�ment dont le nom correspond en param�tre
		WebElement text = driver.findElement(By.name("q"));

		// Permet d'entrer une valeur dans l'�l�ment trouv� par le findElement
		text.sendKeys("javadoc assert\n");
		

		// Permet de trouver l'�l�ment correspondant � l'id en param�tre
		WebElement lien = driver.findElement(By.cssSelector(".g:nth-child(2) .LC20lb"));
		
		// On clique sur l'�l�ment trouv�
		lien.click();

		return actualTitle;
		
		// driver.close();
		
	}
}
