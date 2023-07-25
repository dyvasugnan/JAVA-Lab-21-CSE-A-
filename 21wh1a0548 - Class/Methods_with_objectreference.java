class Sample
{
int x,y;
int a,b;
void setdata1(int x,int y)
{
	this.x=x;
	this.y=y;
	
}
void setdata2(int x,int y)
{
	a=x;
	b=y;
}

boolean compare(Sample o)
{
	if(x==o.x&&y==o.y)
	{
		return true;
	}
	else
	{
		return false;
	}
		
	
}
public static void main(String args[])
{
	Sample s1=new sam();
	s1.setdata1(10,20);
	Sample s2=new sam();
	s2.setdata2(10,20);
	if(s1.compare(s2))
	{
		System.out.print("same");
	}
	else
	{
		System.out.print("not");
	}
	
	
	
}
}