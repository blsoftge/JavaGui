/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video11.JFileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author BLSoft
 */
public class Main {
    public static void main(String[] args){
        JFileChooser jFileChooser = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas .sql e .png", "sql", "png");
        jFileChooser.setAcceptAllFileFilterUsed(false);
        jFileChooser.addChoosableFileFilter(filtro);

        int respostDoFileChooser = jFileChooser.showOpenDialog(null);

        if(respostDoFileChooser == JFileChooser.APPROVE_OPTION){
            File arquivoSelecionado = jFileChooser.getSelectedFile();
            System.out.println("CAMINHO DO ARQUIVO ABERTO = " + arquivoSelecionado.getAbsolutePath());
        }else{
            System.out.println("Nenhum arquivo Selecionado");
        }

    }
}
