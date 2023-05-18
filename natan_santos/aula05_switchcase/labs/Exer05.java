package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número correspondente a um quadrante: ");
        int n1 = resultado.nextInt();

        switch (n1){
            case 1: System.out.println("Raízes: (+,+)"); break;
            case 2: System.out.println("Raízes: (-,+)"); break;
            case 3: System.out.println("Raízes: (-,-)"); break;
            case 4: System.out.println("Raízes: (+,-)"); break;
            default: System.out.println("o número" + n1 + "não corresponde a um quadrante!");
        }
    }
}
