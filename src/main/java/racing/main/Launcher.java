package racing.main;
import racing.entidades.AutoCarrera;
import racing.servicios.PitStop;

public class Launcher {
    public static void main(String[] args){
        AutoCarrera auto = new AutoCarrera("Ferrari", 100, 100);
        PitStop pitStop = new PitStop();
        int vueltas=0;

        while (vueltas < 5 ){
            vueltas++;
            auto.darVuelta();
            if (auto.getCombustible() < 20 || auto.getIntegridadNeumaticos() < 20) {  // 2. después se revisa
                pitStop.asistir(auto);
            }
        }

    }
}
