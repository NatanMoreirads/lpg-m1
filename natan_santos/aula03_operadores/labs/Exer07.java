package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer07 {
    
    public static void main(String[] args){
        Scanner tamanho= new Scanner(System.in);
        int lado;

        System.out.println("Entre com o tamanho do lado do quadrado: ");
        lado= tamanho.nextInt();
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: "+ (lado* 2));
    }
}
