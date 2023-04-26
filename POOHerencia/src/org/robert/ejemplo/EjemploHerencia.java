package org.robert.ejemplo;

import org.robert.pooherencia.Alumno;
import org.robert.pooherencia.AlumnoInternacional;
import org.robert.pooherencia.Persona;
import org.robert.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        /*modificamos ejn el acceso con set */
        alumno.setNombre("Rob");
        alumno.setApellido("Fox");
        alumno.setNotasHistoria(6.5);
        alumno.setNotasLengua(9.8);
        alumno.setNotasMates(8.9);
        //casteamos la instancia //modificadores de tipo de clase
        ((Alumno)alumno).setInstituto("Insti Nacional");

        /*Alumno internacional*/
        AlumnoInternacional alumnoInter = new AlumnoInternacional();
        alumnoInter.setNombre("RobExtra");
        alumnoInter.setApellido("FoxExtra");
        alumnoInter.setPais("Canada");
        alumnoInter.setNotasHistoria(8.5);
        alumnoInter.setNotasLengua(7.8);
        alumnoInter.setNotasMates(9.2);

        Profesor profesor = new Profesor();
        profesor.setNombre("RobertName");
        profesor.setApellido("FoxApe");

        System.out.println(profesor.getNombre());
        System.out.println(alumno.getNombre());
        //Casteamos la instancia
        System.out.println("Instituto del alumno " + ((Alumno)alumno).getInstituto());
        System.out.println("***********Alumno internacional");
        System.out.println(alumnoInter.getNombre() + " " + alumnoInter.getApellido()+ " del pais " + alumnoInter.getPais());
        Class clase = alumno.getClass();
        /*Clase padre sea distinto de null*/
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre "+ padre);
            //asignar en la clase padre
            clase = clase.getSuperclass();
        }

    }
}
