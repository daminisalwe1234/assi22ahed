public class EmplWageMultipleCompany {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        
        public static int computeEmpWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHourPerMonth) {
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
                        System.out.println("Day#: " +totalWorkingDays + " Emp Hr: " +empHrs);
                }
                int totalEmpWage = totalEmpHrs * empRatePerHour;
                System.out.println("total Emp Wage for compant: " +company+" is: " +totalEmpWage);
                return totalEmpWage;
        }
        public static void main(String[] args) {
                computeEmpWage("dmart", 20, 2, 10);
		computeEmpWage("mahindra", 10, 4, 20);

        }
}


