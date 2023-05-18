package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer06 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um nível de dificuldade (1-5):");
        int n1 = resultado.nextInt();

        switch (n1){

            case 1: System.out.println("Easy"); break;
            case 2: System.out.println("Low"); break;
            case 3: System.out.println("Medium"); break;
            case 4: System.out.println("Hard"); break;
            case 5: System.out.println("Very Hard"); break;

            default: System.out.println("Dificuldade não econtrada!");
        }
    }
}
