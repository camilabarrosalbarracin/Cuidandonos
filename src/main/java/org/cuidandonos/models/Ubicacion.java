package org.cuidandonos.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ubicacion {
    private Float latiud;
    private Float longitud;

    //Constructor
    public Ubicacion(Float latiud, Float longitud) {
        this.latiud = latiud;
        this.longitud = longitud;
    }
}
