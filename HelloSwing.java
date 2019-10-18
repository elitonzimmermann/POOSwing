import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HelloSwing extends JFrame{
	

	public HelloSwing() {
		// Titulo da Janela
		setTitle("Hello Swing");
		// Tamanho da Janela
		setSize(300, 300);
		// Nao permite modificar o tamanho da Tela
		setResizable(false);
		// Configura a tela
		setLayout();
	}
	
	// Configura a tela
	private void setLayout() {
		JPanel panel = new JPanel();
		// Retira o gerenciador de layout
		panel.setLayout(null);
		// Adiciona bordas
		panel.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com titulo
			   ,BorderFactory.createTitledBorder("Login")));

		// Campo texto com 10 caracteres
		JTextField text = new JTextField(10);
		text.setBounds(140, 40, 100, 30);
		
		JPasswordField text2 = new JPasswordField();
		text2.setBounds(140, 80, 100, 30);
		
		JLabel label = new JLabel("Usuário:");
		// Cor do texto
		label.setForeground(Color.BLUE);
		label.setBounds(80, 40, 80, 30);
		
		JLabel label2 = new JLabel("Senha");
		// Cor do texto
		label2.setForeground(Color.BLUE);
		label2.setBounds(80, 80, 80, 30);
		
		JCheckBox check = new JCheckBox("Manter conectado");
		check.setBounds(120, 140, 140, 30);

		
		// Campo texto com 10 caracteres
		JTextField text3 = new JTextField(20);
		text3.setBounds(140, 40, 100, 30);
		
		JLabel label3 = new JLabel("Esqueci minha senha");
		// Cor do texto
		label3.setForeground(Color.BLUE);
		label3.setBounds(125, 160, 140, 30);
		
		JButton button = new JButton("Acessar");
		button.setBounds(140, 110, 100, 30);
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String texto = text.getText();
//				label.setText(texto);
//				
//				//JOptionPane.showMessageDialog(null, 
//				//		"Olá!");
//			}
//		});
		
	
		
		panel.add(text);
		panel.add(button);
		panel.add(text2);
		panel.add(text3);
		// Adiciona o label no painel
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(check);
		
		//Adiciona o painel no frame
		add(panel);
	}
	

}
