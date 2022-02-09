//2 - Aumento de Salário

/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
 
Salário	Percentual de Reajuste
0 - 400.00 -> 15%
400.01 - 800.00 -> 12%
800.01 - 1200.00 -> 10%
1200.01 - 2000.00 -> 7%
Acima de 2000.00 -> 4%
Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
*/

import java.util.*

fun main(args: Array<String>) {
   val input = Scanner(System.`in`)

   val salario = input.nextDouble()

val reajuste = when {
       salario <= 400 -> 15 
       salario <= 800 -> 12 
       salario <= 1200 -> 10 
       salario <= 2000 -> 7 
       else -> 4
   }

  //escreva o seu código nos espaços em branco 
 
val calculoReajuste = (salario * reajuste)/100
val novoSalario = salario + calculoReajuste

//System.out.printf("Novo Salario: ", novoSalario )
//System.out.printf( "Reajuste Ganho: ", reajusteGanho)

 //Podemos calcular neste formato  
  // println("Novo salario: %.2f".format(salario + (salario*reajuste)/100) )
 //  println("Reajuste ganho: %.2f".format((salario*reajuste)/100) )
 //  println("Em percentual: $reajuste %")
 
 //Ou neste formato
  println("Novo salario: %.2f".format(novoSalario) )
  println ("Reajuste ganho: %.2f".format(calculoReajuste) )
  println("Em percentual: $reajuste %")
 
}