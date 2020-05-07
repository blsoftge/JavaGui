/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video9.jPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author BLSoft
 */
public class JanelaComPainel extends JFrame{
    private JPanel jpnCliente;
    private JLabel jlbNomeCliente;
    private JTextField jtfNomeCliente;
    private JPanel jpnInfo;
    private JLabel jlbInfo;
    
    public JanelaComPainel() {
        super();
        this.configurarFrame();
        this.configurarPainelCliente();
        this.add(this.jpnCliente);
        this.configurarPainelInfo();
        this.add(this.jpnInfo);
    }
    
    private void configurarPainelInfo(){
        this.jpnInfo = new JPanel(new FlowLayout());
        this.jpnInfo.setPreferredSize(new Dimension(450, 50));
        this.jpnInfo.setBackground(Color.BLUE);
        this.jlbInfo = new JLabel("www.blsoft.com.br");
        this.jpnInfo.add(this.jlbInfo);
        
    }
    
    private void configurarPainelCliente(){
        this.jpnCliente = new JPanel(new FlowLayout());
        this.jpnCliente.setPreferredSize(new Dimension(450, 100));
        this.jpnCliente.setBackground(Color.yellow);
        this.configurarDadosCliente();
        this.jpnCliente.add(this.jlbNomeCliente);
        this.jpnCliente.add(this.jtfNomeCliente);
    }
    
    private void configurarDadosCliente(){
        this.jlbNomeCliente = new JLabel("Nome cliente");
        this.jtfNomeCliente = new JTextField();
        this.jtfNomeCliente.setPreferredSize(new Dimension(300,25));
    }
    
    private void configurarFrame(){
        this.setTitle("JAnela com paineis");
        this.setSize(new Dimension(500,250));
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
