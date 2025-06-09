/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author hnleo
 */
public class Tablero extends JPanel {

    Random random = new Random();
    int numRandom = 0;
    private Image imagen;
    casillas casilla[][];
    JButton botones[][];
    private int fila;
    private int columna;
    public boolean esperarCasilla = false;
    private String imagenesHeroes[];
    public boolean casillasProhibidasHeroes[][];
    public boolean casillasProhibidasVillanos[][];

    public Tablero(int fila, int columna, String ruta, JButton botones[][]) {
        this.imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        this.fila = fila;
        this.botones = botones;
        this.columna = columna;
        casillasProhibidasHeroes = new boolean[10][10];
        casillasVaciasHeroes();

        imagenesHeroes();
    }

    public void seleccionCasilla(int fila, int columna, JButton boton) {
        System.out.println("Casilla Seleccionada: [" + fila + "][" + columna + "]");

    }

    public void colocarImagenesHeroes() {
        int imagenColocada = 0;
        while (imagenColocada < imagenesHeroes.length) {
            int row = random.nextInt(10);
            int col = random.nextInt(10);

            if (casillasProhibidasHeroes[row][col] == false && botones[row][col].getIcon() == null) {
                ImageIcon images = new ImageIcon(getClass().getResource(imagenesHeroes[imagenColocada]));
                reescalarImagen(images, row, col);
                imagenColocada++;
            }
        }

    }

    private void reescalarImagen(ImageIcon images, int row, int col) {
        Image imagenOriginal = images.getImage();
        Image imagenAjustada = imagenOriginal.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon iconoAjustado = new ImageIcon(imagenAjustada);
        botones[row][col].setIcon(iconoAjustado);
    }

    private void imagenesHeroes() {
        imagenesHeroes = new String[40];
        imagenesHeroes[0] = "/images/Beast.png";
        imagenesHeroes[1] = "/images/BlackWidow.png";
        imagenesHeroes[2] = "/images/Blade.png";
        imagenesHeroes[3] = "/images/CaptainAmerica.png";
        imagenesHeroes[4] = "/images/Colossus.png";
        imagenesHeroes[5] = "/images/Cyclops.png";
        imagenesHeroes[6] = "/images/Daredevil.png";
        imagenesHeroes[7] = "/images/Dr.Strange.png";
        imagenesHeroes[8] = "/images/Elektra.png";
        imagenesHeroes[9] = "/images/EmmaFrost.png";
        imagenesHeroes[10] = "/images/Gambit.png";
        imagenesHeroes[11] = "/images/GhostRider.png";
        imagenesHeroes[12] = "/images/GiantMan.png";
        imagenesHeroes[13] = "/images/Hulk.png";
        imagenesHeroes[14] = "/images/HumanTorch.png";
        imagenesHeroes[15] = "/images/IceMan.png";
        imagenesHeroes[16] = "/images/InvisibleWoman.png";
        imagenesHeroes[17] = "/images/IronMan.png";
        imagenesHeroes[18] = "/images/Mr.Fantastic.png";
        imagenesHeroes[19] = "/images/Namor.png";
        imagenesHeroes[20] = "/images/NickFury.png";
        imagenesHeroes[21] = "/images/Nightcrawler.png";
        imagenesHeroes[22] = "/images/NovaBlast.png";
        imagenesHeroes[23] = "/images/NovaBlast.png";
        imagenesHeroes[24] = "/images/NovaBlast.png";
        imagenesHeroes[25] = "/images/NovaBlast.png";
        imagenesHeroes[26] = "/images/NovaBlast.png";
        imagenesHeroes[27] = "/images/NovaBlast.png";
        imagenesHeroes[28] = "/images/Phoenix.png";
        imagenesHeroes[29] = "/images/Planet-Earth.png";
        imagenesHeroes[30] = "/images/ProfessorX.png";
        imagenesHeroes[31] = "/images/Punisher.png";
        imagenesHeroes[32] = "/images/She-Hulk.png";
        imagenesHeroes[33] = "/images/SilverSurfer.png";
        imagenesHeroes[34] = "/images/Spider-Girl.png";
        imagenesHeroes[35] = "/images/Spider-Man.png";
        imagenesHeroes[36] = "/images/Storm.png";
        imagenesHeroes[37] = "/images/Thing.png";
        imagenesHeroes[38] = "/images/Thor.png";
        imagenesHeroes[39] = "/images/Wolverine.png";

    }

