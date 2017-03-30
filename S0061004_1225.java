import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class S0061004_1225 extends Frame
{
	static JFrame frm = new JFrame("BMI���ƭp��");
	static Container cp = frm.getContentPane();

	static JLabel lab1 = new JLabel("BMI���ƭp��");
	static JLabel lab2 = new JLabel("����(cm): ");
	static JLabel lab3 = new JLabel("�魫(kg): ");
	static JLabel lab4 = new JLabel("�E�_���G: ");
	static JLabel lab5 = new JLabel();

	static TextField txf1 = new TextField();
	static TextField txf2 = new TextField();

	static JButton btn = new JButton("�ݵ��G");

	public static void main(String args[])
	{
		btn.addActionListener(new ActLis());
		Container cp = frm.getContentPane();
		cp.setLayout(null);

		lab1.setBounds(100,20,100,20);
		lab2.setBounds(40,60,60,20);
		lab3.setBounds(40,100,60,20);
		lab4.setBounds(40,140,60,20);
		txf1.setBounds(100,60,100,20);
		txf2.setBounds(100,100,100,20);

		lab5.setBounds(100,140,230,20);
		btn.setBounds(100,180,100,20);

		cp.add(lab1);
		cp.add(lab2);
		cp.add(lab3);
		cp.add(lab4);
		cp.add(lab5);
		cp.add(txf1);
		cp.add(txf2);
		cp.add(btn);


		frm.setBounds(300,300,320,300);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		}
		static class ActLis implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				if (e.getSource() == btn)
				{
					double h = Double.parseDouble(txf1.getText())/100;
					double w = Double.parseDouble(txf2.getText());
					double bmi = w/(h*h);
					String bmistr = String.format("%.2f", bmi);

					if (bmi<18.5)
					{
						lab5.setText("BMI = "+bmistr+"�魫�L��");
						lab5.setForeground(Color.red);
						}
						else if (bmi<24)
						{
							lab5.setText("BMI = "+bmistr+"���`�d��");
							lab5.setForeground(Color.blue);
							}
							else if (bmi<27)
							{
								lab5.setText("BMI = "+bmistr+"�L��");
								lab5.setForeground(Color.red);
								}
								else if (bmi<30)
								{
									lab5.setText("BMI = "+bmistr+"���תέD");
									lab5.setForeground(Color.red);
									}
									else if (bmi<35)
									{
										lab5.setText("BMI = "+bmistr+"���תέD");
										lab5.setForeground(Color.red);
										}
										else
										{
											lab5.setText("BMI = "+bmistr+"���תέD");
											lab5.setForeground(Color.red);
											}
					}
				}
			}
	}