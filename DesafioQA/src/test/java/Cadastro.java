import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Cadastro {
    private WebDriver driver;
	
	@Dado("que estou na página de início")
	public void queEstounaPáginadeInício() {
		System.setProperty("webdriver.chrome.driver", "D:\\Weslley Lucas\\Documents\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://54.166.20.145:9080/desafioqa");
		driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
	}
	
	@Quando("aperto o botão clientes")
	public void apertoObotãoClientes(String string) {
		driver.get("http://54.166.20.145:9080//desafioqa//incluirCliente");
	}

	@Quando("deixo de preencher qualquer campo marcado com {string}")
	public void deixoDepreencherQualquercampoMarcadocom(String string) {
	    
	}

	@Então("deve retornar mensagem de erro {string}")
	public void deveRetornarmensagemDeerro(String string) {
	    
	}

	@Quando("preencho todos os campos marcados com {string}")
	public void preenchoTodososCamposmarcadosCom(String string) {
	    
	}

	@Então("deve retornar mensagem {string}")
	public void deveRetornarmensagem(String string) {
	    
	}
}
