package dio.exercicios.loops;
/*
Faça um programa que peça uma nota, entre zero e 10.
Mostre a mensagem caso o valor seja invalido.
e continue pedindo até que o usuário informe um valor válido
 */

import java.util.Scanner;

public class Exercicio2_Nota {
    public static void main(String[] args) {
        //se é solicitado a digitacao de um valor pelo usuario, é necessario digitar a classe Scanner
        Scanner scan = new Scanner(System.in);
        //se é solicitada um nota entre 0 e 10, esse é um numero inteiro, então:
        int nota;
        //para qe possa ser digitada a nota é necessário imrpimir uma mensagem no console:
        System.out.println("Nota: ");
        //e vamos atribuit o valor digitado a varíavel nota, abaixo:
        nota = scan.nextInt(); //nextInt pq é um inteiro

        //se a nota for de 0 a 10, o programa não entrará no "while" abaixo, pois para que o while seja true
        //é necessário a nota ser menor que 0 ou maior que 10. Então, o programa será terminado sem usar o while.

        //o problema solicita que se for digitado um valor inválido, exiba uma mensagem:

        while(nota < 0 | nota > 10) { //(nota < 0 | nota > 10) = se a nota for menor que zero ou ("|") a nota for menor que 10
            System.out.println("Nota Inválida, digite novamente: ");
            //agora, vou pedir para digitar novamente:
            nota = scan.nextInt();
        }



    }
}
