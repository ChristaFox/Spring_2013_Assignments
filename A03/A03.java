public class A03
{
	public static void main( String[] args )
	{
		System.out.println( "Testing class Car: " );
		System.out.println();
		
		Car myPrius = new Car();
		
		myPrius.setMake("Toyota");
		myPrius.setModel("Prius");
		myPrius.setOwner("Bob Smith");
		
		System.out.printf("Make: %s%n",myPrius.getMake());
		System.out.printf("Model: %s%n",myPrius.getModel());
		System.out.printf("Owner: %s%n%n",myPrius.getOwner());
		
		Car myRoadster = new Car();
		
		myRoadster.setMake("Tesla");
		myRoadster.setModel("Roadster");
		myRoadster.setOwner("Lisa Ray");
		
		System.out.printf("Make: %s%n",myRoadster.getMake());
		System.out.printf("Model: %s%n",myRoadster.getModel());
		System.out.printf("Owner: %s%n%n",myRoadster.getOwner());
		
		System.out.printf("New Roadster Owner: %s%n%n%n",myPrius.getOwner());
		
		System.out.printf("Testing class Country: %n%n");
		Country country1 = new Country();
		
		country1.setName("Macau");
		country1.setPopulation(453000);
		country1.setArea(6);
		
		System.out.printf("Name: %s%n",country1.getName());
		System.out.printf("Population: %,d%n",country1.getPopulation());
		System.out.printf("Area: %d%n",country1.getArea());
		System.out.printf("Population Density: %,d%n%n",country1.populationDensity());
		
		Country country2 = new Country();
		country2.setName("Libya");
		country2.setPopulation(5900000);
		country2.setArea(679358);
		
		System.out.printf("Name: %s%n",country2.getName());
		System.out.printf("Population: %,d%n",country2.getPopulation());
		System.out.printf("Area: %,d%n",country2.getArea());
		System.out.printf("Population Density: %,d%n%n",country2.populationDensity());

		
		Country country3 = new Country();
		country3.setName("USA");
		country3.setPopulation(298500000);
		country3.setArea(3539225);

		System.out.printf("Name: %s%n",country3.getName());
		System.out.printf("Population: %,d%n",country3.getPopulation());
		System.out.printf("Area: %,d%n",country3.getArea());
		System.out.printf("Population Density: %,d%n%n",country3.populationDensity());
		
		country3.setPopulation(179323175);
		System.out.printf("1960 Population: %,d%n",country3.getPopulation());
		System.out.printf("1960 Population Density: %,d%n",country3.populationDensity());	
				
	}
}