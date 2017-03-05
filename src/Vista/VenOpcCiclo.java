/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
public class VenOpcCiclo extends JFrame {
     public VenOpcCiclo() {
        
        super("Opciones de Ciclo");
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
    
				agregar= new JButton("agregar ciclo");   
                                agregar.addActionListener((ActionEvent e)->{agregar();});
				central.add(agregar);
				
				modificar= new JButton("modificar ciclo");
				central.add(modificar);
				
				consultar= new JButton("buscar ciclo");
				central.add(consultar);
				
				eliminar= new JButton("eliminar ciclo");
				central.add(eliminar);
                                
                                   salir= new JButton("salir");
                                salir.addActionListener((ActionEvent e)->{salir();});
                                cancelar =new JPanel(new BorderLayout());       
                                cancelar.add(salir ,BorderLayout.EAST);
                                cancelar.setBackground(Color.WHITE);
                                
				principal.add(cancelar,BorderLayout.SOUTH);
    
        }

    public void confiEventos() {
    	//estudiante.addActionListener(ActionEvent e)->{ventanaEstudiante()}];

    }

    public void init() {
        setVisible(true);
       
    }
    
    private void agregar()
    {
    	AgregarCiclo vi=new AgregarCiclo();
        vi.init();
        this.dispose();
    }
    private void salir()
    {
        VentanaAdministrador vi= new VentanaAdministrador();
        vi.init();
        this.dispose();
    }
    
    private JButton agregar;
    private JButton consultar; 
    private JButton modificar;
    private JButton eliminar;
    private JButton salir;
    private JPanel cancelar;
}