    private void casillasVaciasHeroes() {
        casillasProhibidasHeroes[4][0] = true;
        casillasProhibidasHeroes[4][1] = true;
        casillasProhibidasHeroes[4][2] = true;
        casillasProhibidasHeroes[4][3] = true;
        casillasProhibidasHeroes[4][4] = true;
        casillasProhibidasHeroes[4][5] = true;
        casillasProhibidasHeroes[4][6] = true;
        casillasProhibidasHeroes[4][7] = true;
        casillasProhibidasHeroes[4][8] = true;
        casillasProhibidasHeroes[4][9] = true;
        casillasProhibidasHeroes[5][0] = true;
        casillasProhibidasHeroes[5][1] = true;
        casillasProhibidasHeroes[5][2] = true;
        casillasProhibidasHeroes[5][3] = true;
        casillasProhibidasHeroes[5][4] = true;
        casillasProhibidasHeroes[5][5] = true;
        casillasProhibidasHeroes[5][6] = true;
        casillasProhibidasHeroes[5][7] = true;
        casillasProhibidasHeroes[5][8] = true;
        casillasProhibidasHeroes[5][9] = true;
        casillasProhibidasHeroes[6][0] = true;
        casillasProhibidasHeroes[6][1] = true;
        casillasProhibidasHeroes[6][2] = true;
        casillasProhibidasHeroes[6][3] = true;
        casillasProhibidasHeroes[6][4] = true;
        casillasProhibidasHeroes[6][5] = true;
        casillasProhibidasHeroes[6][6] = true;
        casillasProhibidasHeroes[6][7] = true;
        casillasProhibidasHeroes[6][8] = true;
        casillasProhibidasHeroes[6][9] = true;
        casillasProhibidasHeroes[7][0] = true;
        casillasProhibidasHeroes[7][1] = true;
        casillasProhibidasHeroes[7][2] = true;
        casillasProhibidasHeroes[7][3] = true;
        casillasProhibidasHeroes[7][4] = true;
        casillasProhibidasHeroes[7][5] = true;
        casillasProhibidasHeroes[7][6] = true;
        casillasProhibidasHeroes[7][7] = true;
        casillasProhibidasHeroes[7][8] = true;
        casillasProhibidasHeroes[7][9] = true;
        casillasProhibidasHeroes[8][0] = true;
        casillasProhibidasHeroes[8][1] = true;
        casillasProhibidasHeroes[8][2] = true;
        casillasProhibidasHeroes[8][3] = true;
        casillasProhibidasHeroes[8][4] = true;
        casillasProhibidasHeroes[8][5] = true;
        casillasProhibidasHeroes[8][6] = true;
        casillasProhibidasHeroes[8][7] = true;
        casillasProhibidasHeroes[8][8] = true;
        casillasProhibidasHeroes[8][9] = true;
        casillasProhibidasHeroes[9][0] = true;
        casillasProhibidasHeroes[9][1] = true;
        casillasProhibidasHeroes[9][2] = true;
        casillasProhibidasHeroes[9][3] = true;
        casillasProhibidasHeroes[9][4] = true;
        casillasProhibidasHeroes[9][5] = true;
        casillasProhibidasHeroes[9][6] = true;
        casillasProhibidasHeroes[9][7] = true;
        casillasProhibidasHeroes[9][8] = true;
        casillasProhibidasHeroes[9][9] = true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }

    }

}
