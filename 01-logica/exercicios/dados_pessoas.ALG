Algoritmo "dados_pessoas"

Var

   n, i, numeroM, numeroF : inteiro
   alturas : vetor [0..9] de real
   generos : vetor [0..9] de caractere
   somaF, mediaF, menor, maior : real

Inicio

   escreva("Quantas pessoas serão digitadas? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreva("Altura da ", i+1, "ª pessoa: ")
      leia(alturas[i])
      escreva("Gênero da ", i+1, "ª pessoa: ")
      leia(generos[i])
   fimpara
   
   menor <- alturas[0]
   para i de 1 ate n-1 faca
      se menor > alturas[i] entao
         menor <- alturas[i]
      fimse
   fimpara
   escreval("Menor altura = ", menor:4:2)
   
   maior <- alturas[0]
   para i de 1 ate n-1 faca
      se maior < alturas[i] entao
         maior <- alturas[i]
      fimse
   fimpara
   escreval("Maior altura = ", maior:4:2)
   
   somaF <- 0
   numeroF <- 0
   numeroM <- 0
   para i de 0 ate n-1 faca
      se generos[i] = "F" entao
         somaF <- somaF + alturas[i]
         numeroF <- numeroF + 1
      senao
         numeroM <- numeroM + 1
      fimse
   fimpara
   
   mediaF <- somaF / numeroF
   escreval("Média das alturas das mulheres = ", mediaF:4:2)
   escreval("Número de homens = ", numeroM)

Fimalgoritmo