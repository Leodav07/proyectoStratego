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
public class casillas extends JLabel {
    
    private int row;
    private int column;
    
    
    public casillas(int row, int column){
        this.row = row;
        this.column = column;

        setOpaque(false);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
    }
    
    public int getColumn(){
        return column;
    }
    public int getRow(){
        return row;
    }
    
}
