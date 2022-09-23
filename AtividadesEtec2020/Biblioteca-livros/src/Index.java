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

import app.Livro;
import app.LivroDAO;

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
	DefaultTableModel model = new DefaultTableModel();
	private LivroDAO livroDAO = new LivroDAO();
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
		model.addColumn("ID");
		model.addColumn("Titulo");
		model.addColumn("Autor");
		model.addColumn("Ano");
		model.addColumn("Páginas");
		
		carregarLivros();
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Livro livro = new Livro();
				livro.setTitulo(txtTitulo.getText());
				livro.setAutor(txtAutor.getText());
				livro.setAno(Integer.parseInt((txtAno.getText())));
				livro.setPaginas(Integer.parseInt((txtPaginas.getText())));
				livroDAO.inserir(livro);
				carregarLivros();
				LimparCampos();
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
				txtTitulo.setText((String) model.getValueAt(indice, 1).toString());
				txtAutor.setText((String) model.getValueAt(indice, 2).toString());
				txtAno.setText((String) model.getValueAt(indice, 3).toString());
				txtPaginas.setText((String) model.getValueAt(indice, 4).toString());
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
					int id =  (int) model.getValueAt(table.getSelectedRow(), 0);
					Livro livro = new Livro();
					livro.setId(id);
					livro.setTitulo(txtTitulo.getText());
					livro.setAutor(txtAutor.getText());
					livro.setAno(Integer.parseInt((txtAno.getText())));
					livro.setPaginas(Integer.parseInt((txtPaginas.getText())));
					
					livroDAO.Alterar(livro);
					carregarLivros();
					LimparCampos();
				}
				
				
			}
		});
		btnAlterar.setBounds(180, 188, 89, 47);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() > -1) {
					int id =  (int) model.getValueAt(table.getSelectedRow(), 0);
					livroDAO.Excluir(id);
					carregarLivros();
					LimparCampos();
				}
			}
		});
		btnExcluir.setBounds(293, 188, 89, 47);
		contentPane.add(btnExcluir);
		
		
	}
	private void carregarLivros() {
		model.setRowCount(0);
		for(Livro livro : livroDAO.selecionarTodos()) {
			model.addRow(new Object[]{
				livro.getId(),
				livro.getTitulo(),
				livro.getAutor(),
				livro.getAno(),
				livro.getPaginas(),
			});
		}
	}
	private void LimparCampos() {
		txtTitulo.setText("");
		txtAutor.setText("");
		txtAno.setText("");
		txtPaginas.setText("");
	}
	
}
