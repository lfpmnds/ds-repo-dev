Algoritmo "par_impar"

Var

   n, i, x : inteiro

Inicio

   escreva("Quantos n�meros voc� vai digitar? ")
   leia(n)
   
   para i de 1 ate n faca
      escreva("Digite um n�mero: ")
      leia(x)
      
      se (x % 2 <> 0) e (x > 0) entao
         escreval("�MPAR POSITIVO")
      senao
         se (x % 2 <> 0) e (x < 0) entao
            escreval("�MPAR NEGATIVO")
         senao
            se (x % 2 = 0) e (x > 0) entao
               escreval("PAR POSITIVO")
            senao
               se (x % 2 = 0) e (x < 0) entao
                  escreval("PAR NEGATIVO")
               senao
                  escreval("NULO")
               fimse
            fimse
         fimse
      fimse
   fimpara

Fimalgoritmo