Algoritmo "alturas"

Var

   nome : vetor [0..9] de caractere
   idade : vetor [0..9] de inteiro
   altura : vetor [0..9] de real
   n, i, quantidade : inteiro
   somaAltura, media, menoresPorcentagem : real


Inicio

   escreva("Quantas pessoas serão digitadas? ")
   leia(n)

   para i de 0 ate n-1 faca
      escreval("Dados da ", i+1, "ª pessoa:")
      escreva("Nome: ")
      leia(nome[i])
      escreva("Idade: ")
      leia(idade[i])
      escreva("Altura: ")
      leia(altura[i])
   fimpara

   somaAltura <- 0
   para i de 0 ate n-1 faca
      somaAltura <- somaAltura + altura[i]
   fimpara
   
   media <- somaAltura / n
   escreval
   escreval("Altura média = ", media:4:2)
   
   quantidade <- 0
   para i de 0 ate n-1 faca
      se idade[i] < 16 entao
         quantidade <- quantidade + 1
      fimse
   fimpara
   
   menoresPorcentagem <- quantidade / n * 100
   escreval("Pessoas com menos de 16 anos: ", menoresPorcentagem:4:2, "%")
   
   para i de 0 ate n-1 faca
      se idade[i] < 16 entao
         escreval(nome[i])
      fimse
   fimpara
   
   

Fimalgoritmo