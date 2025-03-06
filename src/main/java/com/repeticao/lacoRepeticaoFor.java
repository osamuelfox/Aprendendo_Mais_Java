package com.repeticao;

public class lacoRepeticaoFor {

    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);

        }

        System.out.println("Joaozinho dormiu");


        /*break é encontrado dentro de um loop, o loop é terminado e a execução do programa continua a partir da
        primeira instrução após o loop.
        */

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // O loop será interrompido quando i for igual a 5
            }
            System.out.println(i);
        }
        System.out.println("Loop terminado.");

        /*  1
            2
            3
            4
            Loop terminado. */



        /*continue é encontrado dentro de um loop, o código após o continue não é executado para a iteração atual,
        e o loop passa para a próxima iteração*/

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula a iteração atual se i for par
            }
            System.out.println(i);
        }
        System.out.println("Loop terminado.");

        /*  1
            3
            5
            7
            9
            Loop terminado.  */

        /* Neste exemplo, o continue faz com que o loop pule a impressão dos números pares. Portanto, apenas os números ímpares são impressos. */
    }
}
