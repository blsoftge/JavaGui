/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video8.jCheckBox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author blsoft
 */
public class Principal extends JFrame {

    private final JLabel lableNomeCliente;
    private final JLabel lableIdadeCliente;
    private final JLabel lablePesoCliente;
    
    private final JTextField txtNomeCliente;
    private final JTextField txtIdadeCliente;
    private final JTextField txtPesoCliente;
    private final JComboBox jcbEscolaridadeCliente;
    
    private final JButton botaoSalvarCliente;

    public Principal() {
        super();

        this.setTitle("Cliente");
        this.setSize(500, 250);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lableNomeCliente = new JLabel("Nome:");
        txtNomeCliente = new JTextField();
        txtNomeCliente.setPreferredSize(new Dimension(500, 25));
        
        String[] escolaridades = {"..Escolaridade..","Graduação", "Ensino médio", "Ensino Fundamental"};
        jcbEscolaridadeCliente = new JComboBox(escolaridades);
         jcbEscolaridadeCliente.setEditable(true);
        
        lableIdadeCliente = new JLabel("Idade:");
        txtIdadeCliente = new JTextField();
        txtIdadeCliente.setPreferredSize(new Dimension(100,25));
        
        lablePesoCliente = new JLabel("Peso:");
        txtPesoCliente = new JTextField();
        txtPesoCliente.setPreferredSize(new Dimension(100,25));
        
        JLabel labelProdutos = new JLabel("Selecione abaixo a categoria de produtos"
                + "que voce tem interesse:");
        
        JCheckBox chkLivros = new JCheckBox("Livros");
        JCheckBox chkCozinha = new JCheckBox("Cozinha");
        JCheckBox chkEletronicos = new JCheckBox("Eletronicos");
        
        botaoSalvarCliente = new JButton("Salvar");

        botaoSalvarCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String nome = txtNomeCliente.getText();
                int idade = Integer.parseInt(txtIdadeCliente.getText());
                float peso = Float.parseFloat(txtPesoCliente.getText());
                String escolaridadeSelecionada = (String) jcbEscolaridadeCliente.getSelectedItem();
                
                JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE "
                        + "\n Nome: " + nome
                        + "\n Idade: " + idade
                        + "\n Peso: " + peso
                        + "\n Escolaridade: " + escolaridadeSelecionada
                        + "\n\n PRODUTOS DE INTERESSE:"
                        + "\nLivros: " + (chkLivros.isSelected() ? "Sim" : "Não")
                        + "\nCozinha: " + (chkCozinha.isSelected() ? "Sim" : "Não")
                        + "\nEletronico: " + (chkEletronicos.isSelected() ? "Sim" : "Não")
                );
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            }

        });

        this.add(lableNomeCliente);
        this.add(txtNomeCliente);
        
        this.add(jcbEscolaridadeCliente);
        
        this.add(lableIdadeCliente);
        this.add(txtIdadeCliente);
        
        this.add(lablePesoCliente);
        this.add(txtPesoCliente);
        
        this.add(labelProdutos);
        
        this.add(chkLivros);
        this.add(chkCozinha);
        this.add(chkEletronicos);
        
        this.add(botaoSalvarCliente);

        this.setVisible(true);

    }

}
