/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args){
        Scanner conversor= new Scanner(System.in);
        int metro;

        System.out.println("Digite um valor em metro: ");
        metro= conversor.nextInt();

        System.out.println("O valor "+ metro +", em centimentros fica: "+(metro* 100)+ "cm");
    }
}
