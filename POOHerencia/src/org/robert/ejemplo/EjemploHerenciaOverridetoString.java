package org.robert.ejemplo;

import org.robert.pooherencia.Alumno;
import org.robert.pooherencia.AlumnoInternacional;
import org.robert.pooherencia.Persona;
import org.robert.pooherencia.Profesor;

public class EjemploHerenciaOverridetoString {
    public static void main(String[] args) {
        System.out.println("==========Creando la instancia");
        Alumno alumno = new Alumno("Robert", "rex", 10, "Instituto Nacional");
        alumno.setNotasHistoria(6.5);
        alumno.setNotasLengua(9.8);
        alumno.setNotasMates(8.9);
        alumno.setEmail("pruebaalumna@gmail.es");
        imprimir(alumno);
        System.out.println("========Creando la instalna de la clase alumno internacional======");
        AlumnoInternacional alumnoInter = new AlumnoInternacional("peter", "Gosling", "Belgica");
        alumnoInter.setEdad(22);
        alumnoInter.setInstituto("Instituto nacional");
        alumnoInter.setNotaIdiomas(9.5);
        alumnoInter.setNotasHistoria(8.5);
        alumnoInter.setNotasLengua(7.8);
        alumnoInter.setNotasMates(9.2);
        alumnoInter.setEmail("pruebaalumnaInternacional@gmail.es");
        imprimir(alumnoInter);
        System.out.println("=======================¨Creando la instalan de progeso");
        Profesor profesor = new Profesor("robertPRofe", "PErez", "mates");
        profesor.setEdad(45);
        profesor.setEmail("profe.com");
        System.out.println("==================");
        imprimir(profesor);
        System.out.println("==================");

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona.toString());
    }
}
