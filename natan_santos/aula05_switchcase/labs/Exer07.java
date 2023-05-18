package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer07 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número de (1-5) que corresponde a um produto:");
        int n1 = resultado.nextInt();

        switch (n1){
            case 1:
                System.out.println("Celular SAMSUNG A70 128GB");
                System.out.println("Valor: R$ 1.700,00 "); break;
            case 2:
                System.out.println("Roupeiro Kappesberg 4 portas 2 gavetas");
                System.out.println("Valor: R$ 980,00 ");break;
            case 3:
                System.out.println("Televisor LG 50 Polegadas 4k");
                System.out.println("Valor: R$ 2.899,00 "); break;
            case 4:
                System.out.println("Cadeira Gamer Profissional Azul HyperX ");
                System.out.println("Valor: R$ 1.200,00"); break;
            case 5:
                System.out.println("Notebook SAMSUNG R5 3220G 512GB Memória 8GB RAM:");
                System.out.println("Valor: R$ 3.299,00");
        }
    }
}
