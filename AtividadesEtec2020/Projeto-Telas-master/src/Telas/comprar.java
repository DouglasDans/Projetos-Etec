package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class comprar extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comprar frame = new comprar();
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
	public comprar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor Total");
		lblNewLabel.setBounds(191, 11, 82, 14);
		contentPane.add(lblNewLabel);
		
		txtResultado = new JTextField();
		txtResultado.setBackground(Color.LIGHT_GRAY);
		txtResultado.setEditable(false);
		txtResultado.setForeground(Color.RED);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtResultado.setText("R$ 0,00");
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(10, 27, 414, 51);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 89, 414, 190);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chArroz = new JCheckBox("Arroz (18,50)");
		chArroz.setBounds(6, 7, 191, 23);
		panel.add(chArroz);
		
		JCheckBox chbxFeijao = new JCheckBox("Feij\u00E3o (8,90)");
		chbxFeijao.setBounds(6, 33, 191, 23);
		panel.add(chbxFeijao);
		
		JCheckBox chbxAcucar = new JCheckBox("Ac\u00FAcar (2,40)");
		chbxAcucar.setBounds(6, 59, 191, 23);
		panel.add(chbxAcucar);
		
		JCheckBox chbxCafe = new JCheckBox("Caf\u00E9 (9,80)");
		chbxCafe.setBounds(6, 84, 191, 23);
		panel.add(chbxCafe);
		
		JCheckBox chckbxCereal = new JCheckBox("Cereal (13,90)");
		chckbxCereal.setBounds(6, 110, 191, 23);
		panel.add(chckbxCereal);
		
		JCheckBox chckbxAzeite = new JCheckBox("Azeite (12,80)");
		chckbxAzeite.setBounds(6, 136, 191, 23);
		panel.add(chckbxAzeite);
		
		JCheckBox chckbxFarinhaDeTrigo = new JCheckBox("Farinha de Trigo (3,60)");
		chckbxFarinhaDeTrigo.setBounds(6, 162, 191, 23);
		panel.add(chckbxFarinhaDeTrigo);
		
		JCheckBox chckbxQueijo = new JCheckBox("Queijo (9,50)");
		chckbxQueijo.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxQueijo.setBounds(252, 7, 156, 23);
		panel.add(chckbxQueijo);
		
		JCheckBox chckbxSal = new JCheckBox("Sal (1,90)");
		chckbxSal.setBounds(252, 33, 156, 23);
		panel.add(chckbxSal);
		
		JCheckBox chckbxGelatina = new JCheckBox("Gelatina (0,90)");
		chckbxGelatina.setBounds(252, 59, 156, 23);
		panel.add(chckbxGelatina);
		
		JCheckBox chckbxBatata = new JCheckBox("Batata (5,60)");
		chckbxBatata.setBounds(252, 84, 156, 23);
		panel.add(chckbxBatata);
		
		JCheckBox chckbxMaionese = new JCheckBox("Maionese (6,30)");
		chckbxMaionese.setBounds(252, 110, 156, 23);
		panel.add(chckbxMaionese);
		
		JCheckBox chckbxBiscoitobolacha = new JCheckBox("Biscoito/Bolacha (3,60)");
		chckbxBiscoitobolacha.setBounds(252, 136, 156, 23);
		panel.add(chckbxBiscoitobolacha);
		
		JCheckBox chckbxTempero = new JCheckBox("Tempero (1,50)");
		chckbxTempero.setBounds(252, 162, 156, 23);
		panel.add(chckbxTempero);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar.this.dispose();
			}
		});
		btnNewButton.setBounds(10, 290, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar.this.dispose();
				comprar janela = new comprar();
				janela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(167, 290, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado = 0;
				if (chArroz.isSelected()) {
					resultado += 18.50;
				}
				if (chbxFeijao.isSelected()) {
					resultado += 8.90;
				}
				if (chbxAcucar.isSelected()) {
					resultado += 2.40;
				}
				if (chbxCafe.isSelected()) {
					resultado += 9.80;
				}
				if (chckbxCereal.isSelected()) {
					resultado += 13.90;
				}
				if (chckbxAzeite.isSelected()) {
					resultado += 12.80;
				}
				if (chckbxFarinhaDeTrigo.isSelected()) {
					resultado += 3.60;
				}
				if (chckbxQueijo.isSelected()) {
					resultado += 9.50;
				}
				if (chckbxSal.isSelected()) {
					resultado += 1.90;
				}
				if (chckbxGelatina.isSelected()) {
					resultado += 0.90;
				}
				if (chckbxBatata.isSelected()) {
					resultado += 5.60;
				}
				if (chckbxMaionese.isSelected()) {
					resultado += 6.30;
				}
				if (chckbxBiscoitobolacha.isSelected()) {
					resultado += 3.60;
				}
				if (chckbxTempero.isSelected()) {
					resultado += 1.50;
				}
				String txtvresultado = String.format("%.2f", resultado);
				txtResultado.setText("R$ "+txtvresultado);
			}
		});
		btnNewButton_2.setBounds(335, 290, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
