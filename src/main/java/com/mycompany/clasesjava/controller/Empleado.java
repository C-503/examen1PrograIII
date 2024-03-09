
package com.mycompany.clasesjava.controller;

public class Empleado extends AbstractPersona{
    
    private int codigo;
    private String puesto;
    private int salario;

    public Empleado(int id, String nombre, String apellido, String direccion, int telefono, int codigo, int salario) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void Guardar(Empleado Persona) {
        this.setCodigo(Persona.getCodigo());
        this.setPuesto(Persona.getPuesto());
        this.setSalario(Persona.getSalario());
    }

    public void ObtenerPersona() {
        System.out.println(this.codigo + " " + this.puesto + " " + this.salario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
    

