# language: pt

Funcionalidade: Cadastrar cliente

 Como servidor
 Quero preencher todos os campos
 Para cadastrar clientes

Cenário: Cadasto de cliente sem campos obrigatórios

  Dado que estou na página de início 
  Quando aperto o botão "clientes"
  E aperto o botão "incluir"
  E deixo de preencher qualquer campo marcado com "*"
  E aperto o botão "salvar"
  Então deve retornar mensagem de erro "Campo obrigatório"

Cenário: Cadastro bem sucedido

  Dado que estou na página de início
  Quando aperto o botão "clientes"
  E aperto o botão "incluir"
  E preencho todos os campos marcados com "*"
  E e aperto o botão "salvar"
  Então deve retornar mensagem "cliente salvo com sucesso"



