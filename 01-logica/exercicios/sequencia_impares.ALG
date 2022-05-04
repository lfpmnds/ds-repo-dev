Algoritmo "sequencia_impares"

Var

   x, i, n : inteiro

Inicio

   escreva("Digite o valor de X: ")
   leia(x)
   
   se x % 2 = 0 entao
      n <- x - 1
   senao
      n <- x
   fimse

   para i de 1 ate n passo 2 faca
      escreval(i)
   fimpara
   
Fimalgoritmo