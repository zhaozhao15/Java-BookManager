package com.zhao.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;

public class ZhaoInterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZhaoInterFrm frame = new ZhaoInterFrm();
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
	public ZhaoInterFrm() {
		setTitle("\u5173\u4E8EZhao");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblZhao = new JLabel("Zhao");
		lblZhao.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("QQ954442743");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		
		JLabel lblZhaodonghaocom = new JLabel("zhaodonghao0105@163.com");
		lblZhaodonghaocom.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("https://github.com/zhaozhao15");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblZhaodonghaocom)
						.addComponent(lblNewLabel)
						.addComponent(lblZhao))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(67)
					.addComponent(lblZhao)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblZhaodonghaocom)
					.addGap(27)
					.addComponent(lblNewLabel_1)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
