package org.cuidandonos.models;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private Sexo sexo;
    private boolean puedeRecibirNotificaciones;
    private IAlerta configuracionFrenteIncidente;

    //Constructor

    public Persona(String nombre, String apellido, String fechaDeNacimiento, Sexo sexo, boolean puedeRecibirNotificaciones, IAlerta configuracionFrenteIncidente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.puedeRecibirNotificaciones = puedeRecibirNotificaciones;
        this.configuracionFrenteIncidente = configuracionFrenteIncidente;
    }



}
