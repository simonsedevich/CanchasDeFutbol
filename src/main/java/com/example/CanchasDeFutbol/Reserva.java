package com.example.CanchasDeFutbol;

import java.util.Date;

public class Reserva {

    private Date fechaReserva;
    private Equipo equipo1, equipo2;
    private Date FechaReserva;

    public Reserva(Date dReserva, Equipo dEquipo1, Equipo dEquipo2) {
        this.FechaReserva = dReserva;
        this.equipo1 = dEquipo1;
        this.equipo2 = dEquipo2;
    }

    public void setFechaReserva(Date fecha) {
        this.FechaReserva = fecha;

    }

    public void setEquipo1(Equipo dEquipo1) {

        this.equipo1 = dEquipo1;

    }

    public Equipo getEquipo1() {
        return this.equipo1;
    }

    public void setEquipo2( Equipo dEquipo2) {

        this.equipo2 = dEquipo2;

    }

    public Equipo getEquipo2() {
        return equipo2;
    }
}
