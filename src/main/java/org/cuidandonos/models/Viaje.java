package org.cuidandonos.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Viaje {
    private Persona transeunte;
    private Ubicacion direccionActual;
    private Ubicacion destino;
    private List<Parada> paradas;
    private List<Persona> cuidadoresSolicitados;
    private List<Persona> cuidadoresDelViaje;
    private List<Persona> cuidadoresRechazados;
    private IEstadoViaje estadoDelViaje;
    private boolean casillaNTiempoParada;

    public Viaje(Persona transeunte, Ubicacion direccionActual, Ubicacion destino, List<Parada> paradas, List<Persona> cuidadoresSolicitados, List<Persona> cuidadoresDelViaje, List<Persona> cuidadoresRechazados, IEstadoViaje estadoDelViaje) {
        this.transeunte = transeunte;
        this.direccionActual = direccionActual;
        this.destino = destino;
        this.paradas = paradas;
        this.cuidadoresSolicitados = cuidadoresSolicitados;
        this.cuidadoresDelViaje = cuidadoresDelViaje;
        this.cuidadoresRechazados = cuidadoresRechazados;
        this.estadoDelViaje = estadoDelViaje;
    }

    public void notificarCuidadores() {
        // Lógica para notificar a los cuidadores del viaje
    }

    public double calcularTiempoViaje(ICalculadorDeDistancias calculadorDeDistancias, double tiempoPorKilometro) {
        double tiempoTotal = 0;
        Ubicacion ubicacionAnterior = direccionActual; // Variable final efectiva

        // Si no hay paradas, calcular el tiempo hasta el destino
        if (paradas.isEmpty()) {
            tiempoTotal += calculadorDeDistancias.calcularDistancia(direccionActual, destino) * tiempoPorKilometro;
        } else {
            // Calcular tiempo para cada parada
            for (Parada parada : paradas) {
                // Calcular distancia desde la ubicación anterior hasta la parada
                double distancia = calculadorDeDistancias.calcularDistancia(ubicacionAnterior, parada.getUbicacion());

                // Sumar tiempo de la distancia entre ubicaciones
                tiempoTotal += distancia * tiempoPorKilometro;

                // Si la casilla de tiempo de parada está activada, sumar tiempo en la parada
                if (casillaNTiempoParada) {
                    tiempoTotal += parada.getTiempoEnParada();
                }

                // Actualizar ubicación anterior
                ubicacionAnterior = parada.getUbicacion();
            }

            // Calcular distancia desde la última parada hasta el destino final
            double distanciaFinal = calculadorDeDistancias.calcularDistancia(ubicacionAnterior, destino);
            tiempoTotal += distanciaFinal * tiempoPorKilometro;
        }

        return tiempoTotal;
    }

}

