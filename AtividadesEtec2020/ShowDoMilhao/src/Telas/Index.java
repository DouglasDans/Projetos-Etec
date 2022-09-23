package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Index() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Index.class.getResource("/img/logo.png")));
		lblNewLabel.setBounds(103, 29, 200, 104);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pergunta1 tela = new Pergunta1();
				tela.setVisible(true);
				Index.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnNewButton.setBounds(130, 166, 143, 46);
		contentPane.add(btnNewButton);
		
		JButton btnInstrues = new JButton("Instru\u00E7\u00F5es\r\n");
		btnInstrues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucoes tela = new Instrucoes();
				tela.setVisible(true);
				Index.this.dispose();
			}
		});
		btnInstrues.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnInstrues.setBounds(130, 242, 143, 46);
		contentPane.add(btnInstrues);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sobre tela = new Sobre();
				tela.setVisible(true);
				Index.this.dispose();
			}
		});
		btnSobre.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnSobre.setBounds(130, 312, 143, 46);
		contentPane.add(btnSobre);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Index.class.getResource("/img/silvo.png")));
		lblNewLabel_1.setBounds(-119, 166, 725, 431);
		contentPane.add(lblNewLabel_1);
	}
}
