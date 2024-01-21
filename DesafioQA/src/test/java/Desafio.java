import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Desafio {

	@Dado("que estou na página de login")
	public void que_estou_na_página_de_login() {
	    
	}

	@Quando("eu preencho o campo {string} com usuário não cadastrado")
	public void eu_preencho_o_campo_com_usuário_não_cadastrado(String string) {
	    
	}
	
	@Quando("preencho o campo {string}")
	public void preencho_o_campo(String string) {
	    
	}

	@Quando("aperto o botão {string}")
	public void aperto_o_botão(String string) {
	    
	}

	@Então("deve ser exibida a mensagem {string}")
	public void deve_ser_exibida_a_mensagem(String string) {
	    
	}
	
	@Dado("que estou na tela de login")
	public void que_estou_na_tela_de_login() {
	    
	}

	@Quando("preendo o campo login com o usuário correto {string}")
	public void preendo_o_campo_login_com_o_usuário_correto(String string) {
	    
	}

	@Quando("preencho o campo {string} com a senha correta {string}")
	public void preencho_o_campo_com_a_senha_correta(String string, String string2) {
	    
	}

	@Então("devo ser direcionado para a tela de início")
	public void devo_ser_direcionado_para_a_tela_de_início() {
	    
	}

	@Dado("que estou na página de início")
	public void que_estou_na_página_de_início() {
	    
	}

	@Quando("deixo de preencher qualquer campo marcado com {string}")
	public void deixo_de_preencher_qualquer_campo_marcado_com(String string) {
	    
	}

	@Então("deve retornar mensagem de erro {string}")
	public void deve_retornar_mensagem_de_erro(String string) {
	    
	}

	@Quando("preencho todos os campos marcados com {string}")
	public void preencho_todos_os_campos_marcados_com(String string) {
	    
	}

	@Quando("e aperto o botão {string}")
	public void e_aperto_o_botão(String string) {
	    
	}

	@Então("deve retornar mensagem {string}")
	public void deve_retornar_mensagem(String string) {
	    
	}

	@Quando("seleciono o cliente")
	public void seleciono_o_cliente() {
	    
	}

	@Quando("preencho o valor da compra")
	public void preencho_o_valor_da_compra() {
	    
	}

	@Quando("o valor da compra é igual ou menor que o saldo do cliente")
	public void o_valor_da_compra_é_igual_ou_menor_que_o_saldo_do_cliente() {
	    
	}

	@Então("a compra deve ser autorizada")
	public void a_compra_deve_ser_autorizada() {
	    
	}
}
