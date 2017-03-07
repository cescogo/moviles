/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Control;
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
public class AgregarGrupo extends JFrame {
          public AgregarGrupo(Control c) {
            super("agregar Grupo");
        ajustarComponentes(getContentPane());   
        setMinimumSize(new Dimension(500,350));
        setResizable(false);
        gestor=c;
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
        ciclo= new JLabel("Numero de ciclo");
        formulario.add(ciclo,gc);
        
        gc.gridx=0;
        gc.gridy=1;
        formulario.add(numero =new JLabel("numero de grupo:"),gc);
        
      
        gc.gridx=0;
        gc.gridy=2;
        formulario.add(horario =new JLabel("horario:"),gc);
        
         gc.gridx=0;
        gc.gridy=3;
        formulario.add( profesor=new JLabel("identificacion del profesor:"),gc);
        
        gc.gridx=0;
        gc.gridy=4;
        formulario.add(curso =new JLabel("codigo del curso:"),gc);
        
      
        gc.gridx=1;
        gc.gridy=0;
        formulario.add(t_ciclo=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=1;
        formulario.add(t_numero=new JTextField(20),gc);
       
        gc.gridx=1;
        gc.gridy=2;
        formulario.add(t_horario=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=3;
        formulario.add(t_profesor=new JTextField(20),gc);
        
        gc.gridx=1;
        gc.gridy=4;
        formulario.add(t_curso=new JTextField(20),gc);
        
        
        gc.gridx=0;
        gc.gridy=7;
        formulario.add(aceptar=new JButton("Aceptar"),gc);
        
        gc.gridx=1;
        gc.gridy=7;
               
                cancel=new JButton("cancelar");
                cancel.addActionListener((ActionEvent e)->{salir();});
        formulario.add(cancel,gc);
        
       principal.add(formulario,BorderLayout.CENTER);
       
       c.add(principal,BorderLayout.CENTER);
        
    }
     private void salir()
    {
        VenOpcGrupo vi = new VenOpcGrupo(gestor);
        vi.init();
        this.dispose();
    }
    public void init() {
        setVisible(true);
    }
      private JPanel principal;
    private JPanel formulario;
    private GridBagConstraints gc;
    private JLabel ciclo;
    private JLabel numero;
    private JLabel horario;
    private JLabel profesor;
    private JLabel curso;
    private Control gestor;
    private JTextField t_ciclo;
    private JTextField t_numero;
    private JTextField t_horario;
    private JTextField t_profesor;
    private JTextField t_curso;
    
    private JButton aceptar;
    private JButton cancel;
}
