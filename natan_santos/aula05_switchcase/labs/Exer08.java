package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número (1-12): ");
        int n1 = resultado.nextInt();

        switch (n1){
            case 1: System.out.println("Verão"); break;
            case 2: System.out.println("Verão"); break;
            case 3: System.out.println("Outono"); break;
            case 4: System.out.println("Outono"); break;
            case 5: System.out.println("Outono"); break;
            case 6: System.out.println("Inverno"); break;
            case 7: System.out.println("Inverno"); break;
            case 8: System.out.println("Inverno"); break;
            case 9: System.out.println("Primavera"); break;
            case 10: System.out.println("Primavera"); break;
            case 11: System.out.println("Primavera"); break;
            case 12: System.out.println("Verão"); break;

            default: System.out.println("Número não corresponde ");
        }

    }
}
