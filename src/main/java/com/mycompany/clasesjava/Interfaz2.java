
package com.mycompany.clasesjava;

import com.mycompany.clasesjava.controller.Cliente;
import com.mycompany.clasesjava.controller.Empleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Interfaz2 extends javax.swing.JFrame implements ActionListener {

    
     List<Empleado> Listaempleado;
    public Interfaz2() {
        initComponents();
        Clientebtn.addActionListener(this);
        Salirbtn.addActionListener(this);
        btnguardar2.addActionListener(this);
        btnconsultar2.addActionListener(this);
          Listaempleado = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        idtxt2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombretxt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidotxt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numerotxt2 = new javax.swing.JTextField();
        btnguardar2 = new javax.swing.JButton();
        btnconsultar2 = new javax.swing.JButton();
        saldotxt2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        codigotxt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direcciontxt2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Clientebtn = new javax.swing.JButton();
        Salirbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID :");

        jLabel3.setText("NOMBRE");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO Y CONSULTA DE LOS EMPLEADOS");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("NUMERO:");

        btnguardar2.setText("GUARDAR");

        btnconsultar2.setText("CONSULTAR");
        btnconsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultar2ActionPerformed(evt);
            }
        });

        jLabel8.setText("SALDO:");

        jLabel7.setText("CODIGO:");

        jLabel6.setText("DIRRECION:");

        Clientebtn.setText("CLIENTE");

        Salirbtn.setText("SALIR");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombretxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numerotxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direcciontxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(saldotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(Salirbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Clientebtn)
                        .addGap(18, 18, 18)
                        .addComponent(btnconsultar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardar2)
                        .addContainerGap())))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nombretxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(apellidotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(numerotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(direcciontxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(codigotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(saldotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar2)
                    .addComponent(btnconsultar2)
                    .addComponent(Clientebtn)
                    .addComponent(Salirbtn))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultar2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientebtn;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JTextField apellidotxt2;
    private javax.swing.JButton btnconsultar2;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JTextField codigotxt2;
    private javax.swing.JTextField direcciontxt2;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField idtxt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombretxt2;
    private javax.swing.JTextField numerotxt2;
    private javax.swing.JTextField saldotxt2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

          if(e.getSource() == btnguardar2){
            String registroClientes = "RegistroEmpleado";
            Listaempleado.add(new Empleado(Integer.parseInt(idtxt2.getText()), 
                    nombretxt2.getText(), apellidotxt2.getText(), direcciontxt2.getText(), Integer.parseInt(numerotxt2.getText()), 
                    Integer.parseInt(codigotxt2.getText()), Integer.parseInt(saldotxt2.getText())));
        
            //Creamos la variable writer de la Clase BufferdWriter que es una clase para escribir en archivos
        //write recibe el parametro de new FileWrite, donde especificamos el nombre del archivo a escribir
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(registroClientes, true))) {
            for (Empleado empleadpo: Listaempleado) { //Recorremos todos los datos de la lista de ventas
                //Cadena para representar los registros actuales
                String registro = empleadpo.getId() + "-" + empleadpo.getNombre() +"-"+empleadpo.getApellido() + "-" + empleadpo.getDireccion() +"-"+
                        empleadpo.getTelefono() + "-" + empleadpo.getCodigo();
                
                
                    writer.write(registro);
                    writer.newLine();
                
            }
            System.out.println("Registro de ventas guardado en " + registroClientes);
        } catch (IOException a) {
            System.err.println("Error al guardar el registro de ventas: " + a.getMessage());
        }
    }
         if(e.getSource() == btnconsultar2){
            String registroEmpleados = "RegistroEmpleado";
            try (BufferedReader br = new BufferedReader(new FileReader(registroEmpleados))) {
            String line; //Para almacenar una linea del archivo de texto
            while ((line = br.readLine()) != null) { //Line es igual a la linea del archivo que no este vacia
                System.out.println(line);; //guardamos cada linea en la lista de los registros ya existentes
            }
        } catch (IOException b) { //En caso de haber un error
            b.printStackTrace();
        }
        }
          
          if(e.getSource() == Clientebtn){
              Interfaz inter = new Interfaz();
              inter.setVisible(true);
              this.dispose();
          }
          
          if(e.getSource() == Salirbtn){
              this.dispose();
          }
          
          
    }
}
