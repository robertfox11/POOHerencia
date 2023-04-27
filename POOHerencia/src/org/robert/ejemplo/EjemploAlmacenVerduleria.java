package org.robert.ejemplo;

import org.robert.alamcenverdureria.*;

public class EjemploAlmacenVerduleria {
    public static void main(String[] args) {
        Producto[] productos= new Producto[8];
        productos[0] = new Fruta("manzana fuji", 3.50, 2500d, "roja");
        productos[1] = new Fruta("uvas", 1000.00,3500d,"verdes");
        productos[2] = new Limpieza("lavaloza", 1.2, "Quix", 2290);
        productos[3] = new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330);
        productos[4] = new Lacteo("Leche Sabor Chocolate Semidescremada",1000, 32,  1150);
        productos[5] = new Lacteo("Yoghurt Batido Sabor Frutilla Bolsa", 1000, 37,  1190);
        productos[6] = new NoPerecible("Atún Lomitos en Agua Angelmo",170, 95,  960);
        productos[7] = new NoPerecible("Porotos Hallado Bolsa",1000, 3536,  1990);

        for (Producto prod : productos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitro());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }
    }
}
