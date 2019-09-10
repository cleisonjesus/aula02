package com.company;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copias;
        System.out.println("informe a quantidade de copias");
        copias = sc.nextInt();
        double TotalPago;
        if (copias <= 100) {
            TotalPago = copias * 0.25;
        } else {
            TotalPago = copias * 0.20;
        }
        System.out.println("o valor pago é R$" + TotalPago);

    }
}