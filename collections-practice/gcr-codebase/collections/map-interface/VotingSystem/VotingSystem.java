package VotingSystem;
import java.util.*;
public class VotingSystem {
	private Map<String, Integer> votesMap = new HashMap<>();
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();

    
    public void vote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

       
        orderedVotes.putIfAbsent(candidate, votesMap.get(candidate));
    }

   
    public Map<String, Integer> getRawVotes() {
        return votesMap;
    }

    
    public Map<String, Integer> getVoteOrder() {
        
        Map<String, Integer> updated = new LinkedHashMap<>();
        for (String c : orderedVotes.keySet()) {
            updated.put(c, votesMap.get(c));
        }
        return updated;
    }

    
    public Map<String, Integer> getSortedResults() {
        return new TreeMap<>(votesMap);
    }
}
