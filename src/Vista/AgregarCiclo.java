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
public class AgregarCiclo extends JFrame{
        public AgregarCiclo() {
            super("agregar Ciclo");
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
        gc.gridy=1;
        formulario.add(anno =new JLabel("año del ciclo:"),gc);
        
      
        gc.gridx=0;
        gc.gridy=2;
        formulario.add(num_ciclo =new JLabel("numero del ciclo:"),gc);
        
         gc.gridx=0;
        gc.gridy=3;
        formulario.add( fe_inicio=new JLabel("fecha de inicio:"),gc);
        
        gc.gridx=0;
        gc.gridy=4;
        formulario.add(fe_final =new JLabel("fecha de finalizacion:"),gc);
        
     
        
        gc.gridx=1;
        gc.gridy=1;
        formulario.add(t_anno=new JTextField(20),gc);
       
        gc.gridx=1;
        gc.gridy=2;
        formulario.add(t_num_ciclo=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=3;
        formulario.add(t_fe_inicio=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=4;
        formulario.add(t_fe_final=new JTextField(20),gc);
        
        gc.gridx=0;
        gc.gridy=7;
        formulario.add(aceptar=new JButton("Aceptar"),gc);
        
        gc.gridx=1;
        gc.gridy=7;
               
        formulario.add(cancel=new JButton("cancelar"),gc);
        
       principal.add(formulario,BorderLayout.CENTER);
       
       c.add(principal,BorderLayout.CENTER);
        
    }
    
    public void init() {
        setVisible(true);
    }
      private JPanel principal;
    private JPanel formulario;
    private GridBagConstraints gc;
   
    private JLabel anno;
    private JLabel num_ciclo;
    private JLabel fe_inicio;
    private JLabel fe_final;
    private JTextField t_id;
    private JTextField t_anno;
    private JTextField t_num_ciclo;
    private JTextField t_fe_inicio;
    private JTextField t_fe_final;
    private JButton aceptar;
    private JButton cancel;
    
}
