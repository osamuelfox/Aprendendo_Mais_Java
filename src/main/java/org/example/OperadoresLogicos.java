package org.example;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        //Condicional &, as duas condicoes tem que ser verdadeira para entrar na condicional
        if (condicao1 && condicao2){
            System.out.println("As duas condicoes sao verdadeiras");
        }
        //Só precisa de uma condicional verdadeira para entrar na condicional
        if (condicao1 || condicao2){
            System.out.println("Uma das condicoes é verdadeiras");

        }
        System.out.println("Fim");

    }
}
