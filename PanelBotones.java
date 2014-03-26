import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class PanelBotones extends JPanel implements ActionListener, ChangeListener, DocumentListener {

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
				   etiquetamts,
				   etiquetadib;
	
	private int x=0,
				y=0,
				alturamax=100;
	
	private double nacelereacion=-9.81;

	public PanelBotones(){
		
		this.setLayout(null);
		//DocumentListener MyDocumentListener=new DocumentListener();
		
		this.etiquetavx=new JLabel("Vx:");
		this.etiquetavx.setBounds(90, 60, 350, 50);
		this.vx=new JTextField(Integer.toString(this.x));
		this.vx.setBounds(120, 70, 70, 35);

		this.etiquetavy=new JLabel("Vy:");
		this.etiquetavy.setBounds(90, 130, 350,50);
		this.vy=new JTextField(Integer.toString(this.y));
		this.vy.setBounds(120, 140, 70, 35);

		this.etiquetamax=new JLabel("Altura Maxima:");
		this.etiquetamax.setBounds(25, 200, 350,50);
		this.altura=new JTextField(Integer.toString(this.alturamax));
		this.altura.setBounds(120, 210, 70, 35);

		this.etiquetaac=new JLabel("Aceleracion:");
		this.etiquetaac.setBounds(40, 270, 350,50);
		this.aceleracion=new JTextField(Double.toString(nacelereacion));
		this.aceleracion.setBounds(120, 280, 70, 35);

		this.barra = new JSlider (JSlider.VERTICAL,0,this.alturamax,50);
		this.barra.setPaintTicks(true);
		this.barra.setMajorTickSpacing(25);
		this.barra.setBounds(60, 360, 70, 145);
		this.barra.addChangeListener(this);
		
		this.etiquetamts=new JLabel("mts: "+barra.getValue());
		this.etiquetamts.setBounds(150, 410, 90, 40);
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
		this.add(this.etiquetavx);
		this.add(this.vy);
		this.add(this.etiquetavy);
		this.add(this.altura);
		this.add(this.etiquetamax);
		this.add(this.aceleracion);
		this.add(this.etiquetaac);
		this.add(this.barra);
		this.add(this.dibujar);
		this.add(this.etiquetamts);
		this.add(this.etiquetadib);
		this.add(this.lanzar);
		this.add(this.guardar);
		this.add(this.abrir);
		
		
		this.altura.getDocument().addDocumentListener(new DocumentListener()
        {

            public void changedUpdate(DocumentEvent arg0){

            }
            public void insertUpdate(DocumentEvent arg0){
            	modificarValores();
            }

            public void removeUpdate(DocumentEvent arg0) {
            	modificarValores();
            }
        });
		
		
		this.setPreferredSize(new Dimension (275,720));

	}
	
	public void modificarValores(){
		try{
			if(altura.getText()!=null || altura.getText()!=""){
				this.alturamax=Integer.parseInt(this.altura.getText());
				this.barra.setMaximum(this.alturamax);
			}
		}
		catch(NumberFormatException e){
		}
		
	}
	
	public int getBarra(){
		return this.barra.getValue();
	}
	
	public int getAlturaMax(){
		return this.alturamax;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.lanzar){
			System.out.println("Se ha lanzado la pelota");
		}
		if(e.getSource()==this.abrir){
			System.out.println("Se ha presionado el boton abrir");
		}
		if(e.getSource()==this.guardar){
			System.out.println("Se ha presionado el boton lanzar");
		}
		
	}
	
	public void stateChanged(ChangeEvent e) {
		int valor;
		if(e.getSource()==this.barra){
			valor=barra.getValue();
			this.etiquetamts.setText("mts: "+valor);
		}
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
