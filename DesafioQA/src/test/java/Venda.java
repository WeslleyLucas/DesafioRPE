import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Venda {

private WebDriver driver;

	@Quando("seleciono o cliente")
	public void selecionoOCliente() {
	    driver.get("http://54.166.20.145:9080/desafioqa/incluirVenda");
	    driver.findElement(By.id("cliente")).sendKeys("jose");
	    
	}
	@Quando("preencho o valor da compra")
	public void preenchoOValorDaCompra() {
	    driver.findElement(By.id("valorTransação")).sendKeys("10");
	}
	@Quando("o valor da compra é igual ou menor que o saldo do cliente")
	public void oValorDaCompraÉIgualOuMenorQueOSaldoDoCliente() {
	    driver.findElement(By.id("botaoSalvar")).click();
	}
	@Então("a compra deve ser autorizada")
	public void aCompraDeveSerAutorizada() {
	    
	}



}
