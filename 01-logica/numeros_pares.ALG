Algoritmo "numeros_pares"

Var

   n, i, quantidade : inteiro
   numeros : vetor [0..9] de inteiro

Inicio

   escreva("Quantos números você vai digitar? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreva("Digite um número: ")
      leia(numeros[i])
   fimpara

   quantidade <- 0
   escreval
   escreval("Números pares: ")
   para i de 0 ate n-1 faca
      se numeros[i] % 2 = 0 entao
         escreva(numeros[i], " ")
         quantidade <- quantidade + 1
      fimse
   fimpara
   
   escreval
   escreval
   escreval("Quantidade de pares = ", quantidade)

Fimalgoritmo