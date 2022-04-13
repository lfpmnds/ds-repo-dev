Algoritmo "terreno"

Var

   largura, comprimento, area, metroQuadrado, preco : real

Inicio

   escreva("Digite a largura do terreno (em metros): ")
   leia(largura)
   escreva("Digite o comprimento do terreno (em metros): ")
   leia(comprimento)
   escreva("Digite o valor do metro quadrado (em reais): ")
   leia(metroQuadrado)
   
   area <- largura * comprimento
   preco <- area * metroQuadrado
   
   escreval
   escreval("Área do terreno = ", area:8:2, " m²")
   escreval("Preço do terreno = ", preco:8:2, " reais")

Fimalgoritmo