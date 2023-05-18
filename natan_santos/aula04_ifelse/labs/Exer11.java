package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer11 {
    
    public static void main(String[] args){
        int numero;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número");
        numero = resultado.nextInt();

        if (numero >= 0){
            System.out.println("Seu número é positivo!");
        }else{
            System.out.println("Seu número é negativo!");
        }
    }
}
