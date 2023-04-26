package org.robert.pooherencia;

/**Extiende de alumno que hereda de persona */
public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("Alumno internacion inicializa");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        String saludar =super.saludar();
        return saludar+ ",soy un alumno extranjero del país " + getPais() + " mi nombre es " + getNombre();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("Calcular promedio "+ this.getClass().getCanonicalName());
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }
}
