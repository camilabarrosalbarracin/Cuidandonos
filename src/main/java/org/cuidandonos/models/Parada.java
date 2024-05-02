package org.cuidandonos.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parada {
    private Ubicacion ubicacion;
    private double tiempoEnParada;

    public Parada(Ubicacion ubicacion, double tiempoEnParada) {
        this.ubicacion = ubicacion;
        this.tiempoEnParada = tiempoEnParada;
    }
}
