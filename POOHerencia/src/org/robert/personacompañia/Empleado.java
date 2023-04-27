package org.robert.personacompañia;

public class Empleado  extends Persona{
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneración(int porcentaje){
        this.remuneracion += (remuneracion * porcentaje/100);
    }

    @Override
    public String toString() {
        return "EmpleadoId: " +
                "remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId + ", " + super.toString();
    }
}
