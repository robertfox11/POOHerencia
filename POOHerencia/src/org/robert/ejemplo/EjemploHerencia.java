package org.robert.ejemplo;

import org.robert.pooherencia.Alumno;
import org.robert.pooherencia.Persona;
import org.robert.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Persona alumno = new Alumno();
        /*modificamos ejn el acceso con set */
        alumno.setNombre("Rob");
        alumno.setApellido("Fox");
        //casteamos la instancia //modificadores de tipo de clase

        ((Alumno)alumno).setInstituto("Insti Nacional");


        Profesor profesor = new Profesor();
        profesor.setNombre("RobertName");
        profesor.setApellido("FoxApe");

        System.out.println(profesor.getNombre());
        System.out.println(alumno.getNombre());
        //Casteamos la instancia
        System.out.println("Instituto del alumno " + ((Alumno)alumno).getInstituto());
    }
}
