/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class Registrar extends javax.swing.JPanel {

    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        codprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nombreprod = new javax.swing.JTextField();
        adv = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(436, 434));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Registrar Venta");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Precio");

        precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precioMouseClicked(evt);
            }
        });
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        codprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codprodActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Cod producto:");

        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Total:");

        jButton1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Nombre");

        nombreprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreprodMouseClicked(evt);
            }
        });
        nombreprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreprodActionPerformed(evt);
            }
        });

        adv.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        adv.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(adv, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(precio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreprod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(codprod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(total))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nombreprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(codprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(adv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private Connection conn = null;
    
    public void realizarConexion() {
        String urlDatabase = "jdbc:postgresql://localhost:5432/TallerBD";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, "postgres", "1234");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        if (conn != null) {
            System.out.println("La conexión se realizo sin problemas! ");
        }
    }

    public void desconectar() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException ex) {
            System.out.println("problema al desconectar la BD");
        }
        System.out.println("conn cerrada");
    }

    public void insertar() {

        if (conn != null) {
            Statement s = null;
            ResultSet I = consulta();

            try {
                adv.setText(advertencia());

                //Si I no es nulo, es porque se arrojo un query por lo tanto. existe un dato con esa id
                //T query que consulta si existe un producto con ese cod
               //Si existe el producto, guardamos el preciounitario segun el modelo CPP en T[0]
                String T[] = new String[1];
             
                while (I.next()) {
                    T[0] = I.getString(1);
                }

                if (T[0] != null) {
                    s = conn.createStatement();
                    System.out.println("pruebeichon");
                    s.executeQuery("INSERT INTO venta "
                            + "(codprod, nombre, preciounit, cantidad, total) VALUES ("
                            + codprod.getText()
                            + ",'" + nombreprod.getText()
                            + "'," + precio.getText()
                            + "," + cantidad.getText()
                            + "," + total.getText()
                            + ");"
                            + "UPDATE inventario SET cantidad=cantidad-" + cantidad.getText()
                            + " WHERE codProd=" + codprod.getText() + ";UPDATE inventario SET "
                            + "saldo="+precio.getText()+"*"+cantidad.getText()
                            + "WHERE codProd=" + codprod.getText());
                }
            } catch (Exception ex) {
                System.out.println("insertado");
            }
        }
    }

    public ResultSet consulta() {
        ResultSet n = null;
        try {
            Statement st = conn.createStatement();
            n = st.executeQuery("SELECT preciounit FROM inventario WHERE codprod = " + codprod.getText());

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return n;
    }

    public String advertencia() throws SQLException {
        String S = null;

        //ResultSet Q = consulta();
        //T query que consulta si existe un producto con ese cod
       // String T[] = new String[1];
       
        //while (Q.next()) {
        //    T[0] = Q.getString(1);
        //}

        if (precio.getText().isEmpty() || codprod.getText().isEmpty()
                || cantidad.getText().isEmpty() || total.getText().isEmpty()
                || nombreprod.getText().isEmpty()) {
            S = "<html>Error al guardar el dato. Existen campos vacíos</html>";
        }  else {
            S = " ";
        }
        return S;
    }
    public void limpiar(){
        precio.setText("");
        codprod.setText("");
        cantidad.setText("");
        nombreprod.setText("");
        total.setText("");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        realizarConexion();
        insertar();
        limpiar();
        desconectar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreprodMouseClicked

    }//GEN-LAST:event_nombreprodMouseClicked

    private void nombreprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreprodActionPerformed

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked
        
        int cant = Integer.parseInt(cantidad.getText());
        int preciounit = Integer.parseInt(precio.getText());
        int newtotal = cant*preciounit;
        
        total.setText(""+newtotal+"");
    }//GEN-LAST:event_totalMouseClicked

    private void precioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioMouseClicked
        realizarConexion();
        String data[] = new String[1];
        ResultSet n = consulta();
        try {
            while (n.next()) {
                data[0] = n.getString(1);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        if (data[0] == null) {
        } else {
            precio.setText(data[0]);
        }
        desconectar();
    }//GEN-LAST:event_precioMouseClicked

    private void codprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codprodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adv;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codprod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreprod;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}