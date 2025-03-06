package com.repeticao;

public class lacoRepeticaoForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
