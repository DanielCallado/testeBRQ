@tag
Feature: Compra de produto
  
  @adicionandoProduto
  Scenario Outline: Adicionando produto ao carrinho
    Given que eu tenha acessado o sistema no <link>
    And tenha movimentado o mouse até o produto
    When clico no botão "Add to cart"
    And clico no botão "Proceed to checkout"
    Then que eu esteja no carrinho
    And o produto "Faded Short Sleeve T-shirts" esta no carrinho
    And clico no botão "Proceed to checkout >"    
    
    Examples:
    |link																			  |
    |"http://automationpractice.com/index.php?" |

  @tag2
  Scenario Outline: Cadastrando informações do Cliente
    Given que eu esteja no carrinho
    And esteja no "segundo" passo
    When preencho o campo "autenticacao" com "<e-mail>"
    And clico no botão "Create an account"
    And preencho o campo "primeiro nome" com "<primeiro nome>"
    And preencho o campo "ultimo nome" com "<ultimo nome>"    
    And preencho o campo "senha" com "<senha>"
    And preencho o campo "endereco" com "<endereco>"
    And preencho o campo "cidade" com "<cidade>"
    And seleciono o campo "estado" com "<estado>"
    And preencho o campo "cep" com "<cep>"
    And seleciono o campo "pais" com "<pais>"
    And preencho o campo "celular" com "<celular>"    
    Then clico no botão "Register"
    
    Examples:
    |e-mail  					 | primeiro nome | ultimo nome | senha      | primeiro nome endereco | ultimo nome endereco | endereco				 | cidade	   | estado     | cep   | pais 				  | celular   |
    |teste33@teste.com | Daniel        | Rodrigues   | 102030abcd | Daniel								 | Rodrigues					  | Rua aqui com ali | São Paulo | California |03809  | United States | 111234567 |	
  
  Scenario Outline: Validando endereço
    Given que eu esteja no carrinho
    And esteja no "terceiro" passo
    When valido se o "<endereco>", "<estado>", "<cep>", "<cidade>" e "<pais>" estão corretos
    Then clico no botão "Proceed to checkout >"
    
    Examples:
    | endereco				 | estado     | cep   | cidade     | pais				   |
		| Rua aqui com ali | California | 03809 | São Paulo  | United States |
		
  Scenario: Aceitando os termos de compromisso
    Given que eu esteja no carrinho
    And esteja no "quarto" passo
    When clico no botão "Eu aceito ..."
    Then clico no botão "Proceed to payment"

  Scenario Outline: Validando o valor total da compra
    Given que eu esteja no carrinho
    And esteja no "quinto" passo
    Then o valor total é "<total>", sendo a soma do valor do "<produto>" com o valor de "<envio>"
    
    Examples:
    | total  | produto | envio  |
    | $18.51 | $16.51  | $2.00  |

  Scenario: Selecionando o metodo de pagamento
    Given que eu esteja no carrinho
    And esteja no "quinto" passo
    When seleciono o metodo de pagamento
    And clico no botão "I confirm my order"
    Then verifico a mensagem "Your order on My Store is complete."