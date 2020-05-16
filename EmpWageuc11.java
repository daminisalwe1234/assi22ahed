




public class EmpWage BuilderArray {

                        public static final int IS_PART_TIME = 1;
                        public static final int IS_FULL_TIME = 2;

                        private int numOfCompany = 0;
                        private CompanyEmpWage[] companyEmpWageArray;
                        public EmpWageBuilderArray() {
                                companyEmpWageArray = new CompanyEmpWage[5];
                        }

                        private void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHourPerMonth) {
                                companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour,numOfWorkingDays, maxHourPerMonth);
                                numOfCompany++;
                }
                private void computeEmpWage() {
                        for (int i=0; i<numOfCompany; i++) {
                                companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                                System.out.println(companyEmpArray[i]);
                        }
                }

                private int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
                return totalEmpHrs * companyEmpWage.empRatePerHour;

        }
	public static void main(String[] args) {
                EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
                empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
                empWageBuilder.addCompanyEmpWage("Mahindra", 10, 4, 20);
                empWageBuilder.computerEmpWage();

        }
}




