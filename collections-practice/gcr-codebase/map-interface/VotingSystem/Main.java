package VotingSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingSystem voting = new VotingSystem();

        voting.vote("Alice");
        voting.vote("Bob");
        voting.vote("Charlie");
        voting.vote("Alice");
        voting.vote("Bob");
        voting.vote("Alice");

        System.out.println("=== HashMap: Raw Vote Counts ===");
        System.out.println(voting.getRawVotes());

        System.out.println("\n=== LinkedHashMap: First Vote Order ===");
        System.out.println(voting.getVoteOrder());

        System.out.println("\n=== TreeMap: Sorted Results ===");
        System.out.println(voting.getSortedResults());
	}

}
