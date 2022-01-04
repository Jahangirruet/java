package project1;

public class BoxDemo 
{
	public static void main(String args[]) 
	{
		Box ob1 = new Box();
		Box ob2 = new Box();
		double vol;
		
		ob1.weigth=10;
		ob1.depth=20;
		ob1.heigth=30;
		vol=ob1.depth*ob1.heigth*ob1.weigth;
		System.out.println("volume of first box is " +vol);
		
		ob2.weigth=1;
		ob2.depth=2;
		ob2.heigth=3;
		vol=ob2.depth*ob2.heigth*ob2.weigth;
		System.out.println("Volume of second box is " +vol);
		
		
	}
}
