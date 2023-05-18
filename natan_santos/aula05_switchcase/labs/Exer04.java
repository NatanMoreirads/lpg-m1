package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer04 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe sua média: ");
        int n1 = resultado.nextInt();

        switch (n1){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                System.out.println("Você foi REPROVADO!"); break;
            case 6:

            case 7:
            case 8:
            case 9:
            case 10:

                System.out.println("Aprovado!"); break;

            default: System.out.println("Está nota não é permitida! ");

        }
    }
}
