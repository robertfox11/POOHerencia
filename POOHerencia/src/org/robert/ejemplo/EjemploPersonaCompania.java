package org.robert.ejemplo;

import org.robert.personacompañia.Gerente;

public class EjemploPersonaCompania {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
                "Gerente1","Gerente apellido","55.55.5522.22", "calle g",
                2500.00, 25, 570000);
        gerente.aumentarRemuneración(15);
        gerente.setPresupuesto(77000.00);
        System.out.println(gerente);
    }
}
