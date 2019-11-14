package shiyan;

public class abcde {
	public static int y;//控制生成算式的数量
	CreatMath[] CreatMath=new CreatMath[y];//构造对象数组来存储算式信息
	public void getDate() {
		int count=0;
	for(int i=0;i<y;i++)
	{
		CreatMath[i]=new 	CreatMath();
		if(	CreatMath[i].creat()!=null) 
		{
			count++;
			System.out.printf(CreatMath[i].build()+"    ");
			if(count%5==0)
			System.out.println();
		}
		else
     i--;
	}
	count=0;
	for(int i=0;i<y;i++)
	{
		System.out.printf(CreatMath[i].answer()+"    ");
		count++;
		CreatMath[i]=null;//释放对象占用堆内存
		if(count%5==0)
			System.out.println();
	}
}
	public 	CreatMath[] kk() {
		return 	CreatMath;
	}
}
