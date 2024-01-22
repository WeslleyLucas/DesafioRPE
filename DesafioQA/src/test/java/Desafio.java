import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Desafio {
    private WebDriver driver;
    
	@Dado("que estou na página de login")
	public void queEstounaPáginadeLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\Weslley Lucas\\Documents\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://54.166.20.145:9080/desafioqa");
	    
	}

	@Quando("eu preencho o campo {string} com usuário não cadastrado")
	public void euPreenchooCampocomUsuárionãoCadastrado(String string) {
		driver.findElement(By.tagName("input")).sendKeys("joao");
	}
	
	@Quando("preencho o campo {string}")
	public void preenchoOcampo(String string) {
	    driver.findElement(By.name("password")).sendKeys("123");
	}

	@Quando("aperto o botão {string}")
	public void apertoObotão(String string) {
	    driver.findElement(By.tagName("button")).click();
	}

	@Então("deve ser exibida a mensagem {string}")
	public void deveSerexibidaAmensagem(String string) {
	    	
	}
		
	@Dado("que estou na tela de login")
	public void queEstounaTeladeLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\Weslley Lucas\\Documents\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://54.166.20.145:9080/desafioqa");
	}

	@Quando("preencho o campo login com o usuário correto {string}")
	public void preenchoOcampoLogincomOusuárioCorreto(String string) {
		driver.findElement(By.tagName("input")).sendKeys("admin");
	}

	@Quando("preencho o campo {string} com a senha correta {string}")
	public void preenchoOcampoComaSenhacorreta(String string, String string2) {
		driver.findElement(By.name("password")).sendKeys("admin");
	}

	@Então("devo ser direcionado para a tela de início")
	public void devoSerdirecionadoParaaTeladeInício() {
	    
	}

}
