package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer07 {
    
    public static void main(String[] args){
        float a1, a2;
        Scanner resultado = new Scanner(System.in);
        boolean comparacao;

        System.out.println("Digite a altura de uma pessoa: ");
        a1 = resultado.nextFloat();

        System.out.println("Digite outra altura: ");
        a2 = resultado.nextFloat();

        comparacao = (a1 >= a2);
        System.out.println("A medida é maior ou igual a segunda? "+ comparacao);

    }
}
