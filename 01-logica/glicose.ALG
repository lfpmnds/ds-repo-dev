Algoritmo "glicose"


Var

   glicose : real

Inicio

   escreva("Digite a medida da glicose (mg/dl): ")
   leia(glicose)
   
   se glicose <= 100.0 entao
      escreval("Classificação: NORMAL")
   senao
      se glicose >= 140.0 entao
         escreval("Classificação: DIABETES")
      senao
         escreval("Classificação: ELEVADO")
      fimse
   fimse

Fimalgoritmo