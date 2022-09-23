package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Pergunta2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta1 frame = new Pergunta1();
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
	public Pergunta2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Em qual regi\u00E3o brasileira localiza - se o estado do Amap\u00E1 ?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 117, 404, 29);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 0, 424, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(224, 0, 200, 104);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Pergunta1.class.getResource("/img/logo.png")));
		
		JLabel label = new JLabel("");
		label.setBounds(224, -3, 200, 104);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Pergunta1.class.getResource("/img/silvo.png")));
		label_1.setBounds(-397, -110, 970, 450);
		panel.add(label_1);
		
		
		
		JRadioButton rb1 = new JRadioButton("Centro-oeste");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rb1.setBounds(10, 157, 358, 23);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Norte");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rb2.setBounds(10, 195, 358, 23);
		contentPane.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Sul");
		rb3.setFont(new Font("Tahoma", Font.BOLD, 14));
		rb3.setBounds(10, 233, 358, 23);
		contentPane.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("Suldeste");
		rb4.setFont(new Font("Tahoma", Font.BOLD, 14));
		rb4.setBounds(10, 272, 358, 23);
		contentPane.add(rb4);
		
		ButtonGroup rbGrupo = new ButtonGroup();
		rbGrupo.add(rb1);
		rbGrupo.add(rb2);
		rbGrupo.add(rb3);
		rbGrupo.add(rb4);
		
		
		JButton btnNewButton = new JButton(" Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index tela = new Index();
				tela.setVisible(true);
				Pergunta2.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(27, 326, 132, 49);
		contentPane.add(btnNewButton);
		
		JButton btnPrximaPegunta = new JButton("Pr\u00F3xima");
		btnPrximaPegunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rbGrupo.isSelected(null)) {
					JOptionPane.showMessageDialog(null, "selecionar uma opção é necessário");
				}else {
					if (rb2.isSelected()) {
						Pontos.acertou();
					} else {
						Pontos.errou();
					}
					Pergunta3 tela = new Pergunta3();
					tela.setVisible(true);
					Pergunta2.this.dispose();
				}
			}
		});
		btnPrximaPegunta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrximaPegunta.setBounds(204, 326, 132, 49);
		contentPane.add(btnPrximaPegunta);
	}
}
