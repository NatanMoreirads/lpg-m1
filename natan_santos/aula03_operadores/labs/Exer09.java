package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args){
        Scanner temp= new Scanner(System.in);
        double temp1;

        System.out.println("Entre com a temperatura em Farenheit: ");
        temp1= temp.nextDouble();

        System.out.println("A temperatura " + temp1 + " ºF, e igual a " + (5 *(temp1-32)/9)+"ºC");
    }
}
