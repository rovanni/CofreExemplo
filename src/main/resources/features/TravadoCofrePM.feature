# language: pt
@TravadoCofrePM_Steps.java
Funcionalidade: destravar Cofre para retirar itens
Eu quero destravar o cofre com a senha utilizada
para retirar os itens guardados.

    Cenário: testar digitar senha invalida
        Dado que digite um 1 2 3 4 6 6 com a porta fechada e travada
        Quando eu clico no botao ok
        Então é exibida a mensagem "senha errada. Tente novamente"

    Cenário: testar digitar uma senha com menos de seis digitos
        Dado que pressiono o numero 1 
        Quando verifico o que foi digitado no display e vejo "1"
        Quando aperto o botao ok
        Então o display exibi a seguinte mensagem "senha errada. Tente novamente"
        Dado que digito o numero 1 e 1
        Quando verifico o que esta sendo exibido no display e vejo "11"
        Quando clicar no botao ok
        Então será exibi a seguinte mensagem "senha errada. Tente novamente"

    Cenário: teste digitar senha válida
        Dado que informe a senha 1 2 3 4 5 6 com a porta fechada e travada
        Quando pressionar o botão ok
        Então será exibida a mensagem "senha correta. Cofre aberto" e a porta vai abrir