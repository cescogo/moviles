/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Control;
import Modelo.*;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ccg
 */
public class MostrarEstGrupo extends JFrame {
    
public MostrarEstGrupo(Control c, String curso, int grupo) {
            super("Mostrar Estudiantes de un Grupo");
            tabla= new ModeloTabla5();
            this.curso=curso;    
            this.grupo=grupo;
            l = new Lista();
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
       
        
         formulario =new JPanel(new BorderLayout());
       
         
        
       JPanel pTabla=new JPanel();
       
        pTabla.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        pTabla.setLayout(new BorderLayout());
        

          JScrollPane desplazamientoTabla = new JScrollPane(
                  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        tablaDatos = new JTable();        
        tablaDatos.setModel(tabla);
        
        desplazamientoTabla.setViewportView(tablaDatos);
        tablaDatos.addMouseListener(new MouseAdapter() 
        {
            
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                {
                    int row= tablaDatos.getSelectedRow();
                  Grupo c= (Grupo) l.getElemento(row);
                    //modificar nota
                }
            }
        });
        
    
        pTabla.add(BorderLayout.CENTER, desplazamientoTabla);
        formulario.add(pTabla,BorderLayout.CENTER);
        principal.add(formulario);
        c.add(principal);
        
    }
     private void salir()
    {
        VenOpcEstudiante vi = new VenOpcEstudiante(gestor);
        vi.init();
        l.Clean();
        this.dispose();
    }
     
     
    public void init() {
        setVisible(true);
        mostrar();
    }
    
   
    private void mostrar()
    { 
        
        l.Clean();
            gestor.EstGrupo(curso, grupo, l);
            Alumno c= new Alumno();
            Nota p= new Nota();
            for(int i=0; i< l.size();i++)
            {
                p= (Nota)l.getElemento(i);
                gestor.buscarPer(c, p.getESTUDIANTE());
                tabla.addRow(new Object[]{c.getCedula(),c.getNombre(),p.getNOTA()});
            }  
            
    }
    
   
      private JPanel principal;
      private Control gestor;
    private JPanel formulario;
   
    private JButton aceptar;
   private JTable tablaDatos;
   public ModeloTabla5 tabla;
    
    private Lista l;
    private String curso;
    private int grupo;
    
    
}
 class ModeloTabla5 extends DefaultTableModel {

        public ModeloTabla5() {
            super(new Object[][]{},
                    new String[]{"cedula Est","nombre Est","nota "});
            
            }
        
        @Override
        public boolean isCellEditable(int filas, int columnas)
        {
            return false;
        }
    }


