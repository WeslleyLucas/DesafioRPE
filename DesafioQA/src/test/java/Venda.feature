# language: pt

Funcionalidade: Operação de Vendas

Cenário: Venda bem sucedida

  Dado que estou na página de início
  Quando aperto o botão "transações"
  E aperto o botão "incluir"
  E seleciono o cliente 
  E preencho o valor da compra
  E o valor da compra é igual ou menor que o saldo do cliente
  E aperto o botão "salvar"
  Então a compra deve ser autorizada 
