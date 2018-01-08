public class Volumes
{
	public static double cuboid (double sideA, double sideB, double sideC)
	{
		return sideA * sideB * sideC;
	}
	public static double cuboid (double side)
	{
		return side * side * side;
	}
	public static double ellipsoid (double sideA, double sideB, double sideC)
	{
		return (4 * Math.PI * sideA * sideB * sideC) / 3;
	}

	public static double ellipsoid (double side)
	{
		return (4 * Math.PI * 4 * 4 * 4) / 3;
	}
	public static double cylinder (double radius, double height)
	{
		return Math.PI * radius * radius * height;
	}
	public static double cone (double diameter, double side)
	{
		return (Math.PI * (diameter / 2) * (diameter / 2) * 
		(Math.sqrt(side * side - (diameter / 2) * (diameter / 2)))) / 3;
	}

}