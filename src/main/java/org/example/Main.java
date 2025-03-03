package org.example;

public class Main {
    public static void main(String[] args) {

        String primeiroNome = "Samuel";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //Chamada do metodo
        System.out.println(nomeCompleto);

    }

    //Metodo para concatenar o primeiro nome com o segundo nome
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado no metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }

}