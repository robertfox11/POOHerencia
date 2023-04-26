package org.robert.pooherencia;

//alumno hereda de persona con extends
public class Alumno extends Persona{
    /*propios atributos*/
    private String instituto;
    private double notasMates;
    private double notasLengua;
    private double notasHistoria;


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
}
