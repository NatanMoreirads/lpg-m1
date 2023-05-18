/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer04 {
    
    public static void main(String[] args){
        Scanner soma= new Scanner(System.in);
        float nota1, nota2, nota3, nota4;

        System.out.println("Digite sua primeira nota: ");
        nota1= soma.nextFloat();

        System.out.println("Digite sua segunda nota: ");
        nota2= soma.nextFloat();

        System.out.println("Digite sua terceira nota: ");
        nota3= soma.nextFloat();

        System.out.println("Digite sua quarta nota: ");
        nota4= soma.nextFloat();

        System.out.println("Seu media final e: "+ (nota1+ nota2+ nota3+ nota4)/4);
    }
}
