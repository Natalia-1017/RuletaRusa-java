package org.example;

import java.util.Random;

class RuletaRusa {
    private int posicionBala;
    private Random random;

    public RuletaRusa() {
        this.random = new Random();
        recargar();
    }

    public boolean disparar(int posicionJugador) {
        return posicionJugador == posicionBala;
    }

    public void recargar() {
        this.posicionBala = random.nextInt(6); // Simulación de un tambor de 6 posiciones
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }
}
