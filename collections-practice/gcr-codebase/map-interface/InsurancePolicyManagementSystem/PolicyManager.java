package InsurancePolicyManagementSystem;
import java.time.LocalDate;
import java.util.*;
public class PolicyManager {
	private Map<String, Policy> policiesByNumber = new HashMap<>();

   
    private Map<String, Policy> policiesInsertionOrder = new LinkedHashMap<>();

  
    private TreeMap<LocalDate, List<Policy>> policiesByExpiry = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policiesByNumber.put(policy.getPolicyNumber(), policy);
        policiesInsertionOrder.put(policy.getPolicyNumber(), policy);

        
        policiesByExpiry.computeIfAbsent(policy.getExpiryDate(), d -> new ArrayList<>()).add(policy);
    }
    public Policy getPolicy(String policyNumber) {
        return policiesByNumber.get(policyNumber);
    }

    // List policies expiring in next 30 days
    public List<Policy> getPoliciesExpiringIn30Days() {
        LocalDate today = LocalDate.now();
        LocalDate deadline = today.plusDays(30);

        SortedMap<LocalDate, List<Policy>> upcoming =
                policiesByExpiry.subMap(today, true, deadline, true);

        List<Policy> result = new ArrayList<>();
        for (List<Policy> list : upcoming.values()) {
            result.addAll(list);
        }
        return result;
    }

    
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policiesByNumber.values()) {
            if (p.getPolicyHolder().equalsIgnoreCase(holderName)) {
                result.add(p);
            }
        }
        return result;
    }

   
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        SortedMap<LocalDate, List<Policy>> expired =
                policiesByExpiry.headMap(today, false);

        for (List<Policy> list : expired.values()) {
            for (Policy p : list) {
                policiesByNumber.remove(p.getPolicyNumber());
                policiesInsertionOrder.remove(p.getPolicyNumber());
            }
        }

        policiesByExpiry.headMap(today, false).clear();
    }

   
    public void printAllInsertionOrder() {
        System.out.println("Policies (Insertion Order): " + policiesInsertionOrder.values());
    }
}
