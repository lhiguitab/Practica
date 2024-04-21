import PaqueteCreador.Creador;
import PaqueteCreador.CreadorDeSeresVivos;
import SeresDeLaTierra.Animal;
import SeresDeLaTierra.Humano;
import SeresDelCielo.Ave;
import SeresDelCielo.Angel;

public class Main {
    public static void main(String[] args) {
        Creador creador = new CreadorDeSeresVivos();
        System.out.println("---HUMANO---");
        Humano humano = (Humano) creador.crearSerVivo("Humano");
        humano.nacer();
        humano.crecer();
        humano.reproducirse();
        humano.morir();
        humano.volar();
        humano.cambiarDimension();
        humano.atravesarNube();
        humano.regenerarse();

        System.out.println("---AVE---");
        Ave ave = (Ave) creador.crearSerVivo("Ave");
        ave.nacer();
        ave.crecer();
        ave.reproducirse();
        ave.morir();
        ave.volar();
        ave.atravesarNube();

        System.out.println("---ANIMAL---");
        Animal animal = (Animal) creador.crearSerVivo("Animal");
        animal.nacer();
        animal.crecer();
        animal.reproducirse();
        animal.morir();
        animal.regenerarse();
        animal.saltar();

        System.out.println("---ÁNGEL---");
        Angel angel = (Angel) creador.crearSerVivo("Ángel");
        angel.nacer();
        angel.crecer();
        angel.atravesarNube();
        angel.cambiarDimension();
        angel.volar();
        angel.hacerMilagro();
    System.out.println("Se ha recibido tu cambio");
    }
}
