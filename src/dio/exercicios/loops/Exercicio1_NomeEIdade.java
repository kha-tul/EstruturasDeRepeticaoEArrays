package dio.exercicios.loops;

/*
Faça um programa que leia conjuntos de dois valores, o primeiro representando um aluno e
o segundo representando sua idade
(Pare o programa inserindo o valor 0 no campo do nome)
 */

import java.util.Scanner;

public class Exercicio1_NomeEIdade {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); //para ler um valor, q é o passo 1, é necessário criar a captura pelo teclado com a classe Scanner

       //"o primeiro representando um aluno e o segundo representando sua idade"
        String nome; //primeiro é o nome;
        int idade; //segundo idade, conforme solicitado no problema;

        // * System.out.println("Nome: ");
        //o problema solicita que LEIA dois valores. para ler, é necessário atribuir o valor digitado, desta forma:
       // * nome = scan.next(); // esse método captura o nome digitado
        // * System.out.println("Idade: ");
        // idade = scan.nextInt(); //captura idade digitada; utiliza o 'nextInt' pois é um numero (inteiro)

        //após a captura dos dados digitados, o problema solicita que o programa fique em execução, repetidas vezes
        //até ser digitado 0. para repetir é necessário laço de repetição. então, o que foi digitado acima,
        //seré envolto em um laço:

        while(true) { //true para repeticao
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break; //o problema solicita que o programa pare quando adicionado o 0 no campo nome,
            // então é adicionado o break aqui, saindo do laço.
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        //aqui é quando sai do laço:

        System.out.println("Continua aqui... ");



        //o problema solicita que o programa pare quando adicionado o 0 no campo nome, então:

    }

}
