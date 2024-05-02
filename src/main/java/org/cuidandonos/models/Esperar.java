package org.cuidandonos.models;

public class Esperar implements IAlerta{
    private Integer minutosAntesDeLlamada;

    // Implementariamos una tarea que al llamar a este metodo
    // Tenga un tiempo de espera antes de ejecutar la alerta

    @Override
    public void ejecutarAlerta() {
        System.out.println("Notificando a los cuidadores del viaje");
    }
}
