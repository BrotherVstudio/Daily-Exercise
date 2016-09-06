package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame {
	private JFrame jfLogin;
	private JLabel lbUser, lbPass;
	private JTextField jtfUser, jtfPass;
	private JButton jbtLogin, jbtCancel;
	private JPanel jpUser, jpPass, jpButton;
	private Container c;

	public LoginFrame() {
		jfLogin = new JFrame("登录主窗体");
		c = jfLogin.getContentPane();
		lbUser = new JLabel("用户");
		lbPass = new JLabel("密码");
		jtfUser = new JTextField(14);
		jtfPass = new JTextField(14);
		jbtLogin = new JButton("登录");
		jbtCancel = new JButton("取消");
		jpUser = new JPanel();
		jpPass = new JPanel();
		jpButton = new JPanel();
		jpUser.add(lbUser);
		jpUser.add(jtfUser);
		jpPass.add(lbPass);
		jpPass.add(jtfPass);
		jpButton.add(jbtLogin);
		jpButton.add(jbtCancel);
		c.add(jpUser, BorderLayout.NORTH);
		c.add(jpPass);
		c.add(jpButton, BorderLayout.SOUTH);
		jfLogin.pack();
		jfLogin.setResizable(false);
		jfLogin.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginFrame();
	}
}