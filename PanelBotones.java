import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class PanelBotones extends JPanel implements ActionListener {

	private JButton abrir,
					lanzar,
					guardar;

	private JTextField vx,
					   vy,
					   altura,
					   aceleracion;

	private JSlider barra;
	private Checkbox dibujar;
	private JLabel etiquetavx,
				   etiquetavy,
				   etiquetamax,
				   etiquetaac,
				   etiquetadib;

	public PanelBotones(){
		
		this.setLayout(null);
		
		this.etiquetavx=new JLabel("Vx:");
		this.etiquetavx.setBounds(90, 60, 350, 50);
		this.vx=new JTextField();
		this.vx.setBounds(120, 70, 70, 35);

		this.etiquetavy=new JLabel("Vy:");
		this.etiquetavy.setBounds(90, 130, 350,50);
		this.vy=new JTextField();
		this.vy.setBounds(120, 140, 70, 35);

		this.etiquetamax=new JLabel("Altura Maxima:");
		this.etiquetamax.setBounds(25, 200, 350,50);
		this.altura=new JTextField();
		this.altura.setBounds(120, 210, 70, 35);

		this.etiquetaac=new JLabel("Aceleracion:");
		this.etiquetaac.setBounds(40, 270, 350,50);
		this.aceleracion=new JTextField();
		this.aceleracion.setBounds(120, 280, 70, 35);

		this.barra = new JSlider (JSlider.VERTICAL,0,100,0);
		this.barra.setPaintLabels(true);
		this.barra.setPaintTicks(true);
		this.barra.setMajorTickSpacing(25);
		this.barra.setMinorTickSpacing(5);
		this.barra.setPaintLabels(true);
		this.barra.setBounds(120, 360, 70, 145);

		this.etiquetadib=new JLabel("Dibujar trayectoria");
		this.etiquetadib.setBounds(90, 520, 350,50);
		this.dibujar=new Checkbox();
		this.dibujar.setBounds(70, 540, 10, 10);

		this.lanzar=new JButton("Lanzar");
		this.lanzar.addActionListener(this);
		this.lanzar.setBounds(100, 590, 90, 40);
		
		this.guardar=new JButton("Guardar");
		this.guardar.addActionListener(this);
		this.guardar.setBounds(60, 650, 80, 40);

		this.abrir=new JButton("Abrir");
		this.abrir.addActionListener(this);
		this.abrir.setBounds(160, 650, 80, 40);

		this.add(this.vx);
		this.add(etiquetavx);
		this.add(this.vy);
		this.add(etiquetavy);
		this.add(this.altura);
		this.add(etiquetamax);
		this.add(this.aceleracion);
		this.add(etiquetaac);
		this.add(this.barra);
		this.add(this.dibujar);
		this.add(etiquetadib);
		this.add(lanzar);
		this.add(this.guardar);
		this.add(this.abrir);
		
		this.setPreferredSize(new Dimension (275,720));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
