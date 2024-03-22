package SeresDeLaTierra;

import PaqueteCreador.SerVivo;

public class Animal extends SerVivo implements SerDeLaTierra{

    public void saltar() {
        System.out.println("Animal saltando...");
    }
    @Override
    public void nacer() {
        System.out.println("Animal naciendo...");
    }

    @Override
    public void crecer() {
        System.out.println("Animal creciendo...");
    }

    @Override
    public void reproducirse() {
        System.out.println("Animal reproduciendo...");
    }

    @Override
    public void morir() {
        System.out.println("Animal muriendo...");
    }

    @java.lang.Override
    public void regenerarse() {
        System.out.println("Animal regenerando...");
    }
}
