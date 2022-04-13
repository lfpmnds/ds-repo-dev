Algoritmo "troco_verificado"


Var

   preco, precoFinal, recebido, troco : real
   quantidade : inteiro

Inicio

    escreva("Preço unitário do produto: ")
    leia(preco)
    escreva("Quantidade comprada: ")
    leia(quantidade)

    precoFinal <- preco * quantidade

    escreva("Dinheiro recebido: ")
    leia(recebido)
    
    se recebido > precoFinal entao
       troco <- recebido - precoFinal
       escreval("TROCO: R$ ", troco:6:2)

       senao
          troco <- precoFinal - recebido
          escreval("DINHEIRO INSUFICIENTE. FALTAM R$ ", troco:6:2)
    fimse

Fimalgoritmo