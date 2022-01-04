package project1;

public class BoxDmo3 
{
 public static void main(String args[]) 
 {
	 Box3 ob = new Box3();
	 double vol;
	 ob.setDim(2, 3, 4);
	 vol = ob.volume();
	 System.out.println(vol);
 }
 
}
