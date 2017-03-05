package Vista;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class VentanaAdministrador extends JFrame  {

    public VentanaAdministrador() {
        super("Administrador");
        ajustarComponentes(getContentPane());
        
        setMinimumSize(new Dimension(650, 300));
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
    
				estudiante= new JButton("menu de estudiante"); 
                                estudiante.addActionListener((ActionEvent e)->{ventanaEstudiante();});
				central.add(estudiante);
				
				profesor= new JButton("menu de profesor");
                                profesor.addActionListener((ActionEvent e)->{ventanaProfesor();});
				central.add(profesor);
				
				administrador= new JButton("menu de administrador");
                                administrador.addActionListener((ActionEvent e)->{ventanaAdministrador();});
				central.add(administrador);
				
				matriculador= new JButton("menu de matriculador");
                                matriculador.addActionListener((ActionEvent e)->{ventanaMatriculador();});
				central.add(matriculador);
                                
                                curso= new JButton("menu de curso");
				central.add(curso);
                                
                                ciclo= new JButton("menu de ciclo");
				central.add(ciclo);
                                
                                grupo= new JButton("menu de grupo");
				central.add(grupo);
                                
                                carrera=new JButton("menu de carrera");
                                central.add(carrera);
                                
                                salir= new JButton("atras");
				central.add(salir);
    
        }

    private void abrirVentanaEstu()
    {
        
    }

    public void init() {
        setVisible(true);
    }
    
    private void ventanaEstudiante()
    {
    		VenOpcEstudiante ve= new VenOpcEstudiante();
                ve.init();
                this.dispose();
            
    }
    
     private void ventanaProfesor()
    {
    		VenOpcProfesor ve= new VenOpcProfesor();
                ve.init();
                this.dispose();
            
    }
    
      private void ventanaAdministrador()
    {
    		VenOpcAdministra ve= new VenOpcAdministra();
                ve.init();
                this.dispose();
            
    }
      
       private void ventanaMatriculador()
    {
    		VenOpcMatriculador ve= new VenOpcMatriculador();
                ve.init();
                this.dispose();
            
    }
    
    private JButton estudiante;
    private JButton profesor; 
    private JButton administrador;
    private JButton matriculador;
    private JButton grupo;
    private JButton curso;
    private JButton ciclo;
    private JButton carrera;
    private JButton salir;
  
    private GridBagConstraints gc;

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String id=e.getActionCommand();
//        if(e.getActionCommand().equals("menu de estudiante"))
//        {
//            ventanaEstudiante();
//        }
//        else
//            
//         if(e.getActionCommand().equals("menu de profesor"))
//        {
//            ventanaProfesor();
//        }
//        else
//          if(e.getActionCommand().equals("menu de admonistrador"))
//        {
//            ventanaAdministrador();
//        }
//         
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}

  