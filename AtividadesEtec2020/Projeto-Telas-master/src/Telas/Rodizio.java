package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rodizio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rodizio frame = new Rodizio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rodizio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(65, 54, 117, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(247, 54, 117, 68);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("...");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(65, 185, 299, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valor = textField_1.getText();
				int nPlaca = Integer.parseInt(valor.substring(3,4));
				if (nPlaca == 1 | nPlaca == 2) {
					lblNewLabel.setText("Segunda-Feira");
				}
				else if (nPlaca == 3 | nPlaca == 4) {
					lblNewLabel.setText("Terça-Feira");
				}
				else if (nPlaca == 5 | nPlaca == 6) {
					lblNewLabel.setText("Quarta-Feira");
				}
				else if (nPlaca == 7 | nPlaca == 8) {
					lblNewLabel.setText("Quinta-Feira");
				}
				else {
					lblNewLabel.setText("Sexta-Feira");
				}
			}
		});
		btnNewButton.setBounds(65, 133, 117, 23);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblDigiteAPlaca = new JLabel("Digite a placa do carro");
		lblDigiteAPlaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteAPlaca.setFont(new Font("Arial", Font.BOLD, 24));
		lblDigiteAPlaca.setBounds(65, 2, 299, 41);
		contentPane.add(lblDigiteAPlaca);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rodizio.this.dispose();
			}
		});
		btnFechar.setBounds(247, 133, 117, 23);
		contentPane.add(btnFechar);
	}
}
