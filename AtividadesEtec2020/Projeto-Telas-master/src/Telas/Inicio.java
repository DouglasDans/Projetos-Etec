package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 157);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calculadora janela = new Calculadora();
				janela.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Inicio.class.getResource("/img/calculadora.png")));
		btnNewButton.setBounds(10, 11, 88, 93);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salario janela = new salario();
				janela.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(Inicio.class.getResource("/img/salario.png")));
		button.setBounds(108, 11, 88, 93);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rodizio janela = new Rodizio();
				janela.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(Inicio.class.getResource("/img/rodizio.png")));
		button_1.setBounds(206, 11, 88, 93);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar janela = new comprar();
				janela.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon(Inicio.class.getResource("/img/comprar.png")));
		button_2.setBounds(304, 11, 88, 93);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurante janela = new Restaurante();
				janela.setVisible(true);
			}
		});
		button_3.setIcon(new ImageIcon(Inicio.class.getResource("/img/restaurante.png")));
		button_3.setBounds(402, 11, 88, 93);
		contentPane.add(button_3);
	}
}
