package com.tiposVariaveis;

public class BoletimEscolar {

    public static void main(String[] args) {
        int mediaFinal = 6;

        if (mediaFinal < 0 || mediaFinal > 10) {
            System.out.println("Média inválida!");
        } else if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Prova minerva");
        } else {
            System.out.println("Aprovado");
        }
    }
}
