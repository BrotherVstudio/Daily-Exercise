package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame {
	private JFrame jfMain;//定义主窗体对象
	private JButton jbtLogin;//定义登录按钮
	private JButton jbtCancel;
	private JButton jbtSouth,jbtNorth,jbtEast,jbtWest,jbtCenter;
	private Container c;//定义容器
	public MainFrame(){
		jfMain=new JFrame("main");
		c=jfMain.getContentPane();//获取窗体内容面板作为容器
		c.setBackground(Color.red);
		//jbtLogin=new JButton("login");
		//jbtCancel=new JButton("Cancel");
		jbtSouth=new JButton("South");
		jbtNorth=new JButton("North");
		jbtEast=new JButton("East");
		jbtWest=new JButton("west");
		jbtCenter=new JButton("Center");
		/*jfMain.add(jbtCenter);
		jfMain.add(jbtWest,BorderLayout.WEST);
		jfMain.add(jbtEast,BorderLayout.EAST);
		jfMain.add(jbtSouth,BorderLayout.SOUTH);
		jfMain.add(jbtNorth,BorderLayout.NORTH);
		//jfMain.add(jbtLogin);
		//jfMain.add(jbtCancel);*/
		//c.add(jbtCenter);
		//c.add(jbtWest,BorderLayout.WEST);
		jfMain.setSize(300,200);//设置窗体大小
		jfMain.setLocation(100,200);
		jfMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfMain.setVisible(true);//设置窗体可见
		
	}
}


/*class Test{
	public static void main(String[] args){
		new MainFrame();
	}	
}
*/