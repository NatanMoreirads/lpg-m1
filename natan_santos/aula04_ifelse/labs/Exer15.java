package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer15 {
    
    public static void main(String[] args){
        int n1, n2;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        n1 = resultado.nextInt();

        System.out.println("Informe outro número: ");
        n2 = resultado.nextInt();

        if (n1 % n2 == 0){
            System.out.println("O número " + n1 + " é multiplo por " + n2);
        }else{
            System.out.println("O número " + n1 + " Não é multiplo por "+ n2);
        }
    }
}
