package InsurancePolicyManagementSystem;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolicyManager manager = new PolicyManager();

       
        manager.addPolicy(new Policy("P1", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P2", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P3", "Alice", LocalDate.now().minusDays(5)));

        System.out.println("=== Get Policy by Number ===");
        System.out.println(manager.getPolicy("P1"));

        System.out.println("\n=== Policies Expiring in Next 30 Days ===");
        System.out.println(manager.getPoliciesExpiringIn30Days());

        System.out.println("\n=== Policies for Alice ===");
        System.out.println(manager.getPoliciesByHolder("Alice"));

        System.out.println("\n=== Removing Expired Policies ===");
        manager.removeExpiredPolicies();

        System.out.println("\n=== Policies Expiring in Next 30 Days After Removal ===");
        System.out.println(manager.getPoliciesExpiringIn30Days());

        System.out.println("\n=== All Policies (Insertion Order) ===");
        manager.printAllInsertionOrder();
	}

}
