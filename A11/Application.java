/*******************************************************
* Name:Christa Fox
* Assignment: A11
*******************************************************/
public class Application
{
	public static void main(String[] args)
	{
		Point[] pointArray1 = {new Point(0,0), new Point(4,3)};
		
		Path myPath1 = new Path(pointArray1);
		System.out.print("Path1: ");
		myPath1.displayPoints();
		System.out.printf("%nTotal length: %.1f%n%n", myPath1.totalLength());
		
		Point[] pointArray2 = {new Point(0,5), new Point(1,2), new Point(3,9), new Point(8,6)};
		Path myPath2 = new Path(pointArray2);
		System.out.print("Path2: ");
		myPath2.displayPoints();
		System.out.printf("%nTotal length: %.1f%n%n", myPath2.totalLength());
		
		Path myPath3 = new Path(3);
		System.out.print("Path3: ");
		myPath3.displayPoints();
		System.out.printf("%nTotal length: %.1f%n%n", myPath3.totalLength());
		
		//Path myPath4 = new Path(1);
	}
}