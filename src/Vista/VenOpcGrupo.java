/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Control;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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
public class VenOpcGrupo extends JFrame{
     public VenOpcGrupo(Control c) {
        
        super("Opciones de Grupo");
        gestor=c;
        ajustarComponentes(getContentPane());
        setMinimumSize(new Dimension(440,250));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void ajustarComponentes(Container c) {
           c.setLayout(new BorderLayout());
        JPanel principal = new JPanel();
        principal.setLayout(new BorderLayout());
        principal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        principal.setBackground(Color.WHITE);

        JPanel central = new JPanel(new GridLayout(2,2,30,30) );
        central.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        central.setBackground(Color.WHITE);
        
        
        principal.add(central, BorderLayout.CENTER);
        c.add(principal, BorderLayout.CENTER);
    
				agregar= new JButton("agregar grupo");
                                agregar.addActionListener((ActionEvent e)->{agregar();});
				central.add(agregar);
				
				modificar= new JButton("modificar grupo");
                                modificar.addActionListener((ActionEvent e)->{modificar();});
				central.add(modificar);
				
				consultar= new JButton("buscar grupo");
				central.add(consultar);
				
				eliminar= new JButton("eliminar grupo");
                                eliminar.addActionListener((ActionEvent e)->{eliminar();});
				central.add(eliminar);
                                
                                   salir= new JButton("salir");
                                salir.addActionListener((ActionEvent e)->{salir();});
                                cancelar =new JPanel(new BorderLayout());       
                                cancelar.add(salir ,BorderLayout.EAST);
                                cancelar.setBackground(Color.WHITE);
                                
				principal.add(cancelar,BorderLayout.SOUTH);
    
        }

   
    private void eliminar()
    {
        EliminarGrupo vi= new EliminarGrupo(gestor);
        vi.init();
        this.dispose();
    }

    public void init() {
        setVisible(true);
       
    }
     private void modificar()
     {
         ModificarGrupo vi= new ModificarGrupo(gestor);
         vi.init();
         this.dispose();
     }
  private void agregar()
    {
    	AgregarGrupo vi=new AgregarGrupo(gestor);
        vi.init();
        this.dispose();
    }
    
    private void salir()
    {
        VentanaAdministrador vi= new VentanaAdministrador(gestor);
        vi.init();
        this.dispose();
    }
    
    private JButton agregar;
    private JButton consultar; 
    private JButton modificar;
    private JButton eliminar;
    private JButton salir;
    private Control gestor;
    private JPanel cancelar;
}
