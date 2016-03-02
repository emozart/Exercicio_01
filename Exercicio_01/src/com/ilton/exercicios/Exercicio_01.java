package com.ilton.exercicios;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

public class Exercicio_01 extends JFrame {

	private static final long serialVersionUID = 8285846729332472214L;
	private JPanel contentPane;
	private JTextField tfdIdade;
	private JLabel lblImageDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_01 frame = new Exercicio_01();
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
	public Exercicio_01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tfdIdade = new JTextField();
		tfdIdade.setColumns(10);
		
		JButton btnVerificarIdade = new JButton("Verificar Idade");
		btnVerificarIdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ImageIcon imagem01 = new ImageIcon(getClass().getResource("res\\DSC00950.JPG"));
				Image img01 = imagem01.getImage().getScaledInstance(lblImageDisplay.getWidth(), lblImageDisplay.getHeight(), Image.SCALE_DEFAULT);
				imagem01.setImage(img01);
				
				ImageIcon imagem02 = new ImageIcon(getClass().getResource("res\\DSC02277.JPG"));
				Image img02 = imagem02.getImage().getScaledInstance(lblImageDisplay.getWidth(), lblImageDisplay.getHeight(), Image.SCALE_DEFAULT);
				imagem02.setImage(img02);
				
				ImageIcon imagem03 = new ImageIcon(getClass().getResource("res\\DSC02309.JPG"));
				Image img03 = imagem03.getImage().getScaledInstance(lblImageDisplay.getWidth(), lblImageDisplay.getHeight(), Image.SCALE_DEFAULT);
				imagem03.setImage(img03);
				
				int idade = Integer.parseInt(tfdIdade.getText());
				
				if(idade<16){
					lblImageDisplay.setIcon(imagem01);
				}else if(idade>=16 && idade<50){
					lblImageDisplay.setIcon(imagem02);
				}else if(idade>50){
					lblImageDisplay.setIcon(imagem03);
				}
				lblImageDisplay.repaint();
			}
		});
		
		lblImageDisplay = new JLabel("");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tfdIdade, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVerificarIdade)
					.addContainerGap(181, Short.MAX_VALUE))
				.addComponent(lblImageDisplay, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfdIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVerificarIdade))
					.addGap(18)
					.addComponent(lblImageDisplay, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
