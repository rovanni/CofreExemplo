# language: pt
@destravarCofreSteps
Funcionalidade: Destravar Cofre
  Como um usuario
  eu quero abrir um cofre destravando 
  para guardar pertences valiosos

  Cenário: limpar display
    Dado digito o numero 1
    E digito o numero 2
    Quando pressione o botao clear
    Então o display mostra a mensagem ""

  Cenário: porta aberta
    Dado que digite um numero 1 com a porta aberta
    Quando a porta estiver aberta
    Então o display deve mostrar a mensagem "Feche a porta antes de digitar a senha"

  Cenário: digitar um numero com a porta fechada
    Dado que eu entrei com o numero 0 com a porta fechada
    Quando eu olhar para o display
    Então o display deve mostrar a mensagem "0"

  Cenário: gravar senha valida porta fechada destravada
    Dado que eu entrei com o numero 6
    E digito o numero 5
    E digito mais um numero 4
    E digito outro numero 3
    E digito também numero 2
    E digito mais outro numero 1
    Quando e pressione o botao ok
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

    Cenário: abrir a porta e digitar 
    Dado abrir a porta e digitar o numero 7
    Quando verifico o display para ver a mensagem "Feche a porta antes de digitar a senha"
    Dado fechar a porta e digitar o numero 7
    Quando olho para o display ele mostrará a mensagem "7"
