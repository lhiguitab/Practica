package SeresDelCielo;

import PaqueteCreador.SerVivo;

public class Ave extends SerVivo implements SerDelCielo{
    @Override
    public void volar() {
        System.out.println("Ave volando...");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("Ave cambiando de dimensión...");
    }

    @Override
    public void atravesarNube() {
        System.out.println("Ave atravesando nube...");
    }

    @Override
    public void nacer() {
        System.out.println("Ave naciendo...");
    }

    @Override
    public void crecer() {
        System.out.println("Ave creciendo...");
    }

    @Override
    public void reproducirse() {
        System.out.println("Ave reproduciendo...");
    }

    @Override
    public void morir() {
        System.out.println("Ave muriendo...");
    }
}
