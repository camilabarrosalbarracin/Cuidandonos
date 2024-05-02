package org.cuidandonos.models;

public class LlamarAlTranseunte implements IAlerta{

    @Override
    public void ejecutarAlerta() {
        System.out.println("Llamando al transeunte del viaje");
    }
}

