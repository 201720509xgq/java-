package shiyan;
import java.util.Random;
public class abcd {
		Random random=new Random();
		public int a=random.nextInt(101);//生成随机数number1
		public int b=random.nextInt(101);//生成随机数number2
		public int x=random.nextInt(101);//生成随机数来控制加法和减法的生成概率
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

