package org.example;

import java.util.List;

class RondasJuego {
    private RuletaRusa ruleta;
    private List<Jugador> jugadores;
    private int turno;
    private int rondasMaximas;

    public RondasJuego(List<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.ruleta = new RuletaRusa(jugadores.stream().map(Jugador::getNombre).toList());
        this.turno = 0;
        this.rondasMaximas = 6; // Límite de 6 rondas
    }

    public void iniciar() {
        int rondaActual = 1;
        while (jugadores.size() > 1 && rondaActual <= rondasMaximas) {
            if (turno >= jugadores.size()) {
                turno = 0;
            }
            Jugador jugadorActual = jugadores.get(turno);
            System.out.println("Ronda " + rondaActual + ": " + jugadorActual.getNombre() + " dispara");
            boolean muerto = ruleta.disparar(turno);
            if (muerto) {
                System.out.println(jugadorActual.getNombre() + " ha muerto!");
                jugadores.remove(turno);
                if (!jugadores.isEmpty()) {
                    ruleta.nuevoAleatorio();
                }
            } else {
                System.out.println(jugadorActual.getNombre() + " sobrevive!");
                turno++;
                ruleta.nuevoAleatorio();
            }
            rondaActual++;
        }
        if (!jugadores.isEmpty()) {
            System.out.println("El ganador es " + jugadores.get(0).getNombre() + "!");
        } else {
            System.out.println("No hay ganadores.");
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getRondasMaximas() {
        return rondasMaximas;
    }

    public void setRondasMaximas(int rondasMaximas) {
        this.rondasMaximas = rondasMaximas;
    }
}
