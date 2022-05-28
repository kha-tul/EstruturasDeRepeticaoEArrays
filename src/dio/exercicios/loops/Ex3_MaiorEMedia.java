package dio.exercicios.loops;
/*
Faça um programa que leia 5 números e
informe o maior numero
e a media desses numeros.
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        //1º: conforme solicitado, é necessário criar um laço que leia 5 números:
        Scanner scan = new Scanner(System.in);
        //2º: Vamos criar a váriavel numero:
        int numero;
        int maior = 0;
        int soma = 0;
        //3º: vamos solicitar esse número:
        //* System.out.println("Numero: ");
        //4º: vamos atribuir a variavl numero ao que foi digitado no Scanner:
        //* numero = scan.nextInt(); //nextInt pois é um inteiro
        //5º: o problema solicita que seja solicitado 5 VEZES esse número, é necessário colocar o
        //System.out e numero=scan dentro do laço :
        //6º: Como é possível saber que foi solicitado 5x? É necessário uma variavél de conte as repetições
        //e como ela é antes do laço, ela começará com zero!
        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            count = count + 1; //7º: aqui chamamos a variável responsável pela contagem e adicionamos o valor 1.
            //precisamos dessa variável para dizer ao laço quantas vezes ele deve ser repetido.
            System.out.println("Maior: " + maior); //aqui vamos repetir o maior número no console toda vez que for digitado.
        } while (count < 5); // 8º: precisamos informar quando a repetição irá parar. Por isso, informamos que a variável
        //count deve parar quando for < 5.

        //9º: o problema solicita que informe o "Maior número" digitado, e assim que faremos, criando a variável
        //"maior", que está acima. (int maior = 0;) ela começa com "0" pois ainda não há nenhum numero digitado!
        //Mas como saberemos se o número é maior?? Criamos um "if" dentro do laço, com a variável numero (que
        // é digitado no scanner, isso é, que é numero setado) for maior (>) que a variavél "maior", a partir desse
        // momento, a variável "maior" será a mesma que o número. Ou seja: if (numero > maior) maior = numero;

        //10º: agora, vamos imprimir o maior número no console:
        //** System.out.println("Maior: " + maior); //o número maior será armazenado na variável maior, no "if".
        //Mas, caso eu queira ver o número maior durante a execução do laço, basta adicionar o
        // 'System.out.println("Maior: " + maior)' dentro do laço.

        //11º: O problema também solicita a média dos números digitados (no Scanner). Então, criamos uma variável
        // "int soma", acima, na área dos atributos. A variável 'soma' deve ser inserida no laço de repetição,
        //e somando com a variável 'numero'. Por tanto, a variável soma, deve iniciar com o valor '0',
        //para somar somente os números que forem digitados.

        //12º: iremos imprimir a variável soma e adicionar a formula para que seja exibida média(soma/5) - já que
        //são 5 números digitados, soma / 5.

        System.out.println("Média: " + (soma/5));
    }
}
