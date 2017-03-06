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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ccg
 */
public class EliminarAdministrador extends JFrame{
     public EliminarAdministrador(ControlVis c) {
            super("eliminar Administrador");
            gestor=c;
        ajustarComponentes(getContentPane());   
        setMinimumSize(new Dimension(500,150));
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
        formulario.add(cedula =new JLabel("Cedula del administrador a eliminar:"),gc);    
      
        gc.gridx=1;
        gc.gridy=0;
        formulario.add(t_cedula=new JTextField(20),gc);
      
        gc.gridx=0;
        gc.gridy=2;
                aceptar=new JButton("Aceptar");
                aceptar.addActionListener((ActionEvent e)->{eliminar();});
        formulario.add(aceptar,gc);
        
        gc.gridx=1;
        gc.gridy=2;
               
                cancel=new JButton("cancelar");
                cancel.addActionListener((ActionEvent e)->{salir();});
        formulario.add(cancel,gc);
        
       principal.add(formulario,BorderLayout.CENTER);
       
       c.add(principal,BorderLayout.CENTER);
        
    }
     private void salir()
    {
        VenOpcAdministra vi = new VenOpcAdministra(gestor);
        vi.init();
        this.dispose();
    }
    public void init() {
        setVisible(true);
    }
      private boolean blanco()
    {
        if(t_cedula.getText()=="")
        {
            return true;
        }
        else 
            return false;
    }
       private void eliminar()
     {
         if(blanco())
         {
               JOptionPane.showMessageDialog(null, "Campo vacio","Error",JOptionPane.ERROR_MESSAGE);
           
         }
         else 
         {
             gestor.eliminarPersona( t_cedula.getText());
             salir();
         }
     }
      private JPanel principal;
    private JPanel formulario;
    private GridBagConstraints gc;  
    private JLabel cedula;
    private JTextField t_cedula;    
    private JButton aceptar;
    private JButton cancel;
    private ControlVis gestor;
    
}
