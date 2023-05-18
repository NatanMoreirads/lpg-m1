package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer06 {
    
    public static void main(String[] args){
        String c1, c2;
        Scanner resultado = new Scanner(System.in);
        boolean comparacao;

        System.out.println("Digite um caracter: ");
        c1 = resultado.next();

        System.out.println("Digite outro caracter: ");
        c2 = resultado.next();

        comparacao = (c1.equals(c2));
        System.out.println("Os caracteres são iguais? " + comparacao);
    }
}
