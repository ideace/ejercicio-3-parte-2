package com.company;

public class Main {

    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
    class coche{
        public int puertas = 4;

        public void sumarPuerta(){
            this.puertas++;
        }
    }

