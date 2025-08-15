package dev.alejandro;

import dev.alejandro.loop.TablaMultiplicacion;

public class App {

    public static void main(String[] args) {
        int n = 3;

        System.out.println("=== Tabla usando For Loop ===");
        TablaMultiplicacion.usingForLoop(n);

        System.out.println("\n=== Tabla usando Foreach Loop ===");
        TablaMultiplicacion.usingForeachLoop(n);

        System.out.println("\n=== Tabla usando While Loop ===");
        TablaMultiplicacion.usingWhileLoop(n);

        System.out.println("\n=== Tabla usando Do-While Loop ===");
        TablaMultiplicacion.usingDoWhileLoop(n);

        System.out.println("\n=== Tabla usando Iterator ===");
        TablaMultiplicacion.usingIterator(n);
    }
}