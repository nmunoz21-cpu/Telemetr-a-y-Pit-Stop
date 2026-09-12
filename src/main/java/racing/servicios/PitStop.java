package racing.servicios;

import racing.entidades.AutoCarrera;

public class PitStop {
    public void asistir(AutoCarrera auto){
        System.out.println(auto.getModelo() + " entró a boxes!");

        System.out.println("ESTADO ANTES DE LA ASISTENCIA");
        System.out.println("Modelo: "+ auto.getModelo());
        System.out.println("Combustible: "+ auto.getCombustible());
        System.out.println("Integridad de los neumaticos: "+ auto.getIntegridadNeumaticos());

        auto.setCombustible(100);
        auto.setIntegridadNeumaticos(100);

        System.out.println("ESTADO DESPUES DE LA ASISTENCIA");
        System.out.println("Combustible: "+ auto.getCombustible());
        System.out.println("Integridad de los neumaticos: "+ auto.getIntegridadNeumaticos());
    }

}