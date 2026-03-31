package ScenarioBased;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

       
        String[] tasks = parseInvoice(input);

       
        System.out.println("Invoice Details:");
        for (String task : tasks) {
            System.out.println(task.trim());
        }

        
        int totalAmount = getTotalAmount(tasks);

        System.out.println("\nTotal Invoice Amount: " + totalAmount + " INR");
	}
	public static String[] parseInvoice(String input) {
       
        return input.split(",");
    }

    
    public static int getTotalAmount(String[] tasks) {
        int total = 0;

        for (String task : tasks) {
            
            String[] parts = task.split("-");

            if (parts.length == 2) {
                String amountPart = parts[1].trim(); 
                String amountStr = amountPart.split(" ")[0]; 
                int amount = Integer.parseInt(amountStr);
                total += amount;
            }
        }
        return total;
    }
}
