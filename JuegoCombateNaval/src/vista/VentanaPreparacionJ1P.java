/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import controlador.Tablero;
import controlador.MemoriaIA;
import modelo.Barco;
import java.util.Random;
//import java.util.ArrayList;
/**
 *
 * @author User
 */
public class VentanaPreparacionJ1P extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPreparacionJ1P
     */
    Barco barco0=new Barco();
    Barco barco1=new Barco("Barco", 'B');
    Tablero tableroJ=new Tablero();
    Tablero tableroIA=new Tablero();
    MemoriaIA memoriaIA=new MemoriaIA();
    //ArrayList<Integer> memoriaIA = new ArrayList<>();
    int contador=0;
    public VentanaPreparacionJ1P() {
        initComponents();
        for (int i = 0; i < 10; i++) {
            tableroJ.agregarBarco(barco0);
        } 
        for (int i = 0; i < 10; i++) {
            tableroIA.agregarBarco(barco0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoC0 = new javax.swing.JTextField();
        textoC1 = new javax.swing.JTextField();
        textoC2 = new javax.swing.JTextField();
        textoC3 = new javax.swing.JTextField();
        textoC4 = new javax.swing.JTextField();
        textoC5 = new javax.swing.JTextField();
        textoC6 = new javax.swing.JTextField();
        textoC7 = new javax.swing.JTextField();
        textoC8 = new javax.swing.JTextField();
        textoC9 = new javax.swing.JTextField();
        textoBarcosColocados = new javax.swing.JTextField();
        textoBarcoColocado = new javax.swing.JTextField();
        botonColocar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botonBonbardear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoC0.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC0.setText("A");
        jPanel1.add(textoC0, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 25, -1));

        textoC1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC1.setText("A");
        textoC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoC1ActionPerformed(evt);
            }
        });
        jPanel1.add(textoC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 25, -1));

        textoC2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC2.setText("A");
        jPanel1.add(textoC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 25, -1));

        textoC3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC3.setText("A");
        jPanel1.add(textoC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 25, -1));

        textoC4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC4.setText("A");
        jPanel1.add(textoC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 25, -1));

        textoC5.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC5.setText("A");
        jPanel1.add(textoC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 25, -1));

        textoC6.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC6.setText("A");
        jPanel1.add(textoC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 25, -1));

        textoC7.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC7.setText("A");
        jPanel1.add(textoC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 25, -1));

        textoC8.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC8.setText("A");
        jPanel1.add(textoC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 25, -1));

        textoC9.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoC9.setText("A");
        jPanel1.add(textoC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 25, -1));

        textoBarcosColocados.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        textoBarcosColocados.setText("0");
        jPanel1.add(textoBarcosColocados, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 25, -1));

        textoBarcoColocado.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jPanel1.add(textoBarcoColocado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 50, -1));

        botonColocar.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        botonColocar.setText("COLOCAR");
        botonColocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColocarActionPerformed(evt);
            }
        });
        jPanel1.add(botonColocar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel1.setText("Campo1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel2.setText("Campo2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 60, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel3.setText("Campo3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel4.setText("Campo4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel5.setText("Campo5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel6.setText("Campo6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel7.setText("Campo7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel8.setText("Campo8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel9.setText("Campo9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel10.setText("Campo10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 60, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel11.setText("N° del campo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 330, 90, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel12.setText("Barcos colocados");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, -1));

        botonBonbardear.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        botonBonbardear.setText("BOMBARDEAR");
        botonBonbardear.setEnabled(false);
        botonBonbardear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBonbardearActionPerformed(evt);
            }
        });
        jPanel1.add(botonBonbardear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spr1.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoC1ActionPerformed

    private void botonColocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColocarActionPerformed
        // TODO add your handling code here:
        int posBarco = Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1;
        if (posBarco == 0) {
            this.textoC0.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 1) {
            this.textoC1.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 2) {
            this.textoC2.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 3) {
            this.textoC3.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 4) {
            this.textoC4.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 5) {
            this.textoC5.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 6) {
            this.textoC6.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 7) {
            this.textoC7.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 8) {
            this.textoC8.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else if (posBarco == 9) {
            this.textoC9.setText("B");
            contador = contador + 1;
            this.textoBarcosColocados.setText(String.valueOf(contador));
            if (contador < 3) {
                tableroJ.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco1);
                this.textoBarcoColocado.setText("");
            } else {
                this.textoBarcoColocado.setText("");
                this.textoBarcosColocados.setText("");
                this.botonColocar.setVisible(false);
                this.botonBonbardear.setEnabled(true);
                this.jLabel12.setText("IA bombardea posición");
                for (int i = 0; i < 3; i++) {
                    int intAleatorio = (int) (Math.random() * 9);
                    while (tableroIA.conseguirBarco(intAleatorio) == 'B') {
                        intAleatorio = (int) (Math.random() * 9);
                    }
                    tableroIA.modificarBarco(intAleatorio, barco1);
                    System.out.println(intAleatorio);
                }
            }
        } else {
            System.out.println("Error numero fuera de rango");
        }
    }//GEN-LAST:event_botonColocarActionPerformed

    private void botonBonbardearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBonbardearActionPerformed
        // TODO add your handling code here:
        tableroIA.modificarBarco(Integer.parseInt(this.textoBarcoColocado.getText().trim()) - 1, barco0);
        this.textoBarcoColocado.setText("");
        int intAleatorio = (int) (Math.random() * 9);
        while (memoriaIA.validarNumero(intAleatorio)==true) {
            intAleatorio = (int) (Math.random() * 9);
        }
        memoriaIA.agregarNumero(intAleatorio);
        System.out.println(intAleatorio);
        if (intAleatorio == 0) {
            this.textoC0.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("1");
        } else if (intAleatorio == 1) {
            this.textoC1.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("2");
        } else if (intAleatorio == 2) {
            this.textoC2.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("3");
        } else if (intAleatorio == 3) {
            this.textoC3.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("4");
        } else if (intAleatorio == 4) {
            this.textoC4.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("5");
        } else if (intAleatorio == 5) {
            this.textoC5.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("6");
        } else if (intAleatorio == 6) {
            this.textoC6.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("7");
        } else if (intAleatorio == 7) {
            this.textoC7.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("8");
        } else if (intAleatorio == 8) {
            this.textoC8.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("9");
        } else if (intAleatorio == 9) {
            this.textoC9.setText("A");
            tableroJ.modificarBarco(intAleatorio, barco0);
            this.textoBarcosColocados.setText("10");
        }
        if (tableroIA.validarVictoria() == true) {
            System.out.println("Victoria");
            this.setVisible(false);
            new VentanaVictoria().setVisible(true);
            memoriaIA.limpiarMemoria();
            for (int i = 0; i < 10; i++) {
                tableroJ.agregarBarco(barco0);
            }
            for (int i = 0; i < 10; i++) {
                tableroIA.agregarBarco(barco0);
            }
        } else if (tableroJ.validarVictoria() == true) {
            System.out.println("Derrota");
            this.setVisible(false);
           new VentanaDerrota().setVisible(true);
            memoriaIA.limpiarMemoria();
            for (int i = 0; i < 10; i++) {
                tableroJ.agregarBarco(barco0);
            }
            for (int i = 0; i < 10; i++) {
                tableroIA.agregarBarco(barco0);
            }
        } else if (tableroJ.validarVictoria() == true && tableroJ.validarVictoria() == true) {
            System.out.println("Empate");
            this.setVisible(false);
            new VentanaDerrota().setVisible(true);
            memoriaIA.limpiarMemoria();
            for (int i = 0; i < 10; i++) {
                tableroJ.agregarBarco(barco0);
            }
            for (int i = 0; i < 10; i++) {
                tableroIA.agregarBarco(barco0);
            }
        }
    }//GEN-LAST:event_botonBonbardearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPreparacionJ1P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreparacionJ1P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreparacionJ1P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreparacionJ1P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPreparacionJ1P().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBonbardear;
    private javax.swing.JButton botonColocar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoBarcoColocado;
    private javax.swing.JTextField textoBarcosColocados;
    private javax.swing.JTextField textoC0;
    private javax.swing.JTextField textoC1;
    private javax.swing.JTextField textoC2;
    private javax.swing.JTextField textoC3;
    private javax.swing.JTextField textoC4;
    private javax.swing.JTextField textoC5;
    private javax.swing.JTextField textoC6;
    private javax.swing.JTextField textoC7;
    private javax.swing.JTextField textoC8;
    private javax.swing.JTextField textoC9;
    // End of variables declaration//GEN-END:variables
}
