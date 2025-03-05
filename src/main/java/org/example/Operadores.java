package org.example;

public class Operadores {

    public static void main(String[] args) {
        int a , b;

        a = 5;
        b = 6;

        String resultado = "";

        if(a == b)
            resultado = "Verdadeiro";

        else
            resultado = "falso";

        System.out.println(resultado);

        //Operador ternario
        String outroResultado = a!=b ?"verdadeiro" : "falso";

        System.out.println(outroResultado);

        //Operacao com boolean

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        boolean maior = numero1 > numero2;

        System.out.println("O numero UM é igual a numero DOIS ? " + simNao);
        System.out.println("O numero UM é maior a numero DOIS ? " + maior);


    }
}
