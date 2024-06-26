package org.example.cafetera.model.extension;

import org.example.cafetera.model.Cafetera;
import org.example.cafetera.model.extension.inversion.Molienda;
import org.example.cafetera.model.extension.liskov.Cafe;

public class CafeteraRistretto extends Cafetera {

    private static final double CONSUMO_AGUA_RISTRETTO = 40; // en mililitros

    public CafeteraRistretto(double capacidadTotal, double nivelAgua, Molienda molienda) {
        super(capacidadTotal, nivelAgua,molienda);
    }

    @Override
    public Cafe preparar() {
        System.out.println("Preparando ristretto...");
        if (nivelAgua >= CONSUMO_AGUA_RISTRETTO) {
            setNivelAgua(nivelAgua - CONSUMO_AGUA_RISTRETTO);
            return new Cafe("Ristretto", CONSUMO_AGUA_RISTRETTO);
        } else {
            System.out.println("No hay suficiente agua en la cafetera para preparar ristretto.");
            return null;
        }
    }
}
