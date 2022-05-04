Algoritmo "diagonal_negativos"

Var

   n, i, j, negativos : inteiro
   mat : vetor [0..9, 0..9] de inteiro
   

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i,j])
      fimpara
   fimpara
   
   escreval
   escreval("DIAGONAL PRINCIPAL:")
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         se i = j entao
            escreva(mat[i,j], " ")
         fimse
      fimpara
   fimpara
   
   escreval
   escreval
   negativos <- 0
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         se mat[i,j] < 0 entao
            negativos <- negativos + 1
         fimse
      fimpara
   fimpara
   
   se negativos > 0 entao
      escreva("QUANTIDADE DE NEGATIVOS = ", negativos)
   senao
      escreva("MATRIZ NÃO POSSUI NEGATIVOS")
   fimse

Fimalgoritmo