/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Control;
import Modelo.*;
import Modelo.Lista;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ccg
 */
public class MostrarGruProf extends JFrame {
    
  public MostrarGruProf(Control c) {
            super("Mostrar Grupos de un profesor");
            tabla= new ModeloTabla4();
            
        ajustarComponentes(getContentPane());   
        gestor=c;
        setMinimumSize(new Dimension(600,400));
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
        JPanel busca= new JPanel();
        busca.setLayout(new FlowLayout());
        
         formulario =new JPanel(new BorderLayout());
         bus= new JLabel("cédula del profesor que desea ver los grupos");
         busca.add(bus);
         buscar= new JTextField(10);
         busca.add(buscar);
         b_buscar= new JButton("Buscar");
         b_buscar.addActionListener((ActionEvent e)->{mostrar();});
         busca.add(b_buscar);
         
         formulario.add(busca,BorderLayout.NORTH);
         
       JPanel pTabla=new JPanel();
       
        pTabla.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        pTabla.setLayout(new BorderLayout());
        

          JScrollPane desplazamientoTabla = new JScrollPane(
                  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        tablaDatos = new JTable();        
        tablaDatos.setModel(tabla);
        
        desplazamientoTabla.setViewportView(tablaDatos);
        
        pTabla.add(BorderLayout.CENTER, desplazamientoTabla);
        formulario.add(pTabla,BorderLayout.CENTER);
        principal.add(formulario);
        c.add(principal);
        
    }
     private void salir()
    {
        VenOpcEstudiante vi = new VenOpcEstudiante(gestor);
        vi.init();
        this.dispose();
    }
     
     
    public void init() {
        setVisible(true);
    }
    
   
    private void mostrar()
    {
       if(buscar.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Campo vacio","Error",JOptionPane.ERROR_MESSAGE);
       }
       else
        if(!gestor.existePro(buscar.getText()))
        {
            JOptionPane.showMessageDialog(null, "Profesor no existe","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        { 
            Lista l= new Lista();
//            gestor.(buscar.getText(),l);
            Grupo c= new Grupo();
            Persona p= new Persona(0);
            for(int i=0; i< l.size();i++)
            {
                c= (Grupo)l.getElemento(i);
                gestor.buscarPer(p, c.getProfesor());
                tabla.addRow(new Object[]{c.getNumero(),c.getProfesor(),p.getNombre()});
            }
        }
        
    }
    
      private JPanel principal;
      private Control gestor;
    private JPanel formulario;
   
    private JButton aceptar;
   private JTable tablaDatos;
   public ModeloTabla4 tabla;
   private JTextField buscar;
   private JLabel bus;
    private JButton b_buscar;
    
    
}
 class ModeloTabla4 extends DefaultTableModel {

        public ModeloTabla4() {
            super(new Object[][]{},
                    new String[]{"numero", "id Prof","Profesor"});
            
            }
        
        @Override
        public boolean isCellEditable(int filas, int columnas)
        {
            return false;
        }
    }
