package project1;

public class Box2 
{
	int l,b,h;
	void vol()
	{
		System.out.println(l*b*h);
	}
	double area()
	{
		return 2*(l*b+b*h+h*l);
	}
}
