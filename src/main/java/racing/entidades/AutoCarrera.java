package racing.entidades;

import java.util.Random;

public class AutoCarrera {
    private String modelo;
    private int combustible;
    private int integridadNeumaticos;

    // Constructor inicializador
    public AutoCarrera(String modelo, int combustible, int integridadNeumaticos) {
        this.modelo = modelo;
        this.combustible = combustible;
        this.integridadNeumaticos = integridadNeumaticos;
    }
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void setIntegridadNeumaticos(int integridadNeumaticos) {
        this.integridadNeumaticos = integridadNeumaticos;
    }


    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getCombustible() {
        return combustible;
    }

    public int getIntegridadNeumaticos() {
        return integridadNeumaticos;
    }

    // Simula el desgaste de una vuelta
    public void darVuelta() {
        Random random = new Random();

        int desgasteCombustible = random.nextInt(11) + 10;      // entre 10 y 20
        int desgasteNeumaticos = random.nextInt(11) + 15;       // entre 15 y 25

        combustible -= desgasteCombustible;
        integridadNeumaticos -= desgasteNeumaticos;

        // Restricción no pueden quedar en negativo
        if (combustible < 0) {
            combustible = 0;
        }
        if (integridadNeumaticos < 0) {
            integridadNeumaticos = 0;
        }

    }
}