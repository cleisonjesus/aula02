package com.company;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a Idade");
        int idade = sc.nextInt();12
        if (idade <= 10) {
            System.out.println("Infantil");
        } else
            if (idade > 10 && idade <= 17) {
            System.out.println("Juvenil");
            }else{
                System.out.println("Senior");
            }
            }

        }

