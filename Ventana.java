import java.awt.Checkbox;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;



public class Ventana extends JFrame implements ActionListener{
	
	public JButton abrir,
				   guardar;
	
	private JTextField vx,
					  vy,
					  altura,
					  aceleracion;
			JSlider barra;
			Checkbox dibujar;
	
	public Ventana(){
		super("Tiro Parabolico ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MiPanel panelBoton=new MiPanel();
		panelBoton.setLayout(null);
		JTextField text1=new JTextField();
		JScrollPane scroller = new JScrollPane(panelBoton); 
		
		this.vx=new JTextField();
		this.vx.setBounds(125, 90, 70, 35);
		JLabel etiquetavx=new JLabel("Vx:");
		etiquetavx.setBounds(60, 85, 350, 50);
		
		this.vy=new JTextField();
		this.vy.setBounds(125, 160, 70, 35);
		JLabel etiquetavy=new JLabel("Vy:");
		etiquetavy.setBounds(60, 155, 350, 50);
		
		this.altura=new JTextField();
		this.altura.setBounds(125, 230, 70, 35);
		JLabel etiquetamax=new JLabel("Altura Maxima:");
		etiquetamax.setBounds(30, 220, 350, 50);
		
		this.aceleracion=new JTextField();
		this.aceleracion.setBounds(125, 300, 70, 35);
		JLabel etiquetaaceleracion=new JLabel("Aceleracion:");
		etiquetaaceleracion.setBounds(30, 290, 350, 50);
		 
		this.barra = new JSlider (JSlider.VERTICAL,0,100,0);
		this.barra.setPaintLabels(true);
		this.barra.setPaintTicks(true);
		this.barra.setMajorTickSpacing(25);
		this.barra.setMinorTickSpacing(5);
		this.barra.setPaintLabels(true);
		this.barra.setBounds(105, 390, 70, 145);
		
		this.dibujar=new Checkbox();
		this.dibujar.setBounds(140, 559, 70, 35);
		JLabel etiquetadibujar=new JLabel("Dibujar Linea");
		etiquetadibujar.setBounds(30, 550, 350, 50);
		
		this.guardar=new JButton("Guardar");
		this.guardar.addActionListener(this);
		this.guardar.setBounds(210, 650, 140, 50);
		
		this.abrir=new JButton("Abrir");
		this.abrir.addActionListener(this);
		this.abrir.setBounds(45, 650, 140, 50);
		
		
		
		
		panelBoton.add(this.guardar);
		panelBoton.add(this.abrir);
		panelBoton.add(this.vx);
		panelBoton.add(etiquetavx);
		panelBoton.add(this.vy);
		panelBoton.add(etiquetavy);
		panelBoton.add(this.altura);
		panelBoton.add(etiquetamax);
		panelBoton.add(this.aceleracion);
		panelBoton.add(etiquetaaceleracion);
		panelBoton.add(this.barra);
		panelBoton.add(this.dibujar);
		panelBoton.add(etiquetadibujar);
		
		this.add(panelBoton);
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent x) {
		if(x.getSource()==this.abrir){
			MiPanel panelpopup=new MiPanel();
			//panelpopup.setLayout(null);
			
			Ventana vabrir=new Ventana();
			vabrir.pack();
			vabrir.setVisible(true);
			vabrir.pack();
		}
	}
	public static void main(String[] args) {
		Ventana miventana= new Ventana();
	}

	
}
