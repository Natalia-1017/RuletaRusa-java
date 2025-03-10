package org.example;

import java.util.List;
import java.util.Random;

class RuletaRusa {
    private List<String> tambor;
    private int posicionBala;
    private int posicionActual;
    private Random random;

    public RuletaRusa(List<String> tambor) {
        this.tambor = tambor;
        this.random = new Random();
        nuevoAleatorio();
    }

    public boolean disparar(int posicionJugador) {
        System.out.println("Posición de la bala: " + posicionBala);
        System.out.println("Posición del tambor (jugador): " + posicionActual);
        return posicionActual == posicionBala;
    }

    public void nuevoAleatorio() {
        this.posicionBala = random.nextInt(6);
        this.posicionActual = random.nextInt(tambor.size());
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public List<String> getTambor() {
        return tambor;
    }

    public void setTambor(List<String> tambor) {
        this.tambor = tambor;
    }
}
