package org.robert.ejemplo;

import org.robert.pooherencia.Alumno;
import org.robert.pooherencia.AlumnoInternacional;
import org.robert.pooherencia.Persona;
import org.robert.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        System.out.println("==========Creando la instancia");
        Alumno alumno = new Alumno("Robert", "rex", 10, "Instituto Nacional");
        alumno.setNotasHistoria(6.5);
        alumno.setNotasLengua(9.8);
        alumno.setNotasMates(8.9);
        alumno.setEmail("pruebaalumna@gmail.es");
        imprimir(alumno);
        System.out.println("Creando la instalna de la clase alumno internacional");
        AlumnoInternacional alumnoInter = new AlumnoInternacional("peter", "Gosling", "Belgica");
        alumnoInter.setEdad(22);
        alumnoInter.setInstituto("Instituto nacional");
        alumnoInter.setNotasHistoria(8.5);
        alumnoInter.setNotasLengua(7.8);
        alumnoInter.setNotasMates(9.2);
        alumnoInter.setEmail("pruebaalumnaInternacional@gmail.es");
        imprimir(alumnoInter);
        System.out.println("=======================¨Creando la instalan de progeso");
        Profesor profesor = new Profesor("robertPRofe", "PErez", "mates");
        profesor.setEdad(45);
        System.out.println("==================");
        imprimir(profesor);
        System.out.println("==================");

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad() + " " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("**************imprimeinto de los dato del tipo alumno");
            System.out.println("Institución: " + ((Alumno) persona).getInstituto());
            System.out.println("Notas Matematica" + ((Alumno) persona).getNotasMates());
            System.out.println("notas Historia" + ((Alumno) persona).getNotasHistoria());
            System.out.println("notas Castellano" + ((Alumno) persona).getNotasLengua());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiento los datos del itpo alumno internacion: ");
                System.out.println("notas idiiomas" + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("pais de alumno internacionl" + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("=======Sobre escritura promedio========");
            System.out.println("promedio" + ((Alumno) persona).calcularPromedio());
            System.out.println("=======Sobre escritura promedio========");
        }

        if (persona instanceof Profesor) {
            System.out.println("Asignatura: \n" + ((Profesor) persona).getAsignatura());
        }
        System.out.println("======000Sobre escritura==============" + persona.saludar());
    }
}
