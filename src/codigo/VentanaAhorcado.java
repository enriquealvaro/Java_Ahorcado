/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Enrique Álvaro Escobar
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    String palabraOculta = "CETYS"; //palabra a adivinar

//estas variables cuanetan el numero de aciertos y fallos
    int numeroFallos = 0;
    int numeroAciertos = 0;

    public void chequeaLetra(String letra) {
        letra = letra.toUpperCase(); //convierto la letra en mayúscula
        palabraOculta = palabraOculta.toUpperCase();

        String palabraConGuiones = panelGuiones.getText();
        if (palabraOculta.contains(letra)) {

            for (int i = 0; i < palabraOculta.length(); i++) {
                if (palabraOculta.charAt(i) == letra.charAt(0)) {
                    palabraConGuiones = palabraConGuiones.substring(0, 2 * i)
                            + letra
                            + palabraConGuiones.substring(2 * i + 1);

                }
            }
            numeroAciertos++;
            panelGuiones.setText(palabraConGuiones);
            //si has acertado todas las letras se desactivan los botones
            //y se carga la imagen de ganar
            if (numeroAciertos == 5) {
                finPartida();
                dibujaGanar(0);
            }
        } else {
            numeroFallos++;
            dibujaImagen(numeroFallos);
            //si has agotado todas las oportunidades te salta has perido y se desactivan 
            //todas las teclas  
            if (numeroFallos == 5) {
                finPartida();
                dibujaImagen(6);
            }
        }
    }

    //Este metodo lo que hace es elegir una palabra aleatoria 
    //mediante un random
    public String palabraAleatoria() {
        String palabra = "CETYS";
        String[] palabraAleatoria = {"CETYS", "PERRO", "TAREA", "ARBOL"};
        Random r = new Random();
        palabra = palabraAleatoria[r.nextInt(palabraAleatoria.length)];
        palabra = palabra.toUpperCase();
        return palabra;

    }

    //Este metodo es para que no queden guiones de mas cuando coges la palabra random
    public void masMenosGuion() {
        String guion = "";
        for (int i = 0; i < palabraOculta.length(); i++) {
            guion += "_ ";
        }
        panelGuiones.setText(guion);

    }

    public void chequeaBoton(JButton miBoton) {
        miBoton.setEnabled(false);
        chequeaLetra(miBoton.getText());

    }

    //este metodo carga las imagenes del ahorcado cuando fallas
    private void dibujaImagen(int numeroImagen) {
        URL nombreImagen = null;
        switch (numeroImagen) {
            case 0:
                nombreImagen = getClass().getResource("/imagenes/0.jpg");
                break;
            case 1:
                nombreImagen = getClass().getResource("/imagenes/1.jpg");
                break;
            case 2:
                nombreImagen = getClass().getResource("/imagenes/2.jpg");
                break;
            case 3:
                nombreImagen = getClass().getResource("/imagenes/3.jpg");
                break;
            case 4:
                nombreImagen = getClass().getResource("/imagenes/4.jpg");
                break;
            case 5:
                nombreImagen = getClass().getResource("/imagenes/5.jpg");
                break;
            case 6:
                nombreImagen = getClass().getResource("/imagenes/hasPerdido.png");
                finPartida();
                break;
        }

        ImageIcon miImagen = new ImageIcon(
                new ImageIcon(nombreImagen).
                        getImage().
                        getScaledInstance(
                                panelAhorcado.getWidth(),
                                panelAhorcado.getHeight(),
                                Image.SCALE_DEFAULT));
        panelAhorcado.setIcon(miImagen);

    }

    //si ganas llamará a este método para que cargue la imagen de ganar
    private void dibujaGanar(int numeroImagen) {
        URL nombresImagen = null;
        switch (numeroImagen) {
            case 0:
                nombresImagen = getClass().getResource("/imagenes/acertasteTodo.png");
                break;
        }
        ImageIcon miImagen = new ImageIcon(
                new ImageIcon(nombresImagen).
                        getImage().
                        getScaledInstance(
                                panelAhorcado.getWidth(),
                                panelAhorcado.getHeight(),
                                Image.SCALE_DEFAULT));
        panelAhorcado.setIcon(miImagen);
    }

    public VentanaAhorcado() {
        initComponents();
        palabraOculta = palabraAleatoria();
        masMenosGuion();
        dibujaImagen(numeroFallos);

    }

    //desactivo todos los botones cuando la partida acabe
    public void finPartida() {
        botonA.setEnabled(false);
        botonB.setEnabled(false);
        botonC.setEnabled(false);
        botonD.setEnabled(false);
        botonE.setEnabled(false);
        botonF.setEnabled(false);
        botonG.setEnabled(false);
        botonH.setEnabled(false);
        botonI.setEnabled(false);
        botonJ.setEnabled(false);
        botonK.setEnabled(false);
        botonL.setEnabled(false);
        botonM.setEnabled(false);
        botonN.setEnabled(false);
        botonÑ.setEnabled(false);
        botonO.setEnabled(false);
        botonP.setEnabled(false);
        botonQ.setEnabled(false);
        botonR.setEnabled(false);
        botonS.setEnabled(false);
        botonT.setEnabled(false);
        botonU.setEnabled(false);
        botonV.setEnabled(false);
        botonW.setEnabled(false);
        botonX.setEnabled(false);
        botonY.setEnabled(false);
        botonZ.setEnabled(false);
        botoneEspacio.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGuiones = new javax.swing.JLabel();
        panelAhorcado = new javax.swing.JLabel();
        botonA = new javax.swing.JButton();
        botonB = new javax.swing.JButton();
        botonD = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonE = new javax.swing.JButton();
        botonG = new javax.swing.JButton();
        botonF = new javax.swing.JButton();
        botonL = new javax.swing.JButton();
        botonN = new javax.swing.JButton();
        botonM = new javax.swing.JButton();
        botonI = new javax.swing.JButton();
        botonK = new javax.swing.JButton();
        botonJ = new javax.swing.JButton();
        botonH = new javax.swing.JButton();
        botonR = new javax.swing.JButton();
        botonT = new javax.swing.JButton();
        botonS = new javax.swing.JButton();
        botonY = new javax.swing.JButton();
        botoneEspacio = new javax.swing.JButton();
        botonO = new javax.swing.JButton();
        botonZ = new javax.swing.JButton();
        botonQ = new javax.swing.JButton();
        botonV = new javax.swing.JButton();
        botonP = new javax.swing.JButton();
        botonÑ = new javax.swing.JButton();
        botonX = new javax.swing.JButton();
        botonW = new javax.swing.JButton();
        botonU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGuiones.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        panelGuiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelGuiones.setText("_ _ _ _ _");

        botonA.setText("A");
        botonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAActionPerformed(evt);
            }
        });

        botonB.setText("B");
        botonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBActionPerformed(evt);
            }
        });

        botonD.setText("D");
        botonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDActionPerformed(evt);
            }
        });

        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });

        botonE.setText("E");
        botonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEActionPerformed(evt);
            }
        });

        botonG.setText("G");
        botonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGActionPerformed(evt);
            }
        });

        botonF.setText("F");
        botonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFActionPerformed(evt);
            }
        });

        botonL.setText("L");
        botonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLActionPerformed(evt);
            }
        });

        botonN.setText("N");
        botonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNActionPerformed(evt);
            }
        });

        botonM.setText("M");
        botonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMActionPerformed(evt);
            }
        });

        botonI.setText("I");
        botonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIActionPerformed(evt);
            }
        });

        botonK.setText("K");
        botonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonKActionPerformed(evt);
            }
        });

        botonJ.setText("J");
        botonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJActionPerformed(evt);
            }
        });

        botonH.setText("H");
        botonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHActionPerformed(evt);
            }
        });

        botonR.setText("R");
        botonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRActionPerformed(evt);
            }
        });

        botonT.setText("T");
        botonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTActionPerformed(evt);
            }
        });

        botonS.setText("S");
        botonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSActionPerformed(evt);
            }
        });

        botonY.setText("Y");
        botonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYActionPerformed(evt);
            }
        });

        botoneEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneEspacioActionPerformed(evt);
            }
        });

        botonO.setText("O");
        botonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOActionPerformed(evt);
            }
        });

        botonZ.setText("Z");
        botonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonZActionPerformed(evt);
            }
        });

        botonQ.setText("Q");
        botonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQActionPerformed(evt);
            }
        });

        botonV.setText("V");
        botonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVActionPerformed(evt);
            }
        });

        botonP.setText("P");
        botonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPActionPerformed(evt);
            }
        });

        botonÑ.setText("Ñ");
        botonÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonÑActionPerformed(evt);
            }
        });

        botonX.setText("X");
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });

        botonW.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonW.setText("W");
        botonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonWActionPerformed(evt);
            }
        });

        botonU.setText("U");
        botonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelGuiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(panelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonW, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botoneEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonG, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelGuiones, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAhorcado, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonG, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonW, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botoneEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonAActionPerformed

    private void botonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonBActionPerformed

    private void botonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonDActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonCActionPerformed

    private void botonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonEActionPerformed

    private void botonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonGActionPerformed

    private void botonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonFActionPerformed

    private void botonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonLActionPerformed

    private void botonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonNActionPerformed

    private void botonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonMActionPerformed

    private void botonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonIActionPerformed

    private void botonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonKActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonKActionPerformed

    private void botonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonJActionPerformed

    private void botonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonHActionPerformed

    private void botonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonRActionPerformed

    private void botonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonTActionPerformed

    private void botonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonSActionPerformed

    private void botonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonYActionPerformed

    private void botoneEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneEspacioActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botoneEspacioActionPerformed

    private void botonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonOActionPerformed

    private void botonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonZActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonZActionPerformed

    private void botonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonQActionPerformed

    private void botonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonVActionPerformed

    private void botonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonPActionPerformed

    private void botonÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonÑActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonÑActionPerformed

    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonXActionPerformed

    private void botonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonWActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonWActionPerformed

    private void botonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonUActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonA;
    private javax.swing.JButton botonB;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonD;
    private javax.swing.JButton botonE;
    private javax.swing.JButton botonF;
    private javax.swing.JButton botonG;
    private javax.swing.JButton botonH;
    private javax.swing.JButton botonI;
    private javax.swing.JButton botonJ;
    private javax.swing.JButton botonK;
    private javax.swing.JButton botonL;
    private javax.swing.JButton botonM;
    private javax.swing.JButton botonN;
    private javax.swing.JButton botonO;
    private javax.swing.JButton botonP;
    private javax.swing.JButton botonQ;
    private javax.swing.JButton botonR;
    private javax.swing.JButton botonS;
    private javax.swing.JButton botonT;
    private javax.swing.JButton botonU;
    private javax.swing.JButton botonV;
    private javax.swing.JButton botonW;
    private javax.swing.JButton botonX;
    private javax.swing.JButton botonY;
    private javax.swing.JButton botonZ;
    private javax.swing.JButton botoneEspacio;
    private javax.swing.JButton botonÑ;
    private javax.swing.JLabel panelAhorcado;
    private javax.swing.JLabel panelGuiones;
    // End of variables declaration//GEN-END:variables
}
