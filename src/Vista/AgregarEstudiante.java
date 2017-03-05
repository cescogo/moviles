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
import java.awt.event.ActionEvent;
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
public class AgregarEstudiante extends JFrame {
    
    public AgregarEstudiante() {
            super("agregar Estudiante");
        ajustarComponentes(getContentPane());   
        setMinimumSize(new Dimension(500,350));
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
        nombre= new JLabel("Nombre:");
        formulario.add(nombre,gc);
        
        gc.gridx=0;
        gc.gridy=1;
        formulario.add(cedula =new JLabel("Cedula:"),gc);
        
      
        gc.gridx=0;
        gc.gridy=2;
        formulario.add(clave =new JLabel("Clave:"),gc);
        
         gc.gridx=0;
        gc.gridy=3;
        formulario.add( telefono=new JLabel("Telefono:"),gc);
        
        gc.gridx=0;
        gc.gridy=4;
        formulario.add(email =new JLabel("Email:"),gc);
        
        gc.gridx=0;
        gc.gridy=5;
        formulario.add(fe_nac =new JLabel("fecha de nacimiento:"),gc);
        
        gc.gridx=1;
        gc.gridy=0;
        formulario.add(t_nombre=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=1;
        formulario.add(t_cedula=new JTextField(20),gc);
       
        gc.gridx=1;
        gc.gridy=2;
        formulario.add(t_clave=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=3;
        formulario.add(t_telefono=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=4;
        formulario.add(t_email=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=5;
        formulario.add(t_Fe_nac =new JTextField(20),gc);
        
        gc.gridx=0;
        gc.gridy=8;
        formulario.add(aceptar=new JButton("Aceptar"),gc);
        
        gc.gridx=1;
        gc.gridy=8;
               
                cancel=new JButton("cancelar");
                cancel.addActionListener((ActionEvent e)->{salir();});
        formulario.add(cancel,gc);
        
       principal.add(formulario,BorderLayout.CENTER);
       
       c.add(principal,BorderLayout.CENTER);
        
    }
     private void salir()
    {
        VenOpcEstudiante vi = new VenOpcEstudiante();
        vi.init();
        this.dispose();
    }
    public void init() {
        setVisible(true);
    }
      private JPanel principal;
    private JPanel formulario;
    private GridBagConstraints gc;
    private JLabel nombre;
    private JLabel telefono;
    private JLabel clave;
    private JLabel email;
    private JLabel cedula;
    private JLabel fe_nac;
    private JTextField t_nombre;
    private JTextField t_clave;
    private JTextField t_email;
    private JTextField t_telefono;
    private JTextField t_cedula;
    private JTextField t_Fe_nac;
    private JButton aceptar;
    private JButton cancel;
    
    
}
