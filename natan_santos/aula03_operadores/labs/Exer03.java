package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args){
        Scanner informacao= new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite um número: ");
        numero1= informacao.nextInt();

        System.out.println("Digite outro número: ");
        numero2= informacao.nextInt();

        System.out.println("O soma total dos dois números e: "+(numero1+numero2));
    }
}
