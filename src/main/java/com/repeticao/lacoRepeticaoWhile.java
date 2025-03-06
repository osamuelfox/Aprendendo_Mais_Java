package com.repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class lacoRepeticaoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado a sacola, valor da mesada restante: "  + mesada);
            mesada = mesada - valorDoce;


        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces");

    }

    //Class para retornar um valor aleatorio
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }

}
