package ExamProctor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamProctor ep = new ExamProctor();
        ep.loadCorrectAnswers();

        ep.visitQuestion(1);
        ep.answerQuestion(1, "B");

        ep.visitQuestion(4);
        ep.answerQuestion(4, "C");

        ep.visitQuestion(2);
        ep.answerQuestion(2, "A");

        ep.visitQuestion(3);
        ep.answerQuestion(3, "D");

        ep.submit();
	}

}
