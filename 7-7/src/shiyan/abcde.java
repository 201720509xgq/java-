package shiyan;

public class abcde {
	public static int y;//����������ʽ������
	CreatMath[] CreatMath=new CreatMath[y];//��������������洢��ʽ��Ϣ
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
		CreatMath[i]=null;//�ͷŶ���ռ�ö��ڴ�
		if(count%5==0)
			System.out.println();
	}
}
	public 	CreatMath[] kk() {
		return 	CreatMath;
	}
}
