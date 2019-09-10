package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pecasProduzidas, pecasDefeituosas;
        System.out.println("informe a quantidade de peças produzidas");
        pecasProduzidas = sc.nextInt();
    System.out.println("Informe as Quantidades de Peças Defeituosas");
    pecasDefeituosas = sc.nextInt();
        if(pecasDefeituosas > (pecasProduzidas * 0.1)){
            System.out.println("Maquina Precisa de Manutenção");
        }else{
            System.out.println("Maquina não Precisa de Manutenção");


    }

    }
}
