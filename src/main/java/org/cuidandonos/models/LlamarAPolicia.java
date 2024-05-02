package org.cuidandonos.models;

public class LlamarAPolicia implements IAlerta{

    @Override
    public void ejecutarAlerta() {
        System.out.println("Notificando a la policia del viaje");
    }
}
