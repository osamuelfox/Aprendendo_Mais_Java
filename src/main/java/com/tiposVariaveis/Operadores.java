package com.tiposVariaveis;

public class Operadores {

    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        int a = 5;
        int b = 6;

        // Exemplo de uso do if-else para comparar valores
        String resultado;
        if (a == b) {
            resultado = "Verdadeiro"; // Se a for igual a b
        } else {
            resultado = "Falso"; // Se a não for igual a b
        }
        System.out.println("Resultado da comparação com if-else: " + resultado);

        // Exemplo de uso do operador ternário para comparar valores
        // O operador ternário é uma forma abreviada de escrever if-else
        String outroResultado = (a != b) ? "Verdadeiro" : "Falso";
        System.out.println("Resultado da comparação com operador ternário: " + outroResultado);

        // Exemplos de operações com booleanos
        int numero1 = 1;
        int numero2 = 2;

        // Comparação de igualdade
        boolean saoIguais = (numero1 == numero2);
        System.out.println("O número UM é igual ao número DOIS? " + saoIguais);

        // Comparação de maior que
        boolean ehMaior = (numero1 > numero2);
        System.out.println("O número UM é maior que o número DOIS? " + ehMaior);

        // Comparação de menor que
        boolean ehMenor = (numero1 < numero2);
        System.out.println("O número UM é menor que o número DOIS? " + ehMenor);

        // Comparação de diferente
        boolean saoDiferentes = (numero1 != numero2);
        System.out.println("O número UM é diferente do número DOIS? " + saoDiferentes);
    }
}
