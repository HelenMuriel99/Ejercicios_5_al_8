package Ejercicio_5_al_8.Ejercicio4_6;

import Ejercicio_1_al_4.Ejercicio4_2.Prueba;

import java.util.Vector;

public class Ejercicio_Propuesto {
    Vector profesores;

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.profesores = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);
        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.imprimir();

        }
    }
}