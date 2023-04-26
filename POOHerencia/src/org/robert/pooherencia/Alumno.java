package org.robert.pooherencia;

//alumno hereda de persona con extends
public class Alumno extends Persona {
    /*propios atributos*/
    private String instituto;
    private double notasMates;
    private double notasLengua;
    private double notasHistoria;

    /*Sobre carga de constructores*/
    public Alumno() {
        System.out.println("se inicializa constructor alumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto) {
        super(nombre, apellido, edad);//super o this es lo mismo
        this.instituto = instituto;
    }

    public Alumno(String nombre, String apellido, int edad, String instituto, double notasMates, double notasLengua, double notasHistoria) {
        super(nombre, apellido, edad);
        this.instituto = instituto;
        this.notasMates = notasMates;
        this.notasLengua = notasLengua;
        this.notasHistoria = notasHistoria;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotasMates() {
        return notasMates;
    }

    public void setNotasMates(double notasMates) {
        this.notasMates = notasMates;
    }

    public double getNotasLengua() {
        return notasLengua;
    }

    public void setNotasLengua(double notasLengua) {
        this.notasLengua = notasLengua;
    }

    public double getNotasHistoria() {
        return notasHistoria;
    }

    public void setNotasHistoria(double notasHistoria) {
        this.notasHistoria = notasHistoria;
    }

    /**
     * Sobre escritura en el metodo
     */
    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + "soy alumno y mi nombre es " + getNombre();
    }
    public double calcularPromedio() {
        System.out.println("Calcular promedio "+ Alumno.class.getCanonicalName());
        return (notasHistoria + notasLengua + notasMates)/3;
    }
    /**Sobre escribir metodo toString*/
    @Override
    public String toString() {
        return super.toString()+
                "\ninstituto='" + instituto + '\'' +
                ", notasMates=" + notasMates +
                ", notasLengua=" + notasLengua +
                ", notasHistoria=" + notasHistoria +", promedio= " +this.calcularPromedio();
    }
}
