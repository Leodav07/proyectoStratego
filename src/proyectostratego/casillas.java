/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *
 * @author hnleo
 */
public class casillas{
    
    private int row;
    private int column;
    private int id;

    private boolean casillaSeleccionada = false;
    
    public casillas(int id){
       this.id = id;
      
        //Detectar si hizo click
       /*addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            seleccion();
        }
    });
*/
    }
    
    
    //Funcion para verificar si hizo click
    public void seleccion(){
        if(!casillaSeleccionada){
         // setBackground(Color.RED)
            casillaSeleccionada = true;
        }else{
           // setOpaque(false);
          //  setBackground(new Color(0, 0, 0, 0));
            casillaSeleccionada = false;

        }
       // repaint();
    }
    
    public int getColumn(){
        return column;
    }
    public int getRow(){
        return row;
    }
    public int getId(){
        return id;
    }
    
}
