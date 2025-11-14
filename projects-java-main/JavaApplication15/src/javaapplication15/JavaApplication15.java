/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class JavaApplication15 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//variavel para scanner
        
        System.out.println("insira o 1 inteiro: ");//pede 1 inteiro
        int num1 = input.nextInt();//recebe o valor
        
        System.out.println("insira o 2 inteiro: ");//pede 2 inteiro
        int num2 = input.nextInt();//recebe o valor
        
        System.out.println("insira o 3 inteiro: ");//pede 3 inteiro
        int num3 = input.nextInt();//recebe o valor
        
        int soma=num1+num2+num3;//faz a soma e guarda na variavel
        int media=soma/3;//usa a var soma para fazer a media
        int mult=num1*num2*num3;// multiplica os numeros
        
        
        //checa qual o maior e o menor
        if (num1>num2)
        {
            if(num3>num2)
            {
                System.out.printf("o menor e :%d%n",num2);
            }
            
            if(num1>num3)
            {
                System.out.printf("o maior e :%d%n",num1);
            }
        }
        if (num2>num1)
        {
            if(num3>num1)
            {
                System.out.printf("o menor e :%d%n",num1);
            }
            
            if(num2>num3)
            {
                System.out.printf("o maior e :%d%n",num2);
            }
        }
        
        if (num1>num3)
        {
            if(num2>num3)
            {
                System.out.printf("o menor e :%d%n", num3);
            }
        }
                
        if (num3>num1)
        {
            if (num3>num2)
            {
                System.out.printf("o maior e :%d%n",num3);
            }
        }
        //imprime o resultado final
        System.out.printf("A soma e :%d%nA multiplicao e :%d%nA media e :%d%n",soma,mult,media);
        }
    }

