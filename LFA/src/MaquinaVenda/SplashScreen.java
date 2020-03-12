package MaquinaVenda;

import java.awt.Color;
//Importando bibliotecas utilizadas
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class SplashScreen extends JFrame {
	private BufferedImage content;
	private JProgressBar bar;
	private ImageIcon gif;
	private BufferedImage fundo;

public SplashScreen(){
	InicializarComponentes();
}



public void InicializarComponentes() {
	this.setUndecorated(true);
	this.setTitle(null);
	this.setLayout(null);
	this.setSize(400, 400);
	this.setResizable(false);
	this.setLocationRelativeTo(null);
	this.setVisible(false);
	this.setBackground(Color.white);;

	gif = new ImageIcon("img\\coca.gif");
	final JLabel splash = new JLabel(gif);

	this.add(splash);
	this.show();
	new Thread() {
		public void run() {

			try {
				splash.setSize(400, 400);
				splash.setBorder(null);
				splash.setBackground(Color.white);
				splash.setLocale(getLocale());
				splash.setVisible(true);
				bar = new JProgressBar();

				
				
			} catch (Exception ex) {
				ex.getMessage();
			}
			for (int i = 0; i < 40; i++) {

				try {
					sleep(40);
					bar.setValue(i);

				} catch (Exception ie) {

				}
			}
			try {
					dispose();
					mainWindow mw= new mainWindow();
					mw.show();

				}
				catch (java.lang.NoSuchMethodError ex) {

				}

			
			}
		}.start();

	}
}