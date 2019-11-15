package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculator {

	private JFrame frame;//���
	private String textfield_string = "";
	private String label_string = "";
	private String save_string = "";
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(
				new Runnable() 
				{
					public void run()
					{
						try {
							Calculator window = new Calculator();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		
		char[] exp = new char[100];
		String ch = "1--2";
		char[] ch2 = ch.toCharArray();
		
		TranslateExpress teExpress = new TranslateExpress();

		teExpress.translateExpress(ch2, exp);
		System.out.println(exp);
		ComputeExpress ceComputeExpress = new ComputeExpress();		
		System.out.println(ceComputeExpress.computeExpress(exp));
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lp\\Downloads\\20120705125221237_easyicon_cn_128.png"));
		frame.setTitle("\u8BA1\u7B97\u5668");
		frame.setBounds(100, 100, 334, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 316, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("��Բ", Font.BOLD, 16));
		textField.setBounds(12, 0, 292, 28);
		textField.setEditable(false);
		panel.add(textField);
		textField.setColumns(10);
		
		label = new JLabel("0");
		label.setFont(new Font("��Բ", Font.BOLD, 16));
		label.setBounds(36, 30, 268, 31);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(label);
		
		label_1 = new JLabel("");
		label_1.setFont(new Font("��Բ", Font.BOLD, 16));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(12, 30, 23, 31);
		panel.add(label_1);
		
		//����һ�����
		ButtonPanel panel_1 = new ButtonPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
	}
	
	private class ButtonPanel extends JPanel
	{
		public ButtonPanel()
		{
			this.setBounds(0, 61, 316, 246);
			
			
			JButton btnMc = new JButton("MC");
			btnMc.setBounds(10, 5, 51, 28);
			this.add(btnMc);
			btnMc.setFont(new Font("��Բ", Font.BOLD, 13));
			btnMc.addActionListener(new ButtonListener("MC"));
			
			JButton btnMr = new JButton("MR");
			btnMr.setBounds(71, 5, 51, 28);
			this.add(btnMr);
			btnMr.setFont(new Font("��Բ", Font.BOLD, 13));
			btnMr.addActionListener(new ButtonListener("MR"));
			
			JButton btnMs = new JButton("MS");
			btnMs.setBounds(132, 5, 51, 28);
			this.add(btnMs);
			btnMs.setFont(new Font("��Բ", Font.BOLD, 13));
			btnMs.addActionListener(new ButtonListener("MS"));
			
			JButton btnM = new JButton("M+");
			btnM.setBounds(193, 5, 51, 28);
			this.add(btnM);
			btnM.setFont(new Font("��Բ", Font.BOLD, 13));
			btnM.addActionListener(new ButtonListener("M+"));
			
			JButton btnM_1 = new JButton("M-");
			btnM_1.setBounds(254, 5, 52, 28);
			this.add(btnM_1);
			btnM_1.setFont(new Font("��Բ", Font.BOLD, 13));
			btnM_1.addActionListener(new ButtonListener("M-"));
			
			JButton button_5 = new JButton("<-");
			button_5.setBounds(10, 43, 51, 28);
			this.add(button_5);
			button_5.addActionListener(new ButtonListener("<-"));
			
			JButton btnCe = new JButton("CE");
			btnCe.setBounds(71, 43, 51, 28);
			this.add(btnCe);
			btnCe.setFont(new Font("��Բ", Font.BOLD, 13));
			btnCe.addActionListener(new ButtonListener("CE"));
			
			JButton btnC = new JButton("C");
			btnC.setBounds(132, 43, 51, 28);
			this.add(btnC);
			btnC.setFont(new Font("��Բ", Font.BOLD, 13));
			btnC.addActionListener(new ButtonListener("C"));
			
			JButton button_8 = new JButton("+-");
			button_8.setBounds(193, 43, 51, 28);
			this.add(button_8);
			button_8.addActionListener(new ButtonListener("+-"));			
			
			JButton button_9 = new JButton("~");
			button_9.setBounds(255, 43, 51, 28);
			this.add(button_9);
			button_9.addActionListener(new ButtonListener("~"));
			
			JButton button_10 = new JButton("7");
			button_10.setBounds(10, 81, 51, 28);
			this.add(button_10);
			button_10.addActionListener(new ButtonListener("7"));
			
			JButton btnCe_1 = new JButton("8");
			btnCe_1.setBounds(71, 81, 51, 28);
			this.add(btnCe_1);
			btnCe_1.addActionListener(new ButtonListener("8"));
			
			JButton button_12 = new JButton("9");
			button_12.setBounds(132, 81, 51, 28);
			this.add(button_12);
			button_12.addActionListener(new ButtonListener("9"));
			
			JButton button_13 = new JButton("/");
			button_13.setBounds(193, 81, 51, 28);
			this.add(button_13);
			button_13.addActionListener(new ButtonListener("/"));
			
			JButton button_14 = new JButton("%");
			button_14.setBounds(254, 81, 52, 28);
			this.add(button_14);
			button_14.addActionListener(new ButtonListener("%"));
			
			JButton button_15 = new JButton("4");
			button_15.setBounds(10, 119, 51, 28);
			this.add(button_15);
			button_15.addActionListener(new ButtonListener("4"));
			
			JButton button_16 = new JButton("5");
			button_16.setBounds(71, 119, 51, 28);
			this.add(button_16);
			button_16.addActionListener(new ButtonListener("5"));
			
			JButton button_17 = new JButton("6");
			button_17.setBounds(132, 119, 51, 28);
			this.add(button_17);
			button_17.addActionListener(new ButtonListener("6"));
			
			JButton button_18 = new JButton("*");
			button_18.setBounds(193, 119, 51, 28);
			this.add(button_18);
			button_18.addActionListener(new ButtonListener("*"));
			
			JButton btnx = new JButton("/x");
			btnx.setBounds(254, 119, 52, 28);
			this.add(btnx);
			btnx.addActionListener(new ButtonListener("/x"));
			
			JButton button_20 = new JButton("1");
			button_20.setBounds(10, 157, 51, 25);
			this.add(button_20);
			button_20.addActionListener(new ButtonListener("1"));
			
			JButton button_21 = new JButton("2");
			button_21.setBounds(71, 157, 51, 25);
			this.add(button_21);
			button_21.addActionListener(new ButtonListener("2"));
			
			
			JButton button_22 = new JButton("3");
			button_22.setBounds(132, 157, 51, 25);
			this.add(button_22);
			button_22.addActionListener(new ButtonListener("3"));
			
			JButton button_23 = new JButton("-");
			button_23.setBounds(193, 157, 51, 28);
			this.add(button_23);
			button_23.addActionListener(new ButtonListener("-"));
			
			JButton button_25 = new JButton("0");
			button_25.setBounds(10, 192, 112, 28);
			this.add(button_25);
			button_25.addActionListener(new ButtonListener("0"));
			
			JButton button_27 = new JButton("+");
			button_27.setBounds(193, 195, 51, 25);
			this.add(button_27);
			button_27.addActionListener(new ButtonListener("+"));
			
			JButton button_28 = new JButton(".");
			button_28.setBounds(132, 192, 51, 28);
			this.add(button_28);
			button_28.addActionListener(new ButtonListener("."));
			
			JButton button_29 = new JButton("=");
			button_29.setBounds(254, 157, 52, 63);
			this.add(button_29);
			button_29.addActionListener(new ButtonListener("="));
		}	
	}
	
	String string = null;
	boolean flag = true;//�ж϶�ε������
	boolean flag2 = true;//�ж��ٴε�����ţ��޸ķ���
	boolean flag3 = true;//�ж���������Ⱥ�
	boolean flag4 = false;//�ж��и��ŵ������
	boolean flag5  = false;//�жϵ��������֮�󣬵�����ּ�����ԭ���Ľ�������
	boolean flag6 = false;//�ж϶�ε��С����	
	
	private class ButtonListener implements ActionListener
	{
		private String buttonText;		
		private String compute_string = null;
		
		public ButtonListener(String text)
		{
			this.buttonText = text;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub	
			
			//�������������ּ���С����
			if(isNumber(buttonText.charAt(0)))
			{
				flag2 = true;
				flag3 = true;
	
				if(flag5)
				{
					if(label.getText().charAt(label.getText().length() - 1) == '.')
						label_string = "0";
					else 
						label_string = "";
					flag5 = false;
				}
				
				if(textField.getText().equals(""))
				{
					if(flag6 && buttonText.equals("."))
					{	
					}
					else 
					{
						if(flag6 && buttonText.equals("."))
						{}
						else 
						{
							if(label.getText().equals("0") && buttonText.equals("."))
							{
								flag6 = true;
								System.out.println("**");
								label_string = label.getText() + buttonText;
							}
							else if(label.getText().equals("0") && buttonText.equals("0"))
							{
								label_string = "0";
								System.out.println("##");
							}
							else
							{
								if(buttonText.equals("."))
									flag6 = true;
								if(label.getText().equals("0"))
								{
									label_string = buttonText;
									System.out.print("KKK");
								}
								else
								{
									label_string += buttonText;
									if(label_string.length() > 16)
										return;
								}
							}
							label.setText(label_string);
						}
					}
				}
				else
				{
					if(flag)//��һ�ε��
					{	
						if(buttonText.equals("."))
						{
							label_string = "0" + buttonText;
							flag6 = true;
						}
						else
						{
							label_string = buttonText;				
						}
						label.setText(label_string);
						flag = false;
					}
					else//�ٴε��
					{
						if(flag6 && buttonText.equals("."))
						{}
						else
						{
							label_string += buttonText;
							label.setText(label_string);
						}
					}					
				}
			}
			
			//�ڵ�����ŵ�ʱ�򣬽�flag��Ϊtrue
			if(isOperator(buttonText.charAt(0)) && !buttonText.equals("+-") && !buttonText.equals("/x"))
			{
				flag = true;
				flag3 = true;
				flag5 = false;
				flag6 = false;
				if(!flag2)
				{
					textfield_string = replaceEndOfChar(textfield_string, buttonText.charAt(0));
					textField.setText(textfield_string);					
				}
				else
				{	
					flag2 = false;
					if(textField.getText().equals(""))
					{
						textfield_string = label.getText() + buttonText;
						textField.setText(textfield_string);
					}
					else
					{
						//System.out.println(label_string + "||");
//						if(label.getText().charAt(0) == '-')
//						{
						//System.out.println(compute_string + "^" );
						textfield_string = textField.getText() + label.getText() + buttonText;
						System.out.println(textfield_string + "~~~");
						if(flag4)
						{
							label_string = label.getText().substring(1, label.getText().length());
							compute_string = textField.getText() + label_string;
							System.out.println(compute_string + "1~~~");
							label.setText("-" + this.compute(compute_string));
						}
						else
						{
							label_string = label.getText();
							compute_string = textField.getText() + label_string;
							//System.out.println(compute_string + "2~~~");
							try 
							{
								label.setText(this.compute(compute_string));
							} catch (Exception e2) 
							{
								// TODO: handle exception
								label.setText("������Χ");
								//JOptionPane.showMessageDialog(null, "������Χ");
							}							
						}
						//textfield_string = compute_string + buttonText;
						textField.setText(textfield_string);
					}
				}
			}
			
			
			if(isEqualsOperator(buttonText))
			{
				flag5 = true;
				flag6 = false;
				String string2 = null;
				if(textField.getText().equals("") && isNumber(label.getText()))
				{
					if(string != null)
					{
						//���label.setText
						string2 = new String(label.getText() + string);					
						label.setText(this.compute(string2));
						label_string = "";
						System.out.println("^^");
					}
				}
				else 
				{				
					if(flag3)
					{
						String temp = textField.getText().substring(textField.getText().length() - 1, textField.getText().length());
						
						
						if(flag4)
						{
							label_string=temp+label.getText().substring(1,label.getText().length());
							System.out.println(label_string + "&&&");
							
						}
						else
						{
							string = new String(temp + label.getText());
						}
						//System.out.println(string);
						compute_string = textField.getText() + label.getText();
						try 
						{
							if(flag4)
							{
								
								compute_string = textField.getText() + label.getText().substring(1,label.getText().length());
								label.setText("-"+ this.compute(compute_string));
							}
							else {
								label.setText(this.compute(compute_string));
							}
						} catch (Exception e2) {
							// TODO: handle exception
							label.setText("������Χ");
							//JOptionPane.showMessageDialog(null, "������Χ");
						}
						
						textField.setText("");
						//System.out.println(label.getText() + string);
						flag3 = false;
					}
					else
					{
						//���label.setText
						string2 = new String(label.getText() + string);	
						try
						{
							label.setText(this.compute(string2));
						} catch (Exception e2) {
							// TODO: handle exception
							label.setText("������Χ");
							//JOptionPane.showMessageDialog(null, "������Χ");
						}
						
						label_string = "";
					}
				}
			}
			
			if(buttonText.equals("C"))
			{
				label.setText("0");
				textField.setText("");
				textfield_string = "";
				label_string = "";
				flag6 = false;
			}
			
			if(buttonText.equals("CE"))
			{
				flag6 = false;
				label.setText("0");
				label_string = "";
			}
			
			if(buttonText.equals("<-"))
			{
				label_string = label_string.substring(0, label_string.length() - 1);
				if(label_string.equals(""))
					label.setText("0");
				else
					label.setText(label_string);
			}
			
			if(buttonText.equals("+-"))
			{
				//flag2 = true;
				System.out.println(label.getText() + "&&&");
				if(label.getText().charAt(0) == '-')
				{
					label.setText(label.getText().substring(1, label.getText().length()));
					label_string = label.getText();
				}
				else
				{
					label.setText('-' + label.getText());
					//System.out.println(textField.getText().charAt(textField.getText().length() - 1) + "!!!**");
                    if(textField.getText().equals(""))
                        label_string = label.getText();
                    else
                    {
					    if(textField.getText().charAt(textField.getText().length() - 1) == '*' ||
							textField.getText().charAt(textField.getText().length() - 1) == '/')
					    {
						    flag4 = true;
						    label_string = label.getText().substring(1, label.getText().length() - 1);
					    }
					    else 
					    {
					    	label_string = label.getText();
					    }
                    }					
				}				
			}
			
			if(buttonText.equals("/x"))
			{
				flag5 = true;
				try {
					textfield_string = textField.getText() + "1/" + label.getText();
					textField.setText("");
					label.setText(this.compute(textfield_string));
					//label_string = label.getText();					
				} catch (Exception e2)
				{
					// TODO: handle exception
					label.setText("������Χ");
					//JOptionPane.showMessageDialog(null, "������Χ");
				}				
			}
			
			if(buttonText.equals("%"))
			{
				flag5 = true;
				try
				{
					textfield_string = textField.getText() + label.getText() + "/100";
					textField.setText("");
					label.setText(this.compute(textfield_string));
				} 
				catch (Exception e2)
				{
					label.setText("������Χ");
					//JOptionPane.showMessageDialog(null, "������Χ");
				}				
			}
			
			if(buttonText.equals("~"))
			{
				flag5 = true;
				try 
				{
					if(label.getText().charAt(0) == '-')
					{
						label.setText("��ƽ������Ϊ����");
						//JOptionPane.showMessageDialog(null, "��ƽ������Ϊ����");
					}
					else
					{
						textfield_string = textField.getText() + label.getText() + "~";
						textField.setText("");
						label.setText(this.compute(textfield_string));
					}
				} catch (Exception e2)
				{
					// TODO: handle exception
					label.setText("������Χ");
					//JOptionPane.showMessageDialog(null, "������Χ");
				}
			}
			
			if(buttonText.equals("MS"))
			{
				save_string = label.getText();
				flag5 = true;
				label_1.setText("M");
			}
			
			if(buttonText.equals("MR"))
			{
				label.setText(save_string);
				flag2 = true;
			}
			
			if(buttonText.equals("M+"))
			{
				
				save_string = this.compute(save_string + "+" + label.getText());
				flag5 = true;
			}
			
			if(buttonText.equals("M-"))
			{
				save_string = this.compute(save_string + "-" + label.getText());
				flag5 = true;
			}
			
			if(buttonText.equals("MC"))
			{
				save_string = "";
				label_1.setText("");
			}
		}
		
		//�ж�һ�ַ�Ϊ����
		public boolean isNumber(char ch)
		{
			if((ch >= '0' && ch <= '9') || ch == '.')
				return true;
			return false;
		}
		
		//�ж�һ�ַ���Ϊ�����ַ���
		public boolean isNumber(String str)
		{
			char[] ch = str.toCharArray();
			for(int i = 0; i < ch.length; i++)
			{
				if(!isNumber(ch[i]))
					return false;
			}
			return true;
		}
		
		//�ж�һ�ַ���Ϊ�������ַ���
		public boolean isOperator(String str)
		{
			char[] ch = str.toCharArray();
			for(int i = 0; i < ch.length; i++)
			{
				if(!isOperator(ch[i]))
					return false;
			}
			return true;
		}
		
		//�ж�һ�ַ��Ƿ��ǲ�����
		public boolean isOperator(char ch)
		{
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
				return true;
			return false;
		}
		
		//�ж��ַ���Ϊ���֣������һ���ַ�Ϊ������
		public boolean isNumberEndofChar(String str)
		{
			char[] ch = str.toCharArray();
			int i = 0;
			for(i = 0; i < ch.length - 1; i++)
			{
				if(!isNumber(ch[i]))
					return false;
			}
			if(isOperator(ch[i]))
					return true;
			else return false;
		}
		
		//�õ���׺���ʽ����Ҫ����ת���ı��ʽ
		public String compute(String str)
		{
			char[] exp = new char[100];
			char[] ch = str.toCharArray();
			
			TranslateExpress tExpress = new TranslateExpress();
			tExpress.translateExpress(ch, exp);
			if(!tExpress.translateExpress(ch, exp))
				return "����Ƿ�";
			
			ComputeExpress cExpress = new ComputeExpress();
			String temp = cExpress.computeExpress(exp).toString();
			
			int len = temp.length() - temp.indexOf('.');
			if(len > 5)
				temp = temp.substring(0, temp.indexOf('.') + 5);			
			return temp;
		}
		
		//�滻���һ���ַ�
		public String replaceEndOfChar(String str, char ch)
		{
			char[] chArr = str.toCharArray();
			chArr[str.length() - 1] = ch;
			return new String(chArr);
			
		}
		
		//�ж��Ƿ��ǵ��ڷ���
		public boolean isEqualsOperator(String str)
		{
			if(str.equals("="))
				return true;
			else return false;
		}
		
		public boolean isContainPoint(String str)
		{
			char[] ch = str.toCharArray();
			for(int i = 0; i < ch.length; i++)
			{
				if(ch[i] == '.')
					return true;
			}
			return false;
		}
	}
	
	private class TextAreaListener implements DocumentListener
	{
		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub	
		}
	}
}
