
package com.mycompany.clasesjava.controller;

public class Cliente extends AbstractPersona{

    private int codigo;
    private int saldo;

  
   
    
    public Cliente(int id, String nombre, String apellido, String direccion, int telefono, int codigo, int saldo) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.saldo = saldo;
       
    }

     @Override
    public void ConsultarPersona() {
        System.out.println(this.getId()+" "+this.getNombre()+" "+this.getApellido()+" "
        +this.getDireccion()+" "+this.getTelefono());
    }
    
    public void ConsultarCliente(){
        System.out.println(codigo+" "+" "+saldo+" ");
    }
    
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
