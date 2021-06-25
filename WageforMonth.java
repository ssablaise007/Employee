package employee;

public class WageforMonth {
		public static void main(String[] args) {
			int wageperhour = 20;
			int emphour = 8;
			int workingdaysformonth = 20;
			double wageperday = wageperhour*emphour;
			double wagepermonth = workingdaysformonth*wageperday;
			System.out.println(wagepermonth);
		}

	}
