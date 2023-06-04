package org.example.exercici1;

public class Undo {

    private static Undo instancia = null;

    private Undo() {

    }

    public synchronized static Undo getUndo() {

        if (null == instancia) {
            instancia = new Undo();
        }

        return instancia;

    }

}
