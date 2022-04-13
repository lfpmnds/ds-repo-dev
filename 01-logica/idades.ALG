Algoritmo "idades"

Var

   idade1, idade2 : inteiro
   nome1, nome2 : caractere
   media : real

Inicio

   escreval("Dados da Pessoa 1:")
   escreva("Nome: ")
   leia(nome1)
   escreva("Idade: ")
   leia(idade1)
   
   escreval
   escreval("Dados da Pessoa 2:")
   escreva("Nome: ")
   leia(nome2)
   escreva("Idade: ")
   leia(idade2)
   
   media <- (idade1 + idade2) / 2
   
   escreval("A média da idade de ", nome1, " e ", nome2, " é de", media, " anos.")

Fimalgoritmo