package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args){
    Scanner temp= new Scanner(System.in);
    double temp1;

        System.out.println("Entre com a temperatura em Celsius");
        temp1= temp.nextDouble();

        System.out.println("A temperatura" + temp1 + " ºC e igual a "+ ((temp1* 1.8)+ 32));
    }
}
