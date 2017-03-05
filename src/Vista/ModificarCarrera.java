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
public class ModificarCarrera extends JFrame {
    public ModificarCarrera() {
            super("modificar Carrera");
        ajustarComponentes(getContentPane());   
        setMinimumSize(new Dimension(500,250));
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
        formulario.add(nombre =new JLabel("nombre de la carrera:"),gc);
        
      
       
        
        
        gc.gridx=1;
        gc.gridy=0;
        formulario.add(t_nombre=new JTextField(20),gc);
       
        
        
        gc.gridx=0;
        gc.gridy=3;
        formulario.add(aceptar=new JButton("Aceptar"),gc);
        
        gc.gridx=1;
        gc.gridy=3;
               
                cancel=new JButton("cancelar");
                cancel.addActionListener((ActionEvent e)->{salir();});
        formulario.add(cancel,gc);
        
       principal.add(formulario,BorderLayout.CENTER);
       
       c.add(principal,BorderLayout.CENTER);
        
    }
    
     private void salir()
    {
        VenOpcCarrera vi = new VenOpcCarrera();
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
    private JLabel codigo;
    
    private JTextField t_nombre;
    private JTextField t_codigo;
    
    private JButton aceptar;
    private JButton cancel;
}
