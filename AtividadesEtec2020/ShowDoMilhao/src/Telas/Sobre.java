package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Feito por");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(173, 100, 72, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblDouglasAdoNasicmento = new JLabel("Douglas Ad\u00E3o Nasicmento de Sousa N07");
		lblDouglasAdoNasicmento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDouglasAdoNasicmento.setBounds(75, 159, 280, 17);
		contentPane.add(lblDouglasAdoNasicmento);
		
		JLabel lblDiogoDaSilva = new JLabel("Diogo da Silva Rocha N06");
		lblDiogoDaSilva.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiogoDaSilva.setBounds(126, 188, 176, 17);
		contentPane.add(lblDiogoDaSilva);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/Sem T\u00EDtulo-1 - Copia (2).png")));
		lblNewLabel_1.setBounds(133, 300, 150, 150);
		contentPane.add(lblNewLabel_1);
		
	}
}
