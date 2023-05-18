/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args){
        int p1, p2;
        Scanner resultado = new Scanner(System.in);
        boolean comparacao;

        System.out.println("Digite o preço de um produto: ");
        p1 = resultado.nextInt();

        System.out.println("Digite mais um preço: ");
        p2 = resultado.nextInt();

        comparacao = (p1 >= p2);
        System.out.println("O primeiro produto tem um preço maior que o segundo? " + comparacao);
    }
}
