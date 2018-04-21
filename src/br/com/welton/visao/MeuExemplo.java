package br.com.welton.visao;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MeuExemplo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lblTitulo,lblNome,lblSobrenome,lblNascimento;
	 
	JTextField txtNome,txtSobrenome,txtNascimento;
	
	public MeuExemplo() {
		this.setSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Meu exemplo");
		this.setLocationRelativeTo(null);
		
		GroupLayout layout = new GroupLayout(this.getContentPane());
		this.setLayout(layout);
		
		lblTitulo = label("Cadastro");
		lblNome = label("Nome");
		txtNome = campoTexto();
		lblSobrenome= label("Sobrenome");
		txtSobrenome = campoTexto();
		lblNascimento = label("Nascimento");
		txtNascimento = campoTexto();
				
		
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//						linha1
						.addGroup(layout.createSequentialGroup()
							   .addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//							   .addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							   )
//						linha2
						.addGroup(layout.createSequentialGroup()
//							 	colunas1
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//								.addGap(30)
//							 	colunas2
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
						)
//						linha3	
						.addGroup(layout.createSequentialGroup()
//								 	colunas1
								   .addComponent(lblSobrenome, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//								 	colunas2
								   .addComponent(txtSobrenome, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
								   )
//						
//						linha4
						.addGroup(layout.createSequentialGroup()
//								    colunas1
									.addComponent(lblNascimento, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//									coluna2
									.addComponent(txtNascimento, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								   )
			     )
		);	
		
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
//						linha 1
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								//Coluna1
								.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								)
						.addGap(10)
//						linha 2
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								//Coluna1
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								//Coluna2
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)		
								)
//						.addGap(20)
//						linha 3
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								//Coluna1
								.addComponent(lblSobrenome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								//Coluna2
								.addComponent(txtSobrenome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)		
								)
						.addGap(10)
//						linha 4
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								//Coluna1
								.addComponent(lblNascimento, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								//Coluna2
								.addComponent(txtNascimento, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)		
								)
				)
		);	
		
//		lblTitulo = label("Cadastro");
//		lblNome = label("Nome");
//		txtNome = campoTexto();
//		lblSobrenome= label("Sobrenome");
//		txtSobrenome = campoTexto();
//		lblNascimento = label("Nascimento");
//		txtNascimento = campoTexto();
//					
//		
	}
	
	
	/**
	 * Método que cria uma descrição
	 * @param descricao - descrição escrita
	 * @param posicao - Posição do item
	 * @return JLabel - Retorna um label com as caracteristicas informadas.
	 */
	private JLabel label(String descricao) {
		JLabel label = new JLabel(descricao);
		return label;
	}

	/**
	 * Método que cria uma descrição
	 * @param w - largura
	 * @param h - altura
	 * @return JLabel - Retorna um label com as caracteristicas informadas.
	 */
	private JTextField campoTexto() {
		JTextField label = new JTextField();
		return label;
	}

	
}
