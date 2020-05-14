public class computerEmpWageTotalWageuc9 {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHourPerMonth;
	private int totalEmpWage;
        
	public computerEmpWageTotalWageuc9(String company, int empRatePerHour,
					int numOfWorkingDays,int maxHourPerMonth) {
                this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHourPerMonth = maxHoursPerMonth;
	}
	public void computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                while (totalEmpHrs <= maxHourPerMonth &&
                        totalWorkingDays < numOfWorkingDays) {
                        totalWorkingDays++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch (empCheck) {
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                default:
                                        empHrs = 0;
                        }
                        totalEmpHrs += empHrs;
                        System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
                }
                totalEmpWage = totalEmpHrs * empRatePerHour;
   
        }
	
	public String toString() {
		return *Total Emp Wage for Company: * +company+ " is: " + totalEmpWage;
	}
        public static void main(String[] args) {
		computerEmpWageTotalWageuc9 dMart = new EmpWageBuilderObject("Dmart", 20, 2, 10);
                computerEmpWageTotalWageuc9 mahindra = new EmpWageBuilderObject ("Mahindra", 10, 4, 20);
		dmart.computeEmpWage();
		System.out.println(dMart);
		mahindra.ComputeEmpWage();
		System.out.println(mahindra);

        }
}



