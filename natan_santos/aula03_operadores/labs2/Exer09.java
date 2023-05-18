package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args){
        int p1, p2;
        boolean comparacao;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um ano de nascimento: ");
        p1 = resultado.nextInt();

        System.out.println("Informe outra ano de nascimento: ");
        p2 = resultado.nextInt();

        comparacao = (p1 >= p2);
        System.out.println("A primeira pessoa é mais nova que a segunda? " + comparacao);
    }
}
