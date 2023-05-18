package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
    int numero;
    String titulo;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe sua idade");
        numero = resultado.nextInt();

        System.out.println("Possui titulo de eleitor? (S/N)");
        titulo = resultado.next();

        if (numero >= 16 && titulo.equalsIgnoreCase("S")){
            System.out.println("Você tem permissão para ter titulo! ");
        } else {
            System.out.println("Você não possui autorização para ter titulo!");
        }
    }
}
