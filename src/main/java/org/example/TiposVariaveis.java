package org.example;

import java.util.Date;

public class TiposVariaveis{

    public static void main(String[] args) {

        String meuNome = "Samuel Santos";
        int cep = 38407503; //valor de -2.147.483.648 a 2.147.483.648
        short ano = 2025; //-32.768 a 32.768
        byte idade = 110; //-128 a 128
        long cpf = 98723454378L; //-9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
        // loong precisa terminar com L para ser armazenado na memoria

        float pi = 3.14F; //-3,4028E+38 a 3,4028E+38
        double salario = 1542.22; //-1,7976E+308 a 1,7976E+308

        boolean tipoBooleano = true; //Só aceita true ou false
        char sexo = 'M'; //Só aceita um caractere

        Date dataNascimento = new Date(); //É uma class que informa a data;

        final double VALOR_DE_PI = 3.14; // O final torna a variavel imutavel, ou seja nao pode ser atribuido outro valor a esta variavel

        int numero = 5;
        numero ++; //Valor de atribuicao //6
        numero --; //Valor de deducao //5


        boolean variavel = true;
        variavel = !variavel; //invertendo a variavel boolean //false

    }

}