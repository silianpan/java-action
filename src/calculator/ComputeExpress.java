package calculator;

import java.util.Stack;


public class ComputeExpress 
{
	//�Ժ�׺���ʽ���м���
		public Double computeExpress(char Array[])
		{
			System.out.println(Array);
			Stack<Double> s = new Stack<Double>();

			double result;
			int i = 0, j = 0;
			double x1, x2, value;
			boolean flag = true;
			
			//int count = 0;
			//System.out.println(Array.length);
			while(Array[i] != '\0')
			{
				//�������ַ���ת���ɸ�����
				if((Array[i] >= '0' && Array[i] <= '9') || Array[i] == '.')
				{
					if(i == 0)
						flag = false;
					else 
						flag = true;
					
					value = 0;
					
					while(Array[i] != ' ')
					{
						if(Array[i] == '.')
						{
							i++;
							int j1 = -1;
							while(Array[i] != ' ')
							{
								value = (float) (value +  (Array[i] - '0') * Math.pow(10, j1));
								j1--;
								i++;
							}
							break;
						}
						value = 10 * value + (Array[i] - '0');
						i++;
					}
					s.push(value);
					//System.out.println(s.peek());
				}
				else
				{
					if(!flag)
					{
						if(Array[i] == '~')
						{
							x1 = s.pop();
							result = Math.sqrt(x1);	
						}
						else 
						{
							x1 = s.pop();
							result = -x1;
							s.push(result);
						}
						s.push(result);
					}
					else 
					{
						switch(Array[i])
						{
						case '+':
							x1 = s.pop();
							x2 = s.pop();
							result = x1 + x2;
							s.push(result);
							break;
						case '-':
							x1 = s.pop();
							x2 = s.pop();
							result = x2 - x1;
							s.push(result);
							break;
						case '*':
							x1 = s.pop();
							x2 = s.pop();
							System.out.println(x2);
							result = x1 * x2;
							s.push(result);
							break;
						case '/':
							x1 = s.pop();
							x2 = s.pop();
							result = x2 / x1;
							s.push(result);
							break;
						case '~':
							x1 = s.pop();
							result = Math.sqrt(x1);
							s.push(result);
							break;
						}
					}
				}
				i++;
				//count++;
			}
			//System.out.println(count);
			return s.pop();
		}
}
