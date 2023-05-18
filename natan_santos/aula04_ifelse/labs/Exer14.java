package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer14 {
    
    public static void main(String[] args){
        String p1, p2;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe a cor de uma casa: ");
        p1 = resultado.next();

        System.out.println("Informe a cor de outra casa: ");
        p2 = resultado.next();

        if (p1.equals(p2)){
            System.out.println("As cores são iguais!");
        }else {
            System.out.println("As cores não são diferentes!");
        }
    }
}
