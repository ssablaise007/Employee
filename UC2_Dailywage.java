package employee;

public class UC2_Dailywage {

	public static void main(String[] args) {
		int its_present =1;
		int wageperhour = 20;
		int empHour = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() *10 ) % 2;
		double totalsalary = wageperhour * empHour;
		if (empcheck == its_present)
		empHour = 8;
		else
		empHour = 0;
		empWage = empHour*wageperhour;
		System.out.println (+empWage);
		//System.out.println (totalsalary);

	}
}