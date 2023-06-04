package org.example;

import org.example.exercici1.Undo;

public class Main {

    public static void main(String[] args) {

        Undo undo = Undo.getUndo();
        Undo undo2 = Undo.getUndo();
        System.out.println(undo.hashCode());
        System.out.println(undo2.hashCode());

    }

}