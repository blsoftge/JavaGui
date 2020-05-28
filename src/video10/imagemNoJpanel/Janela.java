/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video10.imagemNoJpanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author BLSoft
 */
public class Janela extends JFrame{
    
    private MeuImagePanel jpnComImagem;
    
    public Janela(){
        super();
        this.configurarFrame();
        this.configurarJpanelComImagem();
        this.add(this.jpnComImagem);
        this.setVisible(true);
    }
    
    private void configurarFrame(){
        this.setTitle("Jpanel Com Imagens");
        this.setSize(new Dimension(500,300));
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void configurarJpanelComImagem(){
        this.jpnComImagem = new MeuImagePanel();
        this.jpnComImagem.setPreferredSize(this.getSize());
    }
    
}
