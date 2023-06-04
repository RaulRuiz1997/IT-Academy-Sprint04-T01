package org.example.exercici1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instancia = null;
    private List<String> comandes;

    private Undo() {
        comandes = new ArrayList<>();
    }

    public synchronized static Undo getUndo() {

        if (null == instancia) {
            instancia = new Undo();
        }

        return instancia;

    }

    public void afegirComanda(String comanda) {
        if (comandes.size() < 3) {
            comandes.add(comanda);
        }
    }

    public boolean eliminarComanda(int posicioComandaAEliminar) {
        if (posicioComandaAEliminar >= 0 || posicioComandaAEliminar <= 2) {
            if (comandes.size() > posicioComandaAEliminar) {
                comandes.remove(posicioComandaAEliminar);
                return true;
            }
            return false;
        }
        return false;
    }

    public String llistarUltimesComandes() {
        return comandes.isEmpty() ? "Encara no hi ha comandes guardades!\n" : comandes + "\n";
    }

    public int getTamanyArrayComandes() {
        return comandes.size();
    }

}
