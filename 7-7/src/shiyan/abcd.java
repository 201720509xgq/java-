package shiyan;
import java.util.Random;
public class abcd {
		Random random=new Random();
		public int a=random.nextInt(101);//���������number1
		public int b=random.nextInt(101);//���������number2
		public int x=random.nextInt(101);//��������������Ƽӷ��ͼ��������ɸ���
	public String build()
	{
		if(x<=50&&(a+b)<=100) 
		{
		return a+"+"+b+"=";
		}
		else if(x>50&&(a-b)>=0)
		{
			return a+"-"+b+"=";
		}
		return null;
	}
	public int answer() 
	{
		if(x<=50)
		return (a+b);
		else
			return(a-b);
		
	}
}

