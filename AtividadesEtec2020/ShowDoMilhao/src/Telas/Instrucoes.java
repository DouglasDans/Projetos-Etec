package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;


public class Instrucoes extends JFrame {

	private JPanel contentPane;

	public Instrucoes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Instrucoes.class.getResource("/img/logo.png")));
		lblNewLabel.setBounds(112, 69, 200, 104);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jogue, somente para ganhar...");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(122, 184, 192, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPerguntas = new JLabel("10 Perguntas");
		lblPerguntas.setForeground(Color.WHITE);
		lblPerguntas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPerguntas.setBounds(185, 213, 285, 17);
		contentPane.add(lblPerguntas);
		
		JLabel lblPeuntasVariadasDe = new JLabel("Perguntas variadas, de v\u00E1rios assuntos");
		lblPeuntasVariadasDe.setForeground(Color.WHITE);
		lblPeuntasVariadasDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPeuntasVariadasDe.setBounds(85, 241, 285, 17);
		contentPane.add(lblPeuntasVariadasDe);
		
		JLabel lblBoaSorte = new JLabel("Boa Sorte");
		lblBoaSorte.setForeground(Color.WHITE);
		lblBoaSorte.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBoaSorte.setBounds(185, 269, 185, 17);
		contentPane.add(lblBoaSorte);
		
	}
}
