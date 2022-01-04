package project1;

public class BoxDemo2 
{
 public static void main(String args[])
 {
	 Box2 ob3= new Box2();
	 double A;
	 
	 ob3.l=4;
	 ob3.b=5;
	 ob3.h=6;
	 ob3.vol(); 
	A= ob3.area();
	System.out.println(A);
 }
}
