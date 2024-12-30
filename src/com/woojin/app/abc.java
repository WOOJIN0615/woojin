package com.woojin.app;

import java.util.Scanner;

public class abc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int E = B / 100;
        int D = B % 100 /10;
        int C = B % 100 % 10;
        int Y = A * C;
        int X = A * D;
        int Z = A * E;
        int result = A * B;
        System.out.println(E);
        System.out.println(D);
        System.out.println(C);
        System.out.println(Y);
        System.out.println(X);
        System.out.println(Z);
        System.out.println(result);
            
        
        
    }
}
