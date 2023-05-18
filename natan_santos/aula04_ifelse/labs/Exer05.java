/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo01.natan_santos.aula04_ifelse.labs;

import modulo01.natan_santos.aula04_ifelse.IfElse;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
    int idd, peso;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe sua idade");
        idd = resultado.nextInt();

        System.out.println("Informe seu peso: ");
        peso = resultado.nextInt();

        if ( idd >= 18 && idd <= 69 && peso >= 50){
            System.out.println("Você está apto para a doação de sangue!");
        } else {
            System.out.println("Você não está apto para a doação de sangue!");
        }
    }
}
