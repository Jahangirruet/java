package project1;

public class Box3
{
	double len,base,high;
	
	double volume() 
	{
		return len*base*high;
	}
	
	void setDim(int l,int b,int h)
	{
		len=l;
		base=b;
		high=h;
	}
}
