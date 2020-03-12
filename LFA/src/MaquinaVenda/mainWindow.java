package MaquinaVenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class mainWindow extends JFrame implements ActionListener,FocusListener{
	private JLabel imgMaquina;
	private JButton buttonClose;
	private JButton buttonInsert;
	private JTextField textValue=new JTextField();
	int soma=0;
	

public void InicializaComponentes(){
		
		//Janela
		this.setTitle("Máquina de vendas");
		this.setLayout(null);
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setFocusable(true);
		this.setUndecorated(true);
		
		
		buttonClose=new JButton(new ImageIcon("img/buttonClose.png"));
		buttonClose.setBounds(350,0,50,50);
		buttonClose.addActionListener(this);
		this.add(buttonClose);
		
		buttonInsert=new JButton(new ImageIcon("img/coin.png"));
		buttonInsert.setBounds(100,220,200,80);
		buttonInsert.addActionListener(this);
		this.add(buttonInsert);
		
		textValue.setBounds(80,140,250,35);
		textValue.setText("Insira uma moeda entre 10$ e 25$ centavoss):");
		textValue.addFocusListener(this);
		this.add(textValue);
		
		imgMaquina=new JLabel(new ImageIcon("img\\background.jpg"));
		imgMaquina.setBounds(0,0,400,400);
		this.add(imgMaquina);
		
		this.show();
		 
		
		
}

public mainWindow() {
	InicializaComponentes();
}
	public void focusGained(FocusEvent e) {
		if(e.getSource()==textValue) {
			textValue.setText("");
		}
		
	}

	
	public void focusLost(FocusEvent e) {
		
		
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonClose){
			this.dispose();
		}
		if(e.getSource()== buttonInsert) {
			
			int moeda;
			int valor;
			
			moeda = Integer.parseInt(textValue.getText());
			valor=moeda;
			
			if(valor!=10 && valor!=25) {
				JOptionPane.showMessageDialog(null, "Valor não aceito, não possuímos devolução!!!");
			}
			else {
				do{
					moeda = Integer.parseInt(textValue.getText());
					valor=moeda;
					soma+=valor;
					if(soma==45) {
						JOptionPane.showMessageDialog(null, "Coca-Cola adquirida! Valor total R$: 0,45");
						soma=0;
					}
					if(soma>45) {
						JOptionPane.showMessageDialog(null, "Coca-Cola adquirida! Valor total R$: 0,"+soma+ ", valor perdido $: 0,"+(soma-45));
						soma=0;
					}
					break;
				}while(valor!=0);
				
			}
			
			
			
			
			
			}
		}
	
	}



