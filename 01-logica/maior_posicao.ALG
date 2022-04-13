Algoritmo "maior_posicao"

Var

   n, i, posicaoMaior : inteiro
   maior : real
   vet : vetor [0..99] de real

Inicio

   escreva("Quantos números você vai digitar? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreva("Digite um número: ")
      leia(vet[i])
   fimpara
   
   maior <- vet[0]
   posicaoMaior <- 0
   
   para i de 1 ate n-1 faca
      se vet[i] > maior entao
         maior <- vet[i]
         posicaoMaior <- i
      fimse
   fimpara

   escreval
   escreval("MAIOR VALOR = ", maior:4:2)
   escreval("POSIÇÃO DO MAIOR VALOR = ", posicaoMaior)
   


Fimalgoritmo