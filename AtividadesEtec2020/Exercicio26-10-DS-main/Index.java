import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Index extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtAno;
	private JTextField txtPaginas;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo:");
		lblNewLabel.setBounds(75, 54, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(75, 89, 74, 14);
		contentPane.add(lblAutor);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(75, 125, 74, 14);
		contentPane.add(lblAno);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(125, 51, 257, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		txtAutor.setBounds(125, 86, 257, 20);
		contentPane.add(txtAutor);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(125, 122, 257, 20);
		contentPane.add(txtAno);
		
		JLabel lblPginas = new JLabel("P\u00E1ginas:");
		lblPginas.setBounds(75, 163, 74, 14);
		contentPane.add(lblPginas);
		
		txtPaginas = new JTextField();
		txtPaginas.setColumns(10);
		txtPaginas.setBounds(125, 160, 257, 20);
		contentPane.add(txtPaginas);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Titulo");
		model.addColumn("Autor");
		model.addColumn("Ano");
		model.addColumn("Páginas");
		
		
		
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.addRow(new Object[] {
						txtTitulo.getText(),txtAutor.getText(),txtAno.getText(),txtPaginas.getText()
				});
				txtTitulo.setText("");
				txtAutor.setText("");
				txtAno.setText("");
				txtPaginas.setText("");
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 51, 257, 184);
		contentPane.add(scrollPane);
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int indice = table.getSelectedRow();
				txtTitulo.setText((String) model.getValueAt(indice, 0));
				txtAutor.setText((String) model.getValueAt(indice, 1));
				txtAno.setText((String) model.getValueAt(indice, 2));
				txtPaginas.setText((String) model.getValueAt(indice, 3));
			}
		});
		
		scrollPane.setViewportView(table);
		
		btnNewButton.setBounds(75, 188, 89, 47);
		contentPane.add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = table.getSelectedRow();
				if(indice > -1) {
					model.setValueAt(txtTitulo.getText(),indice,0);
					model.setValueAt(txtAutor.getText(),indice,1);
					model.setValueAt(txtAno.getText(),indice,2);
					model.setValueAt(txtPaginas.getText(),indice,3);
				}
				
				
			}
		});
		btnAlterar.setBounds(180, 188, 89, 47);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() > -1)model.removeRow(table.getSelectedRow());
				txtTitulo.setText("");
				txtAutor.setText("");
				txtAno.setText("");
				txtPaginas.setText("");
			}
		});
		btnExcluir.setBounds(293, 188, 89, 47);
		contentPane.add(btnExcluir);
		
		
	}
}
