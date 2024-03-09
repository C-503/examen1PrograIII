
package com.mycompany.clasesjava;

import com.mycompany.clasesjava.controller.Cliente;
import com.mycompany.clasesjava.controller.Empleado;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Interfaz extends javax.swing.JFrame implements ActionListener{

    List<Cliente> Listacliente;
    List<Empleado> Listaempleado;
    public Interfaz() {
        initComponents();
        salirbtn.addActionListener(this);
        btnempleado.addActionListener(this);
        btnguardar.addActionListener(this);
        btnconsultar.addActionListener(this);
       Listacliente = new ArrayList<>();
       Listaempleado = new ArrayList<>();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numerotxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        saldotxt = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnempleado = new javax.swing.JButton();
        salirbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO Y CONSULTA DE LOS CLIENTES");

        jLabel2.setText("ID :");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("NUMERO:");

        jLabel6.setText("DIRRECION:");

        jLabel7.setText("CODIGO:");

        jLabel8.setText("SALDO:");

        saldotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldotxtActionPerformed(evt);
            }
        });

        btnguardar.setText("GUARDAR");

        btnconsultar.setText("CONSULTAR");

        btnempleado.setText("Empleado");

        salirbtn.setText("SALIR");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direcciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigotxt))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(salirbtn)
                                .addGap(22, 22, 22)
                                .addComponent(btnempleado)))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(btnconsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnguardar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numerotxt))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(numerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(direcciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(saldotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultar)
                    .addComponent(btnguardar)
                    .addComponent(btnempleado)
                    .addComponent(salirbtn))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saldotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldotxtActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnempleado;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField numerotxt;
    private javax.swing.JTextField saldotxt;
    private javax.swing.JButton salirbtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnguardar){
            String registroClientes = "RegistroClientes";
            Listacliente.add(new Cliente(Integer.parseInt(idtxt.getText()), 
                    nombretxt.getText(), apellidotxt.getText(), direcciontxt.getText(), Integer.parseInt(numerotxt.getText()), 
                    Integer.parseInt(codigotxt.getText()), Integer.parseInt(saldotxt.getText())));
        
            //Creamos la variable writer de la Clase BufferdWriter que es una clase para escribir en archivos
        //write recibe el parametro de new FileWrite, donde especificamos el nombre del archivo a escribir
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(registroClientes, true))) {
            for (Cliente cliente : Listacliente) { //Recorremos todos los datos de la lista de ventas
                //Cadena para representar los registros actuales
                String registro = cliente.getId() + "-" + cliente.getNombre() +"-"+cliente.getApellido() + "-" + cliente.getDireccion() +"-"+
                        cliente.getTelefono() + "-" + cliente.getCodigo() +"-"+cliente.getSaldo();
                
                
                    writer.write(registro);
                    writer.newLine();
                
            }
            System.out.println("Registro de ventas guardado en " + registroClientes);
        } catch (IOException a) {
            System.err.println("Error al guardar el registro de ventas: " + a.getMessage());
        }
    }
        if(e.getSource() == btnconsultar){
            String clientes = "RegistroClientes";
            try (BufferedReader br = new BufferedReader(new FileReader(clientes))) {
            String line; //Para almacenar una linea del archivo de texto
            while ((line = br.readLine()) != null) { //Line es igual a la linea del archivo que no este vacia
                System.out.println(line);; //guardamos cada linea en la lista de los registros ya existentes
            }
        } catch (IOException b) { //En caso de haber un error
            b.printStackTrace();
        }
        }

       if(e.getSource() == btnempleado){
          Interfaz2 inter2 = new Interfaz2();
          inter2.setVisible(true);
          this.dispose();
       }
       if(e.getSource() == salirbtn){
           this.dispose();
       }
    }
}

