/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

//import static fibonacci.Fibonacci.fibonacci;

/**
 *
 * @author Administrador
 */
public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }

}


