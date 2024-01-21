# language: pt
Funcionalidade: Fazer login na página "http://54.166.20.145:9080/desafioqa/"
 Como um usuário
 Quero acessar o site de vendas
 Para realizar uma compra

Cenário: Login com credenciais inválidas

  Dado que estou na página de login
  Quando eu preencho o campo "login" com usuário não cadastrado
  E preencho o campo "senha"
  E aperto o botão "sign in"
  Então deve ser exibida a mensagem "Credenciais Inválidas"

 Cenário: Login com credenciais válidas
 
  Dado que estou na tela de login
  Quando preendo o campo login com o usuário correto "admin"
  E preencho o campo "senha" com a senha correta "admin" 
  E aperto o botão "sign in" 
  Então devo ser direcionado para a tela de início
 
 