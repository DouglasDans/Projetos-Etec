package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Resultado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Resultado() {
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
		
		JLabel lblAcerto = new JLabel("Acertos: ");
		lblAcerto.setForeground(Color.WHITE);
		lblAcerto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAcerto.setBounds(41, 187, 174, 20);
		contentPane.add(lblAcerto);
		
		JLabel lblErro = new JLabel("Erros:");
		lblErro.setForeground(Color.WHITE);
		lblErro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblErro.setBounds(41, 218, 174, 20);
		contentPane.add(lblErro);
		
		JLabel SILVAO = new JLabel("");
		SILVAO.setIcon(new ImageIcon(Resultado.class.getResource("/img/silvo2.png")));
		SILVAO.setForeground(Color.WHITE);
		SILVAO.setFont(new Font("Tahoma", Font.BOLD, 16));
		SILVAO.setBounds(28, 125, 396, 336);
		contentPane.add(SILVAO);
		
		JLabel lblPorAcerto = new JLabel("Acertos %:");
		lblPorAcerto.setForeground(Color.WHITE);
		lblPorAcerto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPorAcerto.setBounds(41, 247, 174, 20);
		contentPane.add(lblPorAcerto);
		
		JLabel lblPorErro = new JLabel("Erros %:");
		lblPorErro.setForeground(Color.WHITE);
		lblPorErro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPorErro.setBounds(41, 278, 174, 20);
		contentPane.add(lblPorErro);
		
		lblAcerto.setText(String.valueOf("Acertos: "+Pontos.getAcerto()));
		lblErro.setText(String.valueOf("Erros: "+Pontos.getErro()));
		lblPorAcerto.setText(String.valueOf("Acertos %: "+100*Pontos.getAcerto()/10)+" %");
		lblPorErro.setText(String.valueOf("Erros %: "+100*Pontos.getErro()/10)+" %");
		
		
	}
}
