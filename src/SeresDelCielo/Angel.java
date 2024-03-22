package SeresDelCielo;

import PaqueteCreador.SerVivo;

public class Angel extends SerVivo implements SerDelCielo {

    public void hacerMilagro(){
        System.out.println("Ángel haciendo un milagro...");
    }
    @Override
    public void nacer() {
        System.out.println("Ángel naciendo...");
    }

    @Override
    public void crecer() {
        System.out.println("Ángel creciendo...");
    }

    @Override
    public void reproducirse() {
        System.out.println("Ángel reproduciendo...");
    }

    @Override
    public void morir() {
        System.out.println("Ángel muriendo...");
    }

    @Override
    public void volar() {
        System.out.println("Ángel volando...");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("Ángel cambiando de dimensión...");
    }

    @Override
    public void atravesarNube() {
        System.out.println("Ángel atravensando una nube...");
    }
}
