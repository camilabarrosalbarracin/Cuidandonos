package org.cuidandonos.models;

public class AlertaCuidadores implements IAlerta{

    @Override
    public void ejecutarAlerta() {
        System.out.println("Notificando a los cuidadores del viaje");
    }
}
