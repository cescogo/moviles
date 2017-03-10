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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author ccg
 */
public class VenMatriculador extends JFrame {
    
    public VenMatriculador(Control c) {
        
        super("Administrador");
        gestor=c;
        ajustarComponentes(getContentPane());
        
        setMinimumSize(new Dimension(450, 300));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void ajustarComponentes(Container c) {
           c.setLayout(new BorderLayout());
        JPanel principal = new JPanel();
        principal.setLayout(new BorderLayout());

        JPanel central = new JPanel(new GridLayout(4,2,30,30) );
        central.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        
        principal.add(central, BorderLayout.CENTER);
        c.add(principal, BorderLayout.CENTER);
    
				desmatricular= new JButton("Desmatricular estudiante"); 
                                desmatricular.addActionListener((ActionEvent e)->{Vendesmatricular();});
				central.add(desmatricular);
                                
                                matricular= new JButton("matricular estudiante");
                                matricular.addActionListener((ActionEvent e)->{venmatricular();});
				central.add(matricular);
                                
                                
                                salir= new JButton("logout");
                                salir.addActionListener((ActionEvent e)->{salir();});
				central.add(salir);
    
        }

    private void Vendesmatricular()
    {
        
    		VenDesmatricular ve= new VenDesmatricular(gestor);
                ve.init();
                this.dispose();
    }

    public void init() {
        setVisible(true);
    }
    
    private void venmatricular()
    {
    		VenMatricular ve= new VenMatricular(gestor);
                ve.init();
                this.dispose();
            
    }
  
       private void ventanaCurso()
       {
           //ventana matricular
//           vi.init();
           this.dispose();
       }
       
     
      
       
       
       private void salir()
       {
           VentanaInicio vi = new VentanaInicio();
           vi.init();
           this.dispose();
       }
    private JButton desmatricular;
    private JButton matricular;
    
    private JButton salir;
    private Control gestor;
    private GridBagConstraints gc;


    
}
