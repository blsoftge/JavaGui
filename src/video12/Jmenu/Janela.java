package video12.Jmenu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Janela extends JFrame{

	public Janela() {
		this.setSize(new Dimension(500, 450));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar barraMenu = new JMenuBar();
		this.setJMenuBar(barraMenu);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		barraMenu.add(menuArquivo);
		
		
		JMenuItem itemNovo = new JMenuItem("Novo");
		itemNovo.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Janela().setVisible(true);
			}
			
		});
		menuArquivo.add(itemNovo);
		
		JMenuItem itemSair = new JMenuItem("Sair");
		itemSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
		menuArquivo.add(itemSair);
		
		JMenu menuEditar = new JMenu("Editar");
		barraMenu.add(menuEditar);
		
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		itemCopiar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				JOptionPane.showMessageDialog(null, "Copiado para a área de transferência");
			}
		});
		menuEditar.add(itemCopiar);
		
		
	}
	
}
