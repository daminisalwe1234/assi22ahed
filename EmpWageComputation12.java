
interface IComputeEmpWage{
	public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
}
class CompanyEmpWage{
	piublic final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage=totalEmpWage;
	}
	@Override
	public String toString(){
		return "Total Emp Wage for company: " +company+ " is: " +totalEmpWage;
	}
}
public class EmpWageComputation12 implements IComputeEmpWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        
        private int numOfCompany=0;
        private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
        
        public EmpWageComputation12() {
        		companyEmpWageArrayList = new ArrayList<>();
        }
        public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        	CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
        	companyEmpWageArrayList.add(companyEmpWage);
        }
        public void computeEmpWage(){
        	for(int i=0;i<companyEmpWageArrayList.size();i++){
        		CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
        		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
        		System.out.println(companyEmpWage);
        		
        	}
        }
        
        private int computeEmpWage(CompanyEmpWage companyEmpWage){
        	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        	Random rand = new Random();
            while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) 
            {
                        
                        int empCheck = rand.nextInt(3);
                        totalWorkingDays++;
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
            return totalEmpHrs * companyEmpWage.empRatePerHour;
        }
        public static void main(String[] args) {
        		EmpWageComputationUC11 empWage = new EmpWageComputationUC11();
                empWage.addCompanyEmpWage("dmart", 20, 2, 10);
                empWage.addCompanyEmpWage("mahindra", 10, 4, 20);
                empWage.computeEmpWage();
        }
}
