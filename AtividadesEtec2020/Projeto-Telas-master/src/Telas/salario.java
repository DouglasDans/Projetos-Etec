package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class salario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salario frame = new salario();
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
	public salario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 150, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite o Sal\u00E1rio");
		lblNewLabel.setBounds(10, 11, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(170, 11, 46, 14);
		contentPane.add(lblBonus);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 128, 128));
		panel.setBounds(10, 84, 150, 131);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Desconto");
		lblNewLabel_1.setBounds(28, 11, 55, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INSS (7,5%)");
		lblNewLabel_2.setBounds(10, 36, 73, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("VT (6%)");
		lblNewLabel_3.setBounds(10, 61, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VA (4,5%)");
		lblNewLabel_4.setBounds(10, 86, 73, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 111, 78, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_9 = new JLabel("0");
		lblNewLabel_9.setBounds(81, 36, 59, 14);
		panel.add(lblNewLabel_9);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBounds(66, 61, 74, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(76, 86, 64, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(62, 111, 78, 14);
		panel.add(label_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 255, 47));
		panel_1.setBounds(170, 84, 127, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Bonifica\u00E7\u00E3o");
		lblNewLabel_6.setBounds(40, 11, 77, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Bonus");
		lblNewLabel_7.setBounds(10, 36, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("VC (5%)");
		lblNewLabel_8.setBounds(10, 61, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel label_4 = new JLabel("0");
		label_4.setBounds(66, 36, 51, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("0");
		label_5.setBounds(66, 61, 51, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("0");
		label_6.setBounds(66, 106, 51, 14);
		panel_1.add(label_6);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 106, 46, 14);
		panel_1.add(lblTotal);
		
		JLabel lblSalrioFinal = new JLabel("Sal\u00E1rio Final");
		lblSalrioFinal.setBounds(226, 11, 71, 14);
		contentPane.add(lblSalrioFinal);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setEnabled(false);
		textField_2.setBounds(226, 31, 71, 42);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 500, 1));
		spinner.setBounds(170, 31, 46, 42);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salario.this.dispose();
			}
		});
		btnNewButton.setBounds(10, 226, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salario.this.dispose();
				salario janela = new salario();
				janela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(109, 226, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(textField.getText().toString());
				double spin = Double.parseDouble(spinner.getValue().toString());
				double salarioTotal = numero1;
				double inss = (7.5*salarioTotal)/100;
				String txtInss = String.format("%.2f", inss);
				lblNewLabel_9.setText(txtInss);
				numero1 -= inss;
				double vt = (6*salarioTotal)/100;
				String txtvt = String.format("%.2f", vt);
				label_1.setText(txtvt);
				numero1 -= vt;
				double va = (4.5*salarioTotal)/100;
				String txtva = String.format("%.2f", va);
				label_2.setText(txtva);
				numero1 -= va;
				String txtTotal = String.format("%.2f", (va+vt+inss));
				label_3.setText(txtTotal);
				
				
				double bonificacao = (spin*salarioTotal)/100;
				String txtbonner = String.format("%.2f", bonificacao);
				label_4.setText(txtbonner);
				numero1 += bonificacao;
				double vc = (5*salarioTotal)/100;
				String txtvc = String.format("%.2f", vc);
				label_5.setText(txtvc);
				numero1 += vc;
				String txtTotal1 = String.format("%.2f", (bonificacao+vc));
				label_6.setText(txtTotal1);
				String txtSalFinal = String.format("%.2f", (numero1));
				textField_2.setText(txtSalFinal);
				
			}
		});
		btnNewButton_2.setBounds(208, 226, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
