package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args){
        int number;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número da semana (1-7)");
        number = resultado.nextInt();

        switch (number){
            case 1: System.out.println("Segunda"); break;
            case 2: System.out.println("Terça"); break;
            case 3: System.out.println("Quarta"); break;
            case 4: System.out.println("Quinta"); break;
            case 5: System.out.println("Sexta"); break;
            case 6: System.out.println("Sábado"); break;
            case 7:  System.out.println("Domingo"); break;
            default: System.out.println("O número "+ number + " não condiz com a informação pedida!");

        }
    }
}
