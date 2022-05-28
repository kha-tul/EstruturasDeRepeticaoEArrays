package dio.exercicios.loops;
/*
Faça um programa que peça N números inteiros.
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        //1º: como é solicitado no problema a digitação de números, começamos com a classe Scanner para pedir
        //a digitação:
        Scanner scan = new Scanner(System.in);

        int quantNumeros; //2º criamos a variável para armazenar a quantidade de números solicitados, ou seja
        //aqui será definida a quantidade de vezes que o laço de repetição será executado.
        int numero;
        int quantPares = 0, quantImpares = 0;

        //3º imprimimos os números:
        System.out.println("Quantidade de números: "); //aqui perguntamos quantos números serão e por essa entrada
        //será determinada a quantidade de repetições.
        //4º: informo q a variavel deverá ser quantNumeros.
        quantNumeros = scan.nextInt();  //quantidade de repetições

        //5º Criar o laço de repetição. Esse laço irá pedir a quantidade de números inteiros, de acordo com a
        //quantidade de números informados, ou seja, digitados no scan.

        //6º é necessário criar uma variável que será responsável por contar as repetições. E como a quantidade
        //de repetições será decidida pela digitação no Scanner, a variável de contagem (cont) deverá começcar
        //com zero.

        int count = 0;
        do {
            System.out.println("Número: "); //aqui será a execução determinada pelo quantNumeros;
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++; //Quando iniciado o 'do', será solicitado o número,
                // se o resto desse número, dividido por 2 (numero % 2) for igual a zero ( ==0), significa que é
                //par. Então, quantPares++. Se eu pegar um número e dividir por dois, quer dizer que é um numero par.
            else quantImpares++; //caso a divisão por 2 do numero, for diferete de zero, é um numero impar.


            // count = count + 1; //Depois que executar o laço, o contador será count + 1, pq cada vez que faz o laço, somará
            //+ 1. Mas vamos usar a formula abaixo, que é igual, mas com operador diferente:
            count++;

        } while (count < quantNumeros); //count < quantNumeros pois a repetição ocorrerá de acordo com a quantidade de números informados
        //via console.
        //Aqui o laço será executado, perguntando se o contador (count) é menor que a quantidade de números(quantNumeros).

        //7º: Criamos uma variável "número" para atribuir a quantidade de números;

        //8º: o problema pede que contemos a quantidade de números pares e ímpares informados na varíavel 'numero'.
        //para isso, criaremos mais duas variáveis acima: quantPares e quantImpares. E informaremos que será = 0

        //9º: criaremos o if, no meio do laço de repetição, com a formúla para detecção de números pares e ímpares.

        //10º: Imprimir a quantidade de pares e impares:
        System.out.println("Quantidade de Pares: " + quantPares); //somo com a variavel pares;
        System.out.println("Quantidade de Impares: " + quantImpares); //somo com a variavel impares;

    }
}
