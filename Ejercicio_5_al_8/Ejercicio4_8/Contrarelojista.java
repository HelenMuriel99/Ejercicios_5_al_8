package Ejercicio_5_al_8.Ejercicio4_8;

public class Contrarelojista extends Ciclista{

    private double velocidadMáxima;

    public Contrarelojista(int identificador, String nombre, double velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }

    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio: " +velocidadMáxima);
    }

    protected String imprimirTipo(){
        return "Es un contrarelojista";
    }
}
