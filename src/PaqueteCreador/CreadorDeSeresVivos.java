
package PaqueteCreador;

public class CreadorDeSeresVivos implements Creador{
    @Override
    public SerVivo crearSerVivo(String tipo) {
        if (tipo.equals("Humano")){
            return new SeresDeLaTierra.Humano();
        } else if (tipo.equals("Animal")){
            return new SeresDeLaTierra.Animal();
        } else if (tipo.equals("Ave")){
            return new SeresDelCielo.Ave();
        } else if (tipo.equals("Ángel")){
            return new SeresDelCielo.Angel();
        }
        return null;
    }
}
