/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author hnleo
 */
public class Tablero extends JPanel{
     private Image imagen;
     casillas casilla[][];
     private int fila;
     private int columna;
     
    public Tablero(int fila, int columna, String ruta){
        this.imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        this.fila = fila;
        this.columna = columna;
        
    }
    
    public void seleccionCasilla(int fila, int columna, JButton boton){
        System.out.println("Casilla Seleccionada: ["+fila+"]["+columna+"]");
        
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen != null){
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
        
    }
    
    
}
