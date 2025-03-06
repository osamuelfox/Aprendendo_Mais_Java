package com.tiposVariaveis;

import java.util.Date;

public class TiposVariaveis {

    public static void main(String[] args) {

        // Tipos de variáveis em Java

        // 1. String: Armazena textos (sequência de caracteres)
        String meuNome = "Samuel Santos"; // Variável do tipo String
        System.out.println("Nome: " + meuNome);

        // 2. int: Armazena números inteiros (32 bits)
        int cep = 38407503; // Valor de -2.147.483.648 a 2.147.483.648
        System.out.println("CEP: " + cep);

        // 3. short: Armazena números inteiros menores (16 bits)
        short ano = 2025; // Valor de -32.768 a 32.768
        System.out.println("Ano: " + ano);

        // 4. byte: Armazena números inteiros muito pequenos (8 bits)
        byte idade = 110; // Valor de -128 a 127
        System.out.println("Idade: " + idade);

        // 5. long: Armazena números inteiros grandes (64 bits)
        long cpf = 98723454378L; // Valor de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
        // O sufixo 'L' é necessário para indicar que é um literal do tipo long
        System.out.println("CPF: " + cpf);

        // 6. float: Armazena números decimais de precisão simples (32 bits)
        float pi = 3.14F; // Valor de -3,4028E+38 a 3,4028E+38
        // O sufixo 'F' é necessário para indicar que é um literal do tipo float
        System.out.println("PI: " + pi);

        // 7. double: Armazena números decimais de precisão dupla (64 bits)
        double salario = 1542.22; // Valor de -1,7976E+308 a 1,7976E+308
        System.out.println("Salário: " + salario);

        // 8. boolean: Armazena valores verdadeiros ou falsos
        boolean tipoBooleano = true; // Só aceita true ou false
        System.out.println("Booleano: " + tipoBooleano);

        // 9. char: Armazena um único caractere (16 bits)
        char sexo = 'M'; // Só aceita um caractere
        System.out.println("Sexo: " + sexo);

        // 10. Date: Armazena datas (é uma classe, não um tipo primitivo)
        Date dataNascimento = new Date(); // Cria uma instância da classe Date com a data atual
        System.out.println("Data de Nascimento: " + dataNascimento);

        // Constantes (variáveis imutáveis)
        final double VALOR_DE_PI = 3.14; // O 'final' torna a variável imutável
        System.out.println("Valor de PI: " + VALOR_DE_PI);

        // Operações com variáveis
        int numero = 5;
        numero++; // Incrementa o valor da variável (numero = numero + 1)
        System.out.println("Número após incremento: " + numero);

        numero--; // Decrementa o valor da variável (numero = numero - 1)
        System.out.println("Número após decremento: " + numero);

        // Invertendo o valor de uma variável booleana
        boolean variavel = true;
        variavel = !variavel; // Inverte o valor (true vira false, e vice-versa)
        System.out.println("Variável booleana invertida: " + variavel);
    }
}