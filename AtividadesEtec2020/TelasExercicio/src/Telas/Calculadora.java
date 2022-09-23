package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(328, 12, 121, 14);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel = new JLabel("Digite o 1\u00BA n\u00FAmero:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 11, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDigiteO = new JLabel("Digite o 2\u00BA n\u00FAmero:");
		lblDigiteO.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteO.setBounds(175, 11, 121, 14);
		contentPane.add(lblDigiteO);
		
		tfNumero1 = new JTextField();
		tfNumero1.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNumero1.setHorizontalAlignment(SwingConstants.CENTER);
		tfNumero1.setBounds(23, 36, 113, 20);
		contentPane.add(tfNumero1);
		tfNumero1.setColumns(10);
		
		tfNumero2 = new JTextField();
		tfNumero2.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNumero2.setHorizontalAlignment(SwingConstants.CENTER);
		tfNumero2.setColumns(10);
		tfNumero2.setBounds(175, 36, 121, 20);
		contentPane.add(tfNumero2);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfResultado.setHorizontalAlignment(SwingConstants.CENTER);
		tfResultado.setEditable(false);
		tfResultado.setColumns(10);
		tfResultado.setBounds(336, 36, 113, 20);
		contentPane.add(tfResultado);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero1 = Integer.parseInt(tfNumero1.getText().toString());
				int numero2 = Integer.parseInt(tfNumero2.getText().toString());
				int soma = numero1 + numero2;
				String resultado = Integer.toString(soma);
				tfResultado.setText(resultado);
			}
		});
		btnSomar.setFont(new Font("Century Gothic", Font.PLAIN, 38));
		btnSomar.setBounds(10, 62, 67, 67);
		contentPane.add(btnSomar);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero1 = Integer.parseInt(tfNumero1.getText().toString());
				int numero2 = Integer.parseInt(tfNumero2.getText().toString());
				int subtracao = numero1 - numero2;
				String resultado = Integer.toString(subtracao);
				tfResultado.setText(resultado);
			}
		});
		btnSubtrair.setVerticalAlignment(SwingConstants.TOP);
		btnSubtrair.setFont(new Font("Century Gothic", Font.PLAIN, 38));
		btnSubtrair.setBounds(87, 62, 67, 67);
		contentPane.add(btnSubtrair);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(tfNumero1.getText().toString());
				int numero2 = Integer.parseInt(tfNumero2.getText().toString());
				int multiplicacao = numero1 * numero2;
				String resultado = Integer.toString(multiplicacao);
				tfResultado.setText(resultado);
			}
		});
		btnMultiplicar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMultiplicar.setFont(new Font("Century Gothic", Font.PLAIN, 38));
		btnMultiplicar.setBounds(164, 62, 67, 67);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(tfNumero1.getText().toString());
				double numero2 = Double.parseDouble(tfNumero2.getText().toString());
				double divisao = numero1 / numero2;
				String resultado = String.format("%.2f", divisao);
				tfResultado.setText(resultado);
			}
		});
		btnDividir.setFont(new Font("Century Gothic", Font.PLAIN, 38));
		btnDividir.setBounds(241, 62, 67, 67);
		contentPane.add(btnDividir);
		
		JButton btnLimpar = new JButton("L");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumero1.setText("");
				tfNumero2.setText("");
				tfResultado.setText("");
			}
		});
		btnLimpar.setFont(new Font("Century Gothic", Font.PLAIN, 38));
		btnLimpar.setBounds(318, 62, 67, 67);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("X");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora.this.dispose();
			}
		});
		btnFechar.setFont(new Font("Century Gothic", Font.PLAIN, 38));
		btnFechar.setBounds(395, 62, 67, 67);
		contentPane.add(btnFechar);
		
	}
}
