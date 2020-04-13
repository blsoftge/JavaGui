/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video5.evendoDeClickBotao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author blsoft
 */
public class Principal extends JFrame {

    private final JLabel lableCliente;
    private final JTextField textCliente;
    private final JButton botaoSalvarCliente;

    public Principal() {
        super();

        this.setTitle("Cliente");
        this.setSize(500, 250);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lableCliente = new JLabel("Nome do cliente:");
        textCliente = new JTextField();
        textCliente.setPreferredSize(new Dimension(300, 25));
        botaoSalvarCliente = new JButton("Salvar");

        botaoSalvarCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            }

        });

        this.add(lableCliente);
        this.add(textCliente);
        this.add(botaoSalvarCliente);

        this.setVisible(true);

    }

}
