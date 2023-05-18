package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args){
        int n1, n2;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        n1 = resultado.nextInt();

        System.out.println("Informe outro número: ");
        n2 = resultado.nextInt();

        if (n1 > n2){
            System.out.println("Seu primeiro número informado é maior que o Segundo!");
        }else {
            System.out.println("Seu segundo número informado é maior que o segundo!");
        }
    }
}
