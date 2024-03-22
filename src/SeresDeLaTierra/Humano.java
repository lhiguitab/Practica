package SeresDeLaTierra;

import PaqueteCreador.SerVivo;
import SeresDelCielo.SerDelCielo;

public class Humano extends SerVivo implements SerDeLaTierra, SerDelCielo {
    @Override
    public void nacer() {
        System.out.println("Humano naciendo...");
    }

    @Override
    public void crecer() {
        System.out.println("Humano creciendo...");
    }

    @Override
    public void reproducirse() {
        System.out.println("Humano reproduciendo...");
    }

    @Override
    public void morir() {
        System.out.println("Humano muriendo...");
    }

    @Override
    public void volar() {
        System.out.println("Humano volando...");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("Humano cambiando de dimensión...");
    }

    @Override
    public void atravesarNube() {
        System.out.println("Humano atravesando una nube...");
    }

    @java.lang.Override
    public void regenerarse() {
        System.out.println("Humano regenerando...");
    }
}
