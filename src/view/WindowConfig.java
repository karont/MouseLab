package view;


import modelo.artificialinteligent.AIType;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import controler.Lab;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class WindowConfig extends javax.swing.JFrame{
	private JTextField tfWidth;
	private JTextField tfHeight;
	private JTextField tfTurn;
	public WindowConfig() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Yellow Mouse");
		
		JLabel lblNewLabel_1 = new JLabel("Red Mouse");
		
		JLabel lblNewLabel_2 = new JLabel("Blue Mouse");
		
		JLabel lblNewLabel_3 = new JLabel("Green Mouse");
		
		JComboBox<AIType> cbYellow = new JComboBox<AIType>();
		cbYellow.addItem(AIType.HUMAN);
		cbYellow.addItem(AIType.RANDOM);
		
		JComboBox<AIType> cbRed = new JComboBox<AIType>();
		cbRed.addItem(AIType.HUMAN);
		cbRed.addItem(AIType.RANDOM);
		
		JComboBox<AIType> cbBlue = new JComboBox<AIType>();
		cbBlue.addItem(AIType.HUMAN);
		cbBlue.addItem(AIType.RANDOM);
		
		JComboBox<AIType> cbGreen = new JComboBox<AIType>();
		cbGreen.addItem(AIType.HUMAN);
		cbGreen.addItem(AIType.RANDOM);
		
		JLabel lblM = new JLabel("Width");
		
		tfWidth = new JTextField();
		tfWidth.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Height");
		
		tfHeight = new JTextField();
		tfHeight.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Turn");
		
		tfTurn = new JTextField();
		tfTurn.setColumns(10);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Lab lab =  new Lab(Integer.parseInt(tfWidth.getText()),Integer.parseInt(tfHeight.getText()),Integer.parseInt(tfTurn.getText()),(AIType)cbYellow.getSelectedItem(),(AIType)cbRed.getSelectedItem(),(AIType)cbBlue.getSelectedItem(),(AIType)cbGreen.getSelectedItem());
				setVisible(false);
		    	lab.start();
			}
		});
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addGap(50)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(cbGreen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(cbYellow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbRed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbBlue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(130)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblM)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_5))
									.addGap(26)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(tfTurn, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
										.addComponent(tfWidth, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
										.addComponent(tfHeight, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(189)
							.addComponent(btnAccept)))
					.addGap(73))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbYellow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblM)
						.addComponent(tfWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(cbRed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(tfHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(cbBlue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(tfTurn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(cbGreen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addComponent(btnAccept)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		pack();
	}
}
