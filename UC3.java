package employee;

import java.util.Random;

public class UC3 {

	public static void main(String[] args) {
		int empWageperhour = 20;
		 int fulltimehour = 1;
		 int parttimehour = 2;
	 Random rand = new Random();
	 int rand_int1  = rand.nextInt(3);
	 double FullSal = empWageperhour * fulltimehour ;
	 double PartSal = empWageperhour * parttimehour ;
	 
			if (rand_int1 == fulltimehour)
			System.out.println(FullSal);
			else if  (rand_int1 == parttimehour)
			System.out.println (PartSal);
			else
		System.out.println("Employee is absent ");

	}
	
	}