Algoritmo "comerciante"

Var

   n, i, abaixo, entre, acima : inteiro
   produtos : vetor [0..9] de caractere
   compras, vendas, diferenca : vetor [0..9] de real
   somaCompras, somaVendas, lucroTotal : real

Inicio
   escreva("Serão digitados quantos produtos? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreval("Produto ", i+1, ":")
      escreva("Nome: ")
      leia(produtos[i])
      escreva("Preço de compra: ")
      leia(compras[i])
      escreva("Preço de venda: ")
      leia(vendas[i])
   fimpara
   escreval
   escreval("RELATÓRIO:")
   
   abaixo <- 0
   entre <- 0
   acima <- 0
   
   para i de 0 ate n-1 faca
      diferenca[i] <- vendas[i] - compras[i]
      se diferenca[i] < vendas[i] / 100 * 10 entao
         abaixo <- abaixo + 1
      senao
         se diferenca[i] > vendas[i] / 100 * 20 entao
            acima <- acima + 1
         senao
            entre <- entre + 1
         fimse
      fimse
   fimpara

   escreval("Lucro abaixo de 10%: ", abaixo)
   escreval("Lucro entre 10% e 20%: ", entre)
   escreval("Lucro acima de 20%: ", acima)
   
   somaCompras <- 0
   somaVendas <- 0
   
   para i de 0 ate n-1 faca
      somaCompras <- somaCompras + compras[i]
      somaVendas <- somaVendas + vendas[i]
   fimpara

   lucroTotal <- somaVendas - somaCompras
   
   escreval("Valor total de compra: ", somaCompras:4:2)
   escreval("Valor total de venda: ", somaVendas:4:2)
   escreval("Lucro total: ", lucroTotal:4:2)
   

Fimalgoritmo