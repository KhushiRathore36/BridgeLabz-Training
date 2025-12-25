package Methods;

public class Employee {
	public static void main(String[] args) {

	        int employees = 10;

	        int[][] employeeData = employeeData(employees);
	        double[][] salaryData = bonusAndNewSalary(employeeData);

	        display(employeeData, salaryData);
	}

	public static int[][] employeeData(int employees) {

        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; 
            data[i][1] = (int) (Math.random() * 10) + 1;      
        }

        return data;
    }

    
    public static double[][] bonusAndNewSalary(int[][] data) {

        double[][] result = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    
    public static void display(int[][] empData, double[][] salaryData) {

        double oldSalary = 0;
        double bonus = 0;
        double newSalary = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Emp  OldSalary  Years  Bonus      NewSalary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < empData.length; i++) {
            System.out.printf("%3d  %9d  %5d  %9.2f  %10.2f%n",
                    (i + 1),
                    empData[i][0],
                    empData[i][1],
                    salaryData[i][1],
                    salaryData[i][2]);

            oldSalary += salaryData[i][0];
            bonus += salaryData[i][1];
            newSalary += salaryData[i][2];
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL %9.2f        %9.2f  %10.2f%n",
                oldSalary, bonus, newSalary);
        System.out.println("---------------------------------------------------------------");
    }

    
   

}
