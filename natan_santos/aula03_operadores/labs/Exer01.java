package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer01 {
    
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite seu Primeiro Nome: ");
        String nome= entrada.nextLine();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome= entrada.nextLine();

        System.out.println("Seu nome completo é: " + nome +" "+sobrenome);
    }
}
