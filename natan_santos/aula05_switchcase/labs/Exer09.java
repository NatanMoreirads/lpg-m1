package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("informe um número (1-5):");
        int n1 = resultado.nextInt();

        switch (n1){
            case 1: System.out.println("Carro"); break;
            case 2: System.out.println("Moto"); break;
            case 3: System.out.println("Caminhão"); break;
            case 4: System.out.println("Ônibus"); break;
            case 5: System.out.println("Bicicleta"); break;

            default: System.out.println("Número não correspondente!");
        }

    }
}
