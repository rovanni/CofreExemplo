# language: pt
@DestravarCofreSteps.java
Funcionalidade: Etapas para destravar Cofre
Ao hospedar no hotel recebo uma senha para utilizar o cofre,
eu quero destravar o cofre com a senha fornecida,
para guardar itens de valor.

  Cenário: teste inicialização
    Quando ao olhar para o display verifico a mensagem "Entre com a senha 6 digitos"
    Então verifico se a porta esta fechada

  Cenário: limpar display
    Dado digito o numero 1
    E digito o numero 2
    Quando pressionar o botao clear
    Então o display mostra a mensagem ""

 Esquema do Cenário: testar com a porta aberta
    Dado que digite um <numero> com a porta aberta
    Quando e pressionar o botao ok
    Então uma mensagem deve ser exibida no <display>
    Exemplos: 
      | numero  | display |
      | 0       | "Feche a porta antes de digitar a senha"  |
      | 1       | "Feche a porta antes de digitar a senha"  |
      | 2       | "Feche a porta antes de digitar a senha"  |
      | 3       | "Feche a porta antes de digitar a senha"  |
      | 4       | "Feche a porta antes de digitar a senha"  |
      | 5       | "Feche a porta antes de digitar a senha"  |
      | 6       | "Feche a porta antes de digitar a senha"  |
      | 7       | "Feche a porta antes de digitar a senha"  |
      | 8       | "Feche a porta antes de digitar a senha"  |
      | 9       | "Feche a porta antes de digitar a senha"  |

  Cenário: digitar um numero com a porta fechada
    Dado que eu entrei com o numero 0 com a porta fechada
    Quando olhar para o display verifico a mensagem "0"

  Cenário: gravar senha valida porta fechada destravada
    Dado que eu entrei com o numero 6
    E digito o numero 5
    E digito mais um numero 4
    E digito outro numero 3
    E digito também numero 2
    E digito mais outro numero 1
    Quando eu pressionar o botao ok
    Então o display deve mostrar a mensagem "Senha salva. Cofre trancado"

  Cenário: digitar senha com menos de seis digitos
    Dado que digito o numero 6 em um display vazio
    E também digito o numero 5
    Quando pressionar o botao ok
    Então o display mostrara a seguinte mensagem "Senha precisa de 6 digitos. Tente novamente"

    Cenário: digitar numeros porta fechada 
    Dado eu digito o numero 9
    E depois digito o numero 8
    Quando verificar o display ele mostrará a mensagem "98"

    Cenário: abrir a porta e digitar um numero e fechar a porta e digitar um numero
    Dado abrir a porta e digitar o numero 7
    Quando verifico o display para ver a mensagem "Feche a porta antes de digitar a senha"
    Dado fechar a porta e digitar o numero 7
    Quando olho para o display ele mostrará a mensagem "7"
