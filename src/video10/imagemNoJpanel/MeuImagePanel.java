/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video10.imagemNoJpanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author BLSoft
 */
public class MeuImagePanel extends JPanel{
    
    @Override
    protected void paintComponent(Graphics graficoGenerico){
        try{
            Graphics2D grafico2d = (Graphics2D) graficoGenerico;
            InputStream imageInputStream = getClass().getResourceAsStream("java_advance.png");
            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            Image imagemRedimensionada = bufferedImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
            grafico2d.drawImage(imagemRedimensionada, 0, 0, this);
        }catch(Exception e){
            System.err.println("Imagem não encontrada!");
        }
    }
    
}
