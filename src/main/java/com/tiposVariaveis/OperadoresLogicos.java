package com.tiposVariaveis;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // Definindo duas variáveis booleanas para exemplificar os operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operador Lógico E (&&)
        // O operador && (E) retorna verdadeiro apenas se AMBAS as condições forem verdadeiras.
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("Pelo menos uma das condições é falsa (Operador &&)");
        }

        // Operador Lógico OU (||)
        // O operador || (OU) retorna verdadeiro se PELO MENOS UMA das condições for verdadeira.
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira (Operador ||)");
        } else {
            System.out.println("Nenhuma das condições é verdadeira");
        }

        // Operador Lógico NÃO (!)
        // O operador ! (NÃO) inverte o valor de uma condição booleana.
        if (!condicao2) {
            System.out.println("A condição 2 é falsa, mas foi invertida para verdadeira (Operador !)");
        }

        // Exemplo combinando operadores
        if ((condicao1 && condicao2) || (!condicao1 && condicao2)) {
            System.out.println("Combinação complexa de condições");
        } else {
            System.out.println("Combinação complexa não foi atendida");
        }

        System.out.println("Fim do programa");
    }
}
