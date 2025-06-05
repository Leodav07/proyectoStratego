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
    
    public Tablero(String ruta){
        this.imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        setLayout(new GridLayout(10, 10));
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                casillas casilla = new casillas(row, column);
                add(casilla);
            }
        }
        
        
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen != null){
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
        
    }
    
    
}
