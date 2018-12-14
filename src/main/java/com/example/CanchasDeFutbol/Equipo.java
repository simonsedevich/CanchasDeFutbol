package com.example.CanchasDeFutbol;

import java.util.List;

class Equipo {

    private String nombre;
    private List<String> jugadores;
    private int max_jugadores;

    public Equipo(String name, int jugadores) {
        this.nombre = name;
        this.max_jugadores = jugadores;
    }

    public void addJugador(String jugador) {
        if (jugadores.size() < max_jugadores) {
            this.jugadores.add(jugador);
        } else {
            System.out.println("Su equipo esta completo, no se pueden agregrar mas jugadores");
        }

    }

    public List<String> getJugador() {
        return this.jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<String> jugadores) {
        this.jugadores = jugadores;
    }

    public int getMax_jugadores() {
        return max_jugadores;
    }

    public void setMax_jugadores(int max_jugadores) {
        this.max_jugadores = max_jugadores;
    }

}
