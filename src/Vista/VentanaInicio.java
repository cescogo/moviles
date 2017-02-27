/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ccg
 */
public class VentanaInicio extends JFrame{

    public VentanaInicio() {
            super("Login");
        ajustarComponentes(getContentPane());   
        setMinimumSize(new Dimension(400,250));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void ajustarComponentes(Container c)
    {
        c.setLayout(new BorderLayout());
         principal = new JPanel();
        principal.setLayout(new BorderLayout());
        principal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
         formulario =new JPanel(new GridBagLayout());
        gc=new GridBagConstraints();
        
        gc.insets=new Insets(4,4,4,4);
        gc.gridx=0;
        gc.gridy=0;
        
        formulario.add(new JLabel("Usuario:"),gc);
        gc.gridx=1;
        gc.gridy=0;
        formulario.add(t_usuario=new JTextField(10),gc);
        gc.gridx=0;
        gc.gridy=1;
        formulario.add(new JLabel("Clave:"),gc);
        gc.gridx=1;
        gc.gridy=1;
        formulario.add(t_clave=new JTextField(10),gc);
        gc.gridx=1;
        gc.gridy=2;
        formulario.add(new JButton("Aceptar"),gc);
        
        cancelar =new JPanel(new BorderLayout());       
        cancelar.add(new JButton("cancelar"),BorderLayout.EAST);
        
       principal.add(formulario,BorderLayout.CENTER);
       principal.add(cancelar,BorderLayout.SOUTH);
       c.add(principal,BorderLayout.CENTER);
        
    }
    
    public void init() {
        setVisible(true);
    }
    // atributos
    private JPanel principal;
    private JPanel formulario;
    private JPanel cancelar;
    private GridBagConstraints gc;
    private JLabel usuario;
    private JLabel clave;
    private JTextField t_usuario;
    private JTextField t_clave;
}
