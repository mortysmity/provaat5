/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico8;

import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class Basico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double raio,p,a,d;
       
       raio=Integer.parseInt(JOptionPane.showInputDialog("Informe o raio:"));
       p=(2*3.14)*raio;
       a = 3.14*(raio*raio);
       d=2*raio;
       JOptionPane.showMessageDialog(null,"perímetro:"+p);
       JOptionPane.showMessageDialog(null,"Área:"+a);
       JOptionPane.showMessageDialog(null,"Diâmetro:"+d);
    }
    
}
