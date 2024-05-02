package org.cuidandonos.models;

public interface ICalculadorDeDistancias {
    double calcularDistancia(Ubicacion direccionActual, Ubicacion destino);

    // Esto deberia de consumir la API de “Distance Matrix API” de Google
}
