package clases;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Ejecuta extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar menu=  new JMenuBar();
	PanelSolitario panel = new PanelSolitario();
	JMenuItem men= new JMenuItem("Partida Nueva");
	JMenuItem men3= new JMenuItem("Acerca del Juego");
	JMenuItem men2= new JMenuItem("Salir");
    public Ejecuta() 
    {
    	setLayout(new BorderLayout());
    	add(panel,BorderLayout.CENTER);
    	this.setJMenuBar(menu);
    	JMenu menu1=new JMenu("Opciones");
    	men.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e)
    		{
    			new Ejecuta();
    			dispose();
    		}
    	});
    	menu1.add(men);
    	men2.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e)
    		{
    		System.exit(0);
    		}
    	});
    	men3.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e)
    		{
    			JOptionPane.showMessageDialog(null,"ETHOS software corporation\nSolitario Clasico en Java version 1.0\nProgramado por Jesus Ortega");
    		}
    	});
    	setResizable(false);
    	menu1.add(men3);
    	menu1.add(men2);
    	menu.add(menu1);
    	panel.setBackground(Color.yellow);
    	setSize(800,580);
    	setLocationRelativeTo(null);
    	setVisible(true);
    }
    
    public static void main (String[] args) {
	new Ejecuta();
	}
}