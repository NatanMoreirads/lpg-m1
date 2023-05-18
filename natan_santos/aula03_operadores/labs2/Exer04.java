/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer04 {
    
    public static void main(String[] args){
        int idade1, idade2;
        Scanner resultado = new Scanner(System.in);
        boolean comparacao;

        System.out.println("Digite uma idade: ");
        idade1 = resultado.nextInt();

        System.out.println("Digite outra idade: ");
        idade2 = resultado.nextInt();

        comparacao = (idade1 > idade2);
        System.out.println("A primeira idade é maior que a segunda? " + comparacao);
    }
}
