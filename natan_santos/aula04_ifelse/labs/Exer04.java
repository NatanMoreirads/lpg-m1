/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
    int num;
    String cnh;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Possui carteira de motorista? (S/N): ");
        cnh = resultado.next();

        System.out.println("Informe sua idade: ");
        num = resultado.nextInt();

        if (num >= 18 && cnh.equalsIgnoreCase("S")){
            System.out.println("Você tem permissão para dirigir!");
        }else {
            System.out.println("Você não tem permissão para digirigir! A poliça vai te pegar eim");
        }
    }
}
