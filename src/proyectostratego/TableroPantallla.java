/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectostratego;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author hnleo
 */
public class TableroPantallla extends javax.swing.JFrame {

    /**
     * Creates new form TableroPantallla
     */
   private Tablero iniciar;
   
    public TableroPantallla() {
        initComponents();
        setLocationRelativeTo(null);
        
        cargarTablero();
     
       
    }
    
    private void cargarTablero(){
        iniciar = new Tablero(10, 10, "/images/tablero.png");
        iniciar.setSize(panelTablero.getWidth(), panelTablero.getHeight());
        iniciar.setBounds(0, 0, panelTablero.getWidth(), panelTablero.getHeight());
        panelTablero.setLayout(new BorderLayout());
        panelTablero.add(iniciar, BorderLayout.CENTER);
 
        panelTablero.repaint();
        panelTablero.revalidate();
        
        botonesConfiguracion();
 
    }
    public JButton botonesArray[][];
    public void botonesConfiguracion(){
        botonesArray = new JButton[10][10];
        //Casillas de Heroes
        botonesArray[0][0]= heroes0_0; 
        botonesArray[0][1]= heroes0_1; 
        botonesArray[0][2]= heroes0_2; 
        botonesArray[0][3]= heroes0_3; 
        botonesArray[0][4]= heroes0_4; 
        botonesArray[0][5]= heroes0_5; 
        botonesArray[0][6]= heroes0_6; 
        botonesArray[0][7]= heroes0_7; 
        botonesArray[0][8]= heroes0_8; 
        botonesArray[0][9]= heroes0_9; 
        botonesArray[1][0]= heroes1_0; 
        botonesArray[1][1]= heroes1_1; 
        botonesArray[1][2]= heroes1_2; 
        botonesArray[1][3]= heroes1_3; 
        botonesArray[1][4]= heroes1_4; 
        botonesArray[1][5]= heroes1_5; 
        botonesArray[1][6]= heroes1_6; 
        botonesArray[1][7]= heroes1_7; 
        botonesArray[1][8]= heroes1_8; 
        botonesArray[1][9]= heroes1_9;
        botonesArray[2][0]= heroes2_0; 
        botonesArray[2][1]= heroes2_1; 
        botonesArray[2][2]= heroes2_2; 
        botonesArray[2][3]= heroes2_3; 
        botonesArray[2][4]= heroes2_4; 
        botonesArray[2][5]= heroes2_5; 
        botonesArray[2][6]= heroes2_6; 
        botonesArray[2][7]= heroes2_7; 
        botonesArray[2][8]= heroes2_8; 
        botonesArray[2][9]= heroes2_9;
        botonesArray[3][0]= heroes3_0; 
        botonesArray[3][1]= heroes3_1; 
        botonesArray[3][2]= heroes3_2; 
        botonesArray[3][3]= heroes3_3; 
        botonesArray[3][4]= heroes3_4; 
        botonesArray[3][5]= heroes3_5; 
        botonesArray[3][6]= heroes3_6; 
        botonesArray[3][7]= heroes3_7; 
        botonesArray[3][8]= heroes3_8; 
        botonesArray[3][9]= heroes3_9;
        
        //Casillas vacias
        botonesArray[4][0]= casilla4_0; 
        botonesArray[4][1]= casilla4_1; 
        botonesArray[4][2]= casilla4_2; 
        botonesArray[4][3]= casilla4_3; 
        botonesArray[4][4]= casilla4_4; 
        botonesArray[4][5]= casilla4_5; 
        botonesArray[4][6]= casilla4_6; 
        botonesArray[4][7]= casilla4_7; 
        botonesArray[4][8]= casilla4_8; 
        botonesArray[4][9]= casilla4_9;
        botonesArray[5][0]= casilla5_0; 
        botonesArray[5][1]= casilla5_1; 
        botonesArray[5][2]= casilla5_2; 
        botonesArray[5][3]= casilla5_3; 
        botonesArray[5][4]= casilla5_4; 
        botonesArray[5][5]= casilla5_5; 
        botonesArray[5][6]= casilla5_6; 
        botonesArray[5][7]= casilla5_7; 
        botonesArray[5][8]= casilla5_8; 
        botonesArray[5][9]= casilla5_9;
        
        //Casillas Villanos
        botonesArray[6][0]= villanos6_0; 
        botonesArray[6][1]= villanos6_1; 
        botonesArray[6][2]= villanos6_2; 
        botonesArray[6][3]= villanos6_3; 
        botonesArray[6][4]= villanos6_4; 
        botonesArray[6][5]= villanos6_5; 
        botonesArray[6][6]= villanos6_6; 
        botonesArray[6][7]= villanos6_7; 
        botonesArray[6][8]= villanos6_8; 
        botonesArray[6][9]= villanos6_9;
        botonesArray[7][0]= villanos7_0; 
        botonesArray[7][1]= villanos7_1; 
        botonesArray[7][2]= villanos7_2; 
        botonesArray[7][3]= villanos7_3; 
        botonesArray[7][4]= villanos7_4; 
        botonesArray[7][5]= villanos7_5; 
        botonesArray[7][6]= villanos7_6; 
        botonesArray[7][7]= villanos7_7; 
        botonesArray[7][8]= villanos7_8; 
        botonesArray[7][9]= villanos7_9;
        botonesArray[8][0]= villanos8_0; 
        botonesArray[8][1]= villanos8_1; 
        botonesArray[8][2]= villanos8_2; 
        botonesArray[8][3]= villanos8_3; 
        botonesArray[8][4]= villanos8_4; 
        botonesArray[8][5]= villanos8_5; 
        botonesArray[8][6]= villanos8_6; 
        botonesArray[8][7]= villanos8_7; 
        botonesArray[8][8]= villanos8_8; 
        botonesArray[8][9]= villanos8_9;
        botonesArray[9][0]= villanos9_0; 
        botonesArray[9][1]= villanos9_1; 
        botonesArray[9][2]= villanos9_2; 
        botonesArray[9][3]= villanos9_3; 
        botonesArray[9][4]= villanos9_4; 
        botonesArray[9][5]= villanos9_5; 
        botonesArray[9][6]= villanos9_6; 
        botonesArray[9][7]= villanos9_7; 
        botonesArray[9][8]= villanos9_8; 
        botonesArray[9][9]= villanos9_9;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                final int fila = i;
                final int columna = j;
                botonesArray[i][j].addActionListener(e-> clickBoton(fila, columna));
                
            }
        }
    }

    private void clickBoton(int fila, int columna){
        iniciar.seleccionCasilla(fila, columna, botonesArray[fila][columna]);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEliminaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaEliminados = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        panelTablero = new javax.swing.JPanel();
        villanos9_0 = new javax.swing.JButton();
        villanos9_1 = new javax.swing.JButton();
        villanos9_2 = new javax.swing.JButton();
        villanos9_3 = new javax.swing.JButton();
        villanos9_4 = new javax.swing.JButton();
        villanos9_5 = new javax.swing.JButton();
        villanos9_6 = new javax.swing.JButton();
        villanos9_7 = new javax.swing.JButton();
        villanos9_8 = new javax.swing.JButton();
        villanos9_9 = new javax.swing.JButton();
        villanos8_0 = new javax.swing.JButton();
        villanos8_1 = new javax.swing.JButton();
        villanos8_2 = new javax.swing.JButton();
        villanos8_3 = new javax.swing.JButton();
        villanos8_4 = new javax.swing.JButton();
        villanos8_5 = new javax.swing.JButton();
        villanos8_6 = new javax.swing.JButton();
        villanos8_7 = new javax.swing.JButton();
        villanos8_8 = new javax.swing.JButton();
        villanos8_9 = new javax.swing.JButton();
        villanos7_0 = new javax.swing.JButton();
        villanos7_1 = new javax.swing.JButton();
        villanos7_2 = new javax.swing.JButton();
        villanos7_3 = new javax.swing.JButton();
        villanos7_4 = new javax.swing.JButton();
        villanos7_5 = new javax.swing.JButton();
        villanos7_6 = new javax.swing.JButton();
        villanos7_7 = new javax.swing.JButton();
        villanos7_8 = new javax.swing.JButton();
        villanos7_9 = new javax.swing.JButton();
        villanos6_0 = new javax.swing.JButton();
        villanos6_1 = new javax.swing.JButton();
        villanos6_2 = new javax.swing.JButton();
        villanos6_3 = new javax.swing.JButton();
        villanos6_4 = new javax.swing.JButton();
        villanos6_5 = new javax.swing.JButton();
        villanos6_6 = new javax.swing.JButton();
        villanos6_7 = new javax.swing.JButton();
        villanos6_8 = new javax.swing.JButton();
        villanos6_9 = new javax.swing.JButton();
        casilla5_0 = new javax.swing.JButton();
        casilla5_1 = new javax.swing.JButton();
        casilla5_2 = new javax.swing.JButton();
        casilla5_3 = new javax.swing.JButton();
        casilla5_4 = new javax.swing.JButton();
        casilla5_5 = new javax.swing.JButton();
        casilla5_6 = new javax.swing.JButton();
        casilla5_7 = new javax.swing.JButton();
        casilla5_8 = new javax.swing.JButton();
        casilla5_9 = new javax.swing.JButton();
        casilla4_0 = new javax.swing.JButton();
        casilla4_1 = new javax.swing.JButton();
        casilla4_2 = new javax.swing.JButton();
        casilla4_3 = new javax.swing.JButton();
        casilla4_4 = new javax.swing.JButton();
        casilla4_5 = new javax.swing.JButton();
        casilla4_6 = new javax.swing.JButton();
        casilla4_7 = new javax.swing.JButton();
        casilla4_8 = new javax.swing.JButton();
        casilla4_9 = new javax.swing.JButton();
        heroes3_0 = new javax.swing.JButton();
        heroes3_1 = new javax.swing.JButton();
        heroes3_2 = new javax.swing.JButton();
        heroes3_3 = new javax.swing.JButton();
        heroes3_4 = new javax.swing.JButton();
        heroes3_5 = new javax.swing.JButton();
        heroes3_6 = new javax.swing.JButton();
        heroes3_7 = new javax.swing.JButton();
        heroes3_8 = new javax.swing.JButton();
        heroes3_9 = new javax.swing.JButton();
        heroes2_0 = new javax.swing.JButton();
        heroes2_1 = new javax.swing.JButton();
        heroes2_2 = new javax.swing.JButton();
        heroes2_3 = new javax.swing.JButton();
        heroes2_4 = new javax.swing.JButton();
        heroes2_5 = new javax.swing.JButton();
        heroes2_6 = new javax.swing.JButton();
        heroes2_7 = new javax.swing.JButton();
        heroes2_8 = new javax.swing.JButton();
        heroes2_9 = new javax.swing.JButton();
        heroes1_0 = new javax.swing.JButton();
        heroes1_1 = new javax.swing.JButton();
        heroes1_2 = new javax.swing.JButton();
        heroes1_3 = new javax.swing.JButton();
        heroes1_4 = new javax.swing.JButton();
        heroes1_5 = new javax.swing.JButton();
        heroes1_6 = new javax.swing.JButton();
        heroes1_7 = new javax.swing.JButton();
        heroes1_8 = new javax.swing.JButton();
        heroes1_9 = new javax.swing.JButton();
        heroes0_0 = new javax.swing.JButton();
        heroes0_1 = new javax.swing.JButton();
        heroes0_2 = new javax.swing.JButton();
        heroes0_3 = new javax.swing.JButton();
        heroes0_4 = new javax.swing.JButton();
        heroes0_5 = new javax.swing.JButton();
        heroes0_6 = new javax.swing.JButton();
        heroes0_7 = new javax.swing.JButton();
        heroes0_8 = new javax.swing.JButton();
        heroes0_9 = new javax.swing.JButton();
        panelVillanos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelHeroes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 920));
        setMinimumSize(new java.awt.Dimension(1000, 920));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 920));

        panelEliminaciones.setBackground(new java.awt.Color(255, 255, 51));
        panelEliminaciones.setMaximumSize(new java.awt.Dimension(200, 440));
        panelEliminaciones.setMinimumSize(new java.awt.Dimension(200, 440));
        panelEliminaciones.setPreferredSize(new java.awt.Dimension(200, 440));
        panelEliminaciones.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        areaEliminados.setColumns(20);
        areaEliminados.setRows(5);
        jScrollPane1.setViewportView(areaEliminados);

        panelEliminaciones.add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 160, 640);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminaciones.png"))); // NOI18N
        panelEliminaciones.add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 800);

        getContentPane().add(panelEliminaciones, java.awt.BorderLayout.LINE_END);

        panelTablero.setBackground(new java.awt.Color(255, 255, 255));
        panelTablero.setMaximumSize(new java.awt.Dimension(800, 800));
        panelTablero.setMinimumSize(new java.awt.Dimension(800, 800));
        panelTablero.setPreferredSize(new java.awt.Dimension(800, 800));
        panelTablero.setLayout(new java.awt.GridLayout(10, 10));

        villanos9_0.setText("jButton1");
        villanos9_0.setBorderPainted(false);
        villanos9_0.setContentAreaFilled(false);
        villanos9_0.setFocusPainted(false);
        panelTablero.add(villanos9_0);

        villanos9_1.setText("jButton2");
        villanos9_1.setBorderPainted(false);
        villanos9_1.setContentAreaFilled(false);
        villanos9_1.setFocusPainted(false);
        panelTablero.add(villanos9_1);

        villanos9_2.setText("jButton3");
        villanos9_2.setBorderPainted(false);
        villanos9_2.setContentAreaFilled(false);
        villanos9_2.setFocusPainted(false);
        panelTablero.add(villanos9_2);

        villanos9_3.setText("jButton3");
        villanos9_3.setBorderPainted(false);
        villanos9_3.setContentAreaFilled(false);
        villanos9_3.setFocusPainted(false);
        panelTablero.add(villanos9_3);

        villanos9_4.setText("jButton3");
        villanos9_4.setBorderPainted(false);
        villanos9_4.setContentAreaFilled(false);
        villanos9_4.setFocusPainted(false);
        panelTablero.add(villanos9_4);

        villanos9_5.setText("jButton3");
        villanos9_5.setBorderPainted(false);
        villanos9_5.setContentAreaFilled(false);
        villanos9_5.setFocusPainted(false);
        panelTablero.add(villanos9_5);

        villanos9_6.setText("jButton3");
        villanos9_6.setBorderPainted(false);
        villanos9_6.setContentAreaFilled(false);
        villanos9_6.setFocusPainted(false);
        panelTablero.add(villanos9_6);

        villanos9_7.setText("jButton3");
        villanos9_7.setBorderPainted(false);
        villanos9_7.setContentAreaFilled(false);
        villanos9_7.setFocusPainted(false);
        panelTablero.add(villanos9_7);

        villanos9_8.setText("jButton3");
        villanos9_8.setBorderPainted(false);
        villanos9_8.setContentAreaFilled(false);
        villanos9_8.setFocusPainted(false);
        panelTablero.add(villanos9_8);

        villanos9_9.setText("jButton3");
        villanos9_9.setBorderPainted(false);
        villanos9_9.setContentAreaFilled(false);
        villanos9_9.setFocusPainted(false);
        panelTablero.add(villanos9_9);

        villanos8_0.setText("jButton3");
        villanos8_0.setBorderPainted(false);
        villanos8_0.setContentAreaFilled(false);
        villanos8_0.setFocusPainted(false);
        panelTablero.add(villanos8_0);

        villanos8_1.setText("jButton3");
        villanos8_1.setBorderPainted(false);
        villanos8_1.setContentAreaFilled(false);
        villanos8_1.setFocusPainted(false);
        panelTablero.add(villanos8_1);

        villanos8_2.setText("jButton3");
        villanos8_2.setBorderPainted(false);
        villanos8_2.setContentAreaFilled(false);
        villanos8_2.setFocusPainted(false);
        panelTablero.add(villanos8_2);

        villanos8_3.setText("jButton3");
        villanos8_3.setBorderPainted(false);
        villanos8_3.setContentAreaFilled(false);
        villanos8_3.setFocusPainted(false);
        panelTablero.add(villanos8_3);

        villanos8_4.setText("jButton3");
        villanos8_4.setBorderPainted(false);
        villanos8_4.setContentAreaFilled(false);
        villanos8_4.setFocusPainted(false);
        panelTablero.add(villanos8_4);

        villanos8_5.setText("jButton3");
        villanos8_5.setBorderPainted(false);
        villanos8_5.setContentAreaFilled(false);
        villanos8_5.setFocusPainted(false);
        villanos8_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villanos8_5ActionPerformed(evt);
            }
        });
        panelTablero.add(villanos8_5);

        villanos8_6.setText("jButton3");
        villanos8_6.setBorderPainted(false);
        villanos8_6.setContentAreaFilled(false);
        villanos8_6.setFocusPainted(false);
        panelTablero.add(villanos8_6);

        villanos8_7.setText("jButton3");
        villanos8_7.setBorderPainted(false);
        villanos8_7.setContentAreaFilled(false);
        villanos8_7.setFocusPainted(false);
        panelTablero.add(villanos8_7);

        villanos8_8.setText("jButton3");
        villanos8_8.setBorderPainted(false);
        villanos8_8.setContentAreaFilled(false);
        villanos8_8.setFocusPainted(false);
        panelTablero.add(villanos8_8);

        villanos8_9.setText("jButton3");
        villanos8_9.setBorderPainted(false);
        villanos8_9.setContentAreaFilled(false);
        villanos8_9.setFocusPainted(false);
        panelTablero.add(villanos8_9);

        villanos7_0.setText("jButton3");
        villanos7_0.setBorderPainted(false);
        villanos7_0.setContentAreaFilled(false);
        villanos7_0.setFocusPainted(false);
        villanos7_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villanos7_0ActionPerformed(evt);
            }
        });
        panelTablero.add(villanos7_0);

        villanos7_1.setText("jButton3");
        villanos7_1.setBorderPainted(false);
        villanos7_1.setContentAreaFilled(false);
        villanos7_1.setFocusPainted(false);
        panelTablero.add(villanos7_1);

        villanos7_2.setText("jButton3");
        villanos7_2.setBorderPainted(false);
        villanos7_2.setContentAreaFilled(false);
        villanos7_2.setFocusPainted(false);
        panelTablero.add(villanos7_2);

        villanos7_3.setText("jButton3");
        villanos7_3.setBorderPainted(false);
        villanos7_3.setContentAreaFilled(false);
        villanos7_3.setFocusPainted(false);
        panelTablero.add(villanos7_3);

        villanos7_4.setText("jButton3");
        villanos7_4.setBorderPainted(false);
        villanos7_4.setContentAreaFilled(false);
        villanos7_4.setFocusPainted(false);
        panelTablero.add(villanos7_4);

        villanos7_5.setText("jButton3");
        villanos7_5.setBorderPainted(false);
        villanos7_5.setContentAreaFilled(false);
        villanos7_5.setFocusPainted(false);
        panelTablero.add(villanos7_5);

        villanos7_6.setText("jButton3");
        villanos7_6.setBorderPainted(false);
        villanos7_6.setContentAreaFilled(false);
        villanos7_6.setFocusPainted(false);
        panelTablero.add(villanos7_6);

        villanos7_7.setText("jButton3");
        villanos7_7.setBorderPainted(false);
        villanos7_7.setContentAreaFilled(false);
        villanos7_7.setFocusPainted(false);
        panelTablero.add(villanos7_7);

        villanos7_8.setText("jButton3");
        villanos7_8.setBorderPainted(false);
        villanos7_8.setContentAreaFilled(false);
        villanos7_8.setFocusPainted(false);
        panelTablero.add(villanos7_8);

        villanos7_9.setText("jButton3");
        villanos7_9.setBorderPainted(false);
        villanos7_9.setContentAreaFilled(false);
        villanos7_9.setFocusPainted(false);
        panelTablero.add(villanos7_9);

        villanos6_0.setText("jButton3");
        villanos6_0.setBorderPainted(false);
        villanos6_0.setContentAreaFilled(false);
        villanos6_0.setFocusPainted(false);
        panelTablero.add(villanos6_0);

        villanos6_1.setText("jButton3");
        villanos6_1.setBorderPainted(false);
        villanos6_1.setContentAreaFilled(false);
        villanos6_1.setFocusPainted(false);
        panelTablero.add(villanos6_1);

        villanos6_2.setText("jButton3");
        villanos6_2.setBorderPainted(false);
        villanos6_2.setContentAreaFilled(false);
        villanos6_2.setFocusPainted(false);
        panelTablero.add(villanos6_2);

        villanos6_3.setText("jButton3");
        villanos6_3.setBorderPainted(false);
        villanos6_3.setContentAreaFilled(false);
        villanos6_3.setFocusPainted(false);
        panelTablero.add(villanos6_3);

        villanos6_4.setText("jButton3");
        villanos6_4.setBorderPainted(false);
        villanos6_4.setContentAreaFilled(false);
        villanos6_4.setFocusPainted(false);
        panelTablero.add(villanos6_4);

        villanos6_5.setText("jButton3");
        villanos6_5.setBorderPainted(false);
        villanos6_5.setContentAreaFilled(false);
        villanos6_5.setFocusPainted(false);
        panelTablero.add(villanos6_5);

        villanos6_6.setText("jButton3");
        villanos6_6.setBorderPainted(false);
        villanos6_6.setContentAreaFilled(false);
        villanos6_6.setFocusPainted(false);
        panelTablero.add(villanos6_6);

        villanos6_7.setText("jButton3");
        villanos6_7.setBorderPainted(false);
        villanos6_7.setContentAreaFilled(false);
        villanos6_7.setFocusPainted(false);
        panelTablero.add(villanos6_7);

        villanos6_8.setText("jButton3");
        villanos6_8.setBorderPainted(false);
        villanos6_8.setContentAreaFilled(false);
        villanos6_8.setFocusPainted(false);
        panelTablero.add(villanos6_8);

        villanos6_9.setText("jButton3");
        villanos6_9.setBorderPainted(false);
        villanos6_9.setContentAreaFilled(false);
        villanos6_9.setFocusPainted(false);
        panelTablero.add(villanos6_9);

        casilla5_0.setText("jButton3");
        casilla5_0.setBorderPainted(false);
        casilla5_0.setContentAreaFilled(false);
        casilla5_0.setFocusPainted(false);
        panelTablero.add(casilla5_0);

        casilla5_1.setText("jButton3");
        casilla5_1.setBorderPainted(false);
        casilla5_1.setContentAreaFilled(false);
        casilla5_1.setFocusPainted(false);
        panelTablero.add(casilla5_1);

        casilla5_2.setText("jButton3");
        casilla5_2.setBorderPainted(false);
        casilla5_2.setContentAreaFilled(false);
        casilla5_2.setFocusPainted(false);
        panelTablero.add(casilla5_2);

        casilla5_3.setText("jButton3");
        casilla5_3.setBorderPainted(false);
        casilla5_3.setContentAreaFilled(false);
        casilla5_3.setFocusPainted(false);
        panelTablero.add(casilla5_3);

        casilla5_4.setText("jButton3");
        casilla5_4.setBorderPainted(false);
        casilla5_4.setContentAreaFilled(false);
        casilla5_4.setFocusPainted(false);
        panelTablero.add(casilla5_4);

        casilla5_5.setText("jButton3");
        casilla5_5.setBorderPainted(false);
        casilla5_5.setContentAreaFilled(false);
        casilla5_5.setFocusPainted(false);
        panelTablero.add(casilla5_5);

        casilla5_6.setText("jButton3");
        casilla5_6.setBorderPainted(false);
        casilla5_6.setContentAreaFilled(false);
        casilla5_6.setFocusPainted(false);
        panelTablero.add(casilla5_6);

        casilla5_7.setText("jButton3");
        casilla5_7.setBorderPainted(false);
        casilla5_7.setContentAreaFilled(false);
        casilla5_7.setFocusPainted(false);
        panelTablero.add(casilla5_7);

        casilla5_8.setText("jButton3");
        casilla5_8.setBorderPainted(false);
        casilla5_8.setContentAreaFilled(false);
        casilla5_8.setFocusPainted(false);
        panelTablero.add(casilla5_8);

        casilla5_9.setText("jButton3");
        casilla5_9.setBorderPainted(false);
        casilla5_9.setContentAreaFilled(false);
        casilla5_9.setFocusPainted(false);
        panelTablero.add(casilla5_9);

        casilla4_0.setText("jButton3");
        casilla4_0.setBorderPainted(false);
        casilla4_0.setContentAreaFilled(false);
        casilla4_0.setFocusPainted(false);
        panelTablero.add(casilla4_0);

        casilla4_1.setText("jButton3");
        casilla4_1.setBorderPainted(false);
        casilla4_1.setContentAreaFilled(false);
        casilla4_1.setFocusPainted(false);
        panelTablero.add(casilla4_1);

        casilla4_2.setText("jButton3");
        casilla4_2.setBorderPainted(false);
        casilla4_2.setContentAreaFilled(false);
        casilla4_2.setFocusPainted(false);
        panelTablero.add(casilla4_2);

        casilla4_3.setText("jButton3");
        casilla4_3.setBorderPainted(false);
        casilla4_3.setContentAreaFilled(false);
        casilla4_3.setFocusPainted(false);
        panelTablero.add(casilla4_3);

        casilla4_4.setText("jButton3");
        casilla4_4.setBorderPainted(false);
        casilla4_4.setContentAreaFilled(false);
        casilla4_4.setFocusPainted(false);
        panelTablero.add(casilla4_4);

        casilla4_5.setText("jButton3");
        casilla4_5.setBorderPainted(false);
        casilla4_5.setContentAreaFilled(false);
        casilla4_5.setFocusPainted(false);
        panelTablero.add(casilla4_5);

        casilla4_6.setText("jButton3");
        casilla4_6.setBorderPainted(false);
        casilla4_6.setContentAreaFilled(false);
        casilla4_6.setFocusPainted(false);
        panelTablero.add(casilla4_6);

        casilla4_7.setText("jButton3");
        casilla4_7.setBorderPainted(false);
        casilla4_7.setContentAreaFilled(false);
        casilla4_7.setFocusPainted(false);
        panelTablero.add(casilla4_7);

        casilla4_8.setText("jButton3");
        casilla4_8.setBorderPainted(false);
        casilla4_8.setContentAreaFilled(false);
        casilla4_8.setFocusPainted(false);
        panelTablero.add(casilla4_8);

        casilla4_9.setText("jButton3");
        casilla4_9.setBorderPainted(false);
        casilla4_9.setContentAreaFilled(false);
        casilla4_9.setFocusPainted(false);
        panelTablero.add(casilla4_9);

        heroes3_0.setText("jButton3");
        heroes3_0.setBorderPainted(false);
        heroes3_0.setContentAreaFilled(false);
        heroes3_0.setFocusPainted(false);
        panelTablero.add(heroes3_0);

        heroes3_1.setText("jButton3");
        heroes3_1.setBorderPainted(false);
        heroes3_1.setContentAreaFilled(false);
        heroes3_1.setFocusPainted(false);
        panelTablero.add(heroes3_1);

        heroes3_2.setText("jButton3");
        heroes3_2.setBorderPainted(false);
        heroes3_2.setContentAreaFilled(false);
        heroes3_2.setFocusPainted(false);
        panelTablero.add(heroes3_2);

        heroes3_3.setText("jButton3");
        heroes3_3.setBorderPainted(false);
        heroes3_3.setContentAreaFilled(false);
        heroes3_3.setFocusPainted(false);
        panelTablero.add(heroes3_3);

        heroes3_4.setText("jButton3");
        heroes3_4.setBorderPainted(false);
        heroes3_4.setContentAreaFilled(false);
        heroes3_4.setFocusPainted(false);
        panelTablero.add(heroes3_4);

        heroes3_5.setText("jButton3");
        heroes3_5.setBorderPainted(false);
        heroes3_5.setContentAreaFilled(false);
        heroes3_5.setFocusPainted(false);
        panelTablero.add(heroes3_5);

        heroes3_6.setText("jButton3");
        heroes3_6.setBorderPainted(false);
        heroes3_6.setContentAreaFilled(false);
        heroes3_6.setFocusPainted(false);
        panelTablero.add(heroes3_6);

        heroes3_7.setText("jButton3");
        heroes3_7.setBorderPainted(false);
        heroes3_7.setContentAreaFilled(false);
        heroes3_7.setFocusPainted(false);
        panelTablero.add(heroes3_7);

        heroes3_8.setText("jButton3");
        heroes3_8.setBorderPainted(false);
        heroes3_8.setContentAreaFilled(false);
        heroes3_8.setFocusPainted(false);
        panelTablero.add(heroes3_8);

        heroes3_9.setText("jButton3");
        heroes3_9.setBorderPainted(false);
        heroes3_9.setContentAreaFilled(false);
        heroes3_9.setFocusPainted(false);
        panelTablero.add(heroes3_9);

        heroes2_0.setText("jButton3");
        heroes2_0.setBorderPainted(false);
        heroes2_0.setContentAreaFilled(false);
        heroes2_0.setFocusPainted(false);
        panelTablero.add(heroes2_0);

        heroes2_1.setText("jButton3");
        heroes2_1.setBorderPainted(false);
        heroes2_1.setContentAreaFilled(false);
        heroes2_1.setFocusPainted(false);
        panelTablero.add(heroes2_1);

        heroes2_2.setText("jButton3");
        heroes2_2.setBorderPainted(false);
        heroes2_2.setContentAreaFilled(false);
        heroes2_2.setFocusPainted(false);
        panelTablero.add(heroes2_2);

        heroes2_3.setText("jButton3");
        heroes2_3.setBorderPainted(false);
        heroes2_3.setContentAreaFilled(false);
        heroes2_3.setFocusPainted(false);
        panelTablero.add(heroes2_3);

        heroes2_4.setText("jButton3");
        heroes2_4.setBorderPainted(false);
        heroes2_4.setContentAreaFilled(false);
        heroes2_4.setFocusPainted(false);
        heroes2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heroes2_4ActionPerformed(evt);
            }
        });
        panelTablero.add(heroes2_4);

        heroes2_5.setText("jButton3");
        heroes2_5.setBorderPainted(false);
        heroes2_5.setContentAreaFilled(false);
        heroes2_5.setFocusPainted(false);
        panelTablero.add(heroes2_5);

        heroes2_6.setText("jButton3");
        heroes2_6.setBorderPainted(false);
        heroes2_6.setContentAreaFilled(false);
        heroes2_6.setFocusPainted(false);
        panelTablero.add(heroes2_6);

        heroes2_7.setText("jButton3");
        heroes2_7.setBorderPainted(false);
        heroes2_7.setContentAreaFilled(false);
        heroes2_7.setFocusPainted(false);
        panelTablero.add(heroes2_7);

        heroes2_8.setText("jButton3");
        heroes2_8.setBorderPainted(false);
        heroes2_8.setContentAreaFilled(false);
        heroes2_8.setFocusPainted(false);
        heroes2_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heroes2_8ActionPerformed(evt);
            }
        });
        panelTablero.add(heroes2_8);

        heroes2_9.setText("jButton3");
        heroes2_9.setBorderPainted(false);
        heroes2_9.setContentAreaFilled(false);
        heroes2_9.setFocusPainted(false);
        panelTablero.add(heroes2_9);

        heroes1_0.setText("jButton3");
        heroes1_0.setBorderPainted(false);
        heroes1_0.setContentAreaFilled(false);
        heroes1_0.setFocusPainted(false);
        panelTablero.add(heroes1_0);

        heroes1_1.setText("jButton3");
        heroes1_1.setBorderPainted(false);
        heroes1_1.setContentAreaFilled(false);
        heroes1_1.setFocusPainted(false);
        panelTablero.add(heroes1_1);

        heroes1_2.setText("jButton3");
        heroes1_2.setBorderPainted(false);
        heroes1_2.setContentAreaFilled(false);
        heroes1_2.setFocusPainted(false);
        panelTablero.add(heroes1_2);

        heroes1_3.setText("jButton3");
        heroes1_3.setBorderPainted(false);
        heroes1_3.setContentAreaFilled(false);
        heroes1_3.setFocusPainted(false);
        panelTablero.add(heroes1_3);

        heroes1_4.setText("jButton3");
        heroes1_4.setBorderPainted(false);
        heroes1_4.setContentAreaFilled(false);
        heroes1_4.setFocusPainted(false);
        panelTablero.add(heroes1_4);

        heroes1_5.setText("jButton3");
        heroes1_5.setBorderPainted(false);
        heroes1_5.setContentAreaFilled(false);
        heroes1_5.setFocusPainted(false);
        panelTablero.add(heroes1_5);

        heroes1_6.setText("jButton3");
        heroes1_6.setBorderPainted(false);
        heroes1_6.setContentAreaFilled(false);
        heroes1_6.setFocusPainted(false);
        panelTablero.add(heroes1_6);

        heroes1_7.setText("jButton3");
        heroes1_7.setBorderPainted(false);
        heroes1_7.setContentAreaFilled(false);
        heroes1_7.setFocusPainted(false);
        panelTablero.add(heroes1_7);

        heroes1_8.setText("jButton3");
        heroes1_8.setBorderPainted(false);
        heroes1_8.setContentAreaFilled(false);
        heroes1_8.setFocusPainted(false);
        panelTablero.add(heroes1_8);

        heroes1_9.setText("jButton3");
        heroes1_9.setBorderPainted(false);
        heroes1_9.setContentAreaFilled(false);
        heroes1_9.setFocusPainted(false);
        panelTablero.add(heroes1_9);

        heroes0_0.setText("heroes1");
        heroes0_0.setBorderPainted(false);
        heroes0_0.setContentAreaFilled(false);
        heroes0_0.setFocusPainted(false);
        panelTablero.add(heroes0_0);

        heroes0_1.setText("jButton3");
        heroes0_1.setBorderPainted(false);
        heroes0_1.setContentAreaFilled(false);
        heroes0_1.setFocusPainted(false);
        panelTablero.add(heroes0_1);

        heroes0_2.setText("jButton3");
        heroes0_2.setBorderPainted(false);
        heroes0_2.setContentAreaFilled(false);
        heroes0_2.setFocusPainted(false);
        panelTablero.add(heroes0_2);

        heroes0_3.setText("jButton3");
        heroes0_3.setBorderPainted(false);
        heroes0_3.setContentAreaFilled(false);
        heroes0_3.setFocusPainted(false);
        panelTablero.add(heroes0_3);

        heroes0_4.setBorderPainted(false);
        heroes0_4.setContentAreaFilled(false);
        heroes0_4.setFocusPainted(false);
        heroes0_4.setLabel("heroes0_4");
        panelTablero.add(heroes0_4);

        heroes0_5.setText("jButton3");
        heroes0_5.setBorderPainted(false);
        heroes0_5.setContentAreaFilled(false);
        heroes0_5.setFocusPainted(false);
        panelTablero.add(heroes0_5);

        heroes0_6.setText("jButton3");
        heroes0_6.setBorderPainted(false);
        heroes0_6.setContentAreaFilled(false);
        heroes0_6.setFocusPainted(false);
        panelTablero.add(heroes0_6);

        heroes0_7.setText("jButton3");
        heroes0_7.setBorderPainted(false);
        heroes0_7.setContentAreaFilled(false);
        heroes0_7.setFocusPainted(false);
        panelTablero.add(heroes0_7);

        heroes0_8.setText("jButton3");
        heroes0_8.setBorderPainted(false);
        heroes0_8.setContentAreaFilled(false);
        heroes0_8.setFocusPainted(false);
        panelTablero.add(heroes0_8);

        heroes0_9.setText("jButton3");
        heroes0_9.setBorderPainted(false);
        heroes0_9.setContentAreaFilled(false);
        heroes0_9.setFocusPainted(false);
        panelTablero.add(heroes0_9);

        getContentPane().add(panelTablero, java.awt.BorderLayout.CENTER);

        panelVillanos.setBackground(new java.awt.Color(255, 0, 0));
        panelVillanos.setMaximumSize(new java.awt.Dimension(1000, 60));
        panelVillanos.setMinimumSize(new java.awt.Dimension(1000, 60));
        panelVillanos.setPreferredSize(new java.awt.Dimension(1000, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerVillanos.png"))); // NOI18N

        javax.swing.GroupLayout panelVillanosLayout = new javax.swing.GroupLayout(panelVillanos);
        panelVillanos.setLayout(panelVillanosLayout);
        panelVillanosLayout.setHorizontalGroup(
            panelVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelVillanosLayout.setVerticalGroup(
            panelVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVillanosLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelVillanos, java.awt.BorderLayout.PAGE_START);

        panelHeroes.setBackground(new java.awt.Color(51, 0, 255));
        panelHeroes.setMaximumSize(new java.awt.Dimension(1000, 60));
        panelHeroes.setMinimumSize(new java.awt.Dimension(1000, 60));
        panelHeroes.setPreferredSize(new java.awt.Dimension(1000, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerHeroes.png"))); // NOI18N

        javax.swing.GroupLayout panelHeroesLayout = new javax.swing.GroupLayout(panelHeroes);
        panelHeroes.setLayout(panelHeroesLayout);
        panelHeroesLayout.setHorizontalGroup(
            panelHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeroesLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelHeroesLayout.setVerticalGroup(
            panelHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeroesLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelHeroes, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void heroes2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heroes2_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heroes2_4ActionPerformed

    private void heroes2_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heroes2_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heroes2_8ActionPerformed

    private void villanos8_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_villanos8_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_villanos8_5ActionPerformed

    private void villanos7_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_villanos7_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_villanos7_0ActionPerformed

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
            java.util.logging.Logger.getLogger(TableroPantallla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroPantallla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroPantallla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroPantallla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroPantallla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEliminados;
    private javax.swing.JButton casilla4_0;
    private javax.swing.JButton casilla4_1;
    private javax.swing.JButton casilla4_2;
    private javax.swing.JButton casilla4_3;
    private javax.swing.JButton casilla4_4;
    private javax.swing.JButton casilla4_5;
    private javax.swing.JButton casilla4_6;
    private javax.swing.JButton casilla4_7;
    private javax.swing.JButton casilla4_8;
    private javax.swing.JButton casilla4_9;
    private javax.swing.JButton casilla5_0;
    private javax.swing.JButton casilla5_1;
    private javax.swing.JButton casilla5_2;
    private javax.swing.JButton casilla5_3;
    private javax.swing.JButton casilla5_4;
    private javax.swing.JButton casilla5_5;
    private javax.swing.JButton casilla5_6;
    private javax.swing.JButton casilla5_7;
    private javax.swing.JButton casilla5_8;
    private javax.swing.JButton casilla5_9;
    private javax.swing.JButton heroes0_0;
    private javax.swing.JButton heroes0_1;
    private javax.swing.JButton heroes0_2;
    private javax.swing.JButton heroes0_3;
    private javax.swing.JButton heroes0_4;
    private javax.swing.JButton heroes0_5;
    private javax.swing.JButton heroes0_6;
    private javax.swing.JButton heroes0_7;
    private javax.swing.JButton heroes0_8;
    private javax.swing.JButton heroes0_9;
    private javax.swing.JButton heroes1_0;
    private javax.swing.JButton heroes1_1;
    private javax.swing.JButton heroes1_2;
    private javax.swing.JButton heroes1_3;
    private javax.swing.JButton heroes1_4;
    private javax.swing.JButton heroes1_5;
    private javax.swing.JButton heroes1_6;
    private javax.swing.JButton heroes1_7;
    private javax.swing.JButton heroes1_8;
    private javax.swing.JButton heroes1_9;
    private javax.swing.JButton heroes2_0;
    private javax.swing.JButton heroes2_1;
    private javax.swing.JButton heroes2_2;
    private javax.swing.JButton heroes2_3;
    private javax.swing.JButton heroes2_4;
    private javax.swing.JButton heroes2_5;
    private javax.swing.JButton heroes2_6;
    private javax.swing.JButton heroes2_7;
    private javax.swing.JButton heroes2_8;
    private javax.swing.JButton heroes2_9;
    private javax.swing.JButton heroes3_0;
    private javax.swing.JButton heroes3_1;
    private javax.swing.JButton heroes3_2;
    private javax.swing.JButton heroes3_3;
    private javax.swing.JButton heroes3_4;
    private javax.swing.JButton heroes3_5;
    private javax.swing.JButton heroes3_6;
    private javax.swing.JButton heroes3_7;
    private javax.swing.JButton heroes3_8;
    private javax.swing.JButton heroes3_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEliminaciones;
    private javax.swing.JPanel panelHeroes;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JPanel panelVillanos;
    private javax.swing.JButton villanos6_0;
    private javax.swing.JButton villanos6_1;
    private javax.swing.JButton villanos6_2;
    private javax.swing.JButton villanos6_3;
    private javax.swing.JButton villanos6_4;
    private javax.swing.JButton villanos6_5;
    private javax.swing.JButton villanos6_6;
    private javax.swing.JButton villanos6_7;
    private javax.swing.JButton villanos6_8;
    private javax.swing.JButton villanos6_9;
    private javax.swing.JButton villanos7_0;
    private javax.swing.JButton villanos7_1;
    private javax.swing.JButton villanos7_2;
    private javax.swing.JButton villanos7_3;
    private javax.swing.JButton villanos7_4;
    private javax.swing.JButton villanos7_5;
    private javax.swing.JButton villanos7_6;
    private javax.swing.JButton villanos7_7;
    private javax.swing.JButton villanos7_8;
    private javax.swing.JButton villanos7_9;
    private javax.swing.JButton villanos8_0;
    private javax.swing.JButton villanos8_1;
    private javax.swing.JButton villanos8_2;
    private javax.swing.JButton villanos8_3;
    private javax.swing.JButton villanos8_4;
    private javax.swing.JButton villanos8_5;
    private javax.swing.JButton villanos8_6;
    private javax.swing.JButton villanos8_7;
    private javax.swing.JButton villanos8_8;
    private javax.swing.JButton villanos8_9;
    private javax.swing.JButton villanos9_0;
    private javax.swing.JButton villanos9_1;
    private javax.swing.JButton villanos9_2;
    private javax.swing.JButton villanos9_3;
    private javax.swing.JButton villanos9_4;
    private javax.swing.JButton villanos9_5;
    private javax.swing.JButton villanos9_6;
    private javax.swing.JButton villanos9_7;
    private javax.swing.JButton villanos9_8;
    private javax.swing.JButton villanos9_9;
    // End of variables declaration//GEN-END:variables
}
