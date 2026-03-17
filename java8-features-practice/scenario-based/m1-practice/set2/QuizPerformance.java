package set2;

import java.util.*;

class Student {

    String name;
    String dept;
    int q1, q2, q3;
    int total;

    Student(String n, String d, int a, int b, int c) {
        name = n;
        dept = d;
        q1 = a;
        q2 = b;
        q3 = c;
        total = a + b + c;
    }
}

public class QuizPerformance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String[] parts = line.split(" ");

            if (parts[0].equals("Record")) {

                String name = parts[1];
                String dept = parts[2];

                int q1 = Integer.parseInt(parts[3]);
                int q2 = Integer.parseInt(parts[4]);
                int q3 = Integer.parseInt(parts[5]);

                list.add(new Student(name, dept, q1, q2, q3));

                System.out.println("Record Added: " + name);
            }

            else if (parts[0].equals("Top")) {

                if (list.size() == 0) {
                    System.out.println("No Records Available");
                    continue;
                }

                String param = parts[1];

                if (param.equals("Q1") || param.equals("Q2") || param.equals("Q3")) {

                    int max = Integer.MIN_VALUE;

                    for (Student s : list) {
                        int score = param.equals("Q1") ? s.q1 :
                                param.equals("Q2") ? s.q2 : s.q3;

                        max = Math.max(max, score);
                    }

                    for (Student s : list) {

                        int score = param.equals("Q1") ? s.q1 :
                                param.equals("Q2") ? s.q2 : s.q3;

                        if (score == max)
                            System.out.println(s.name + " " + score);
                    }
                }

                else {

                    int max = Integer.MIN_VALUE;
                    boolean found = false;

                    for (Student s : list) {

                        if (s.dept.equals(param)) {
                            found = true;
                            max = Math.max(max, s.total);
                        }
                    }

                    if (!found) {
                        System.out.println("Department Not Found");
                        continue;
                    }

                    for (Student s : list) {

                        if (s.dept.equals(param) && s.total == max)
                            System.out.println(s.name + " " + s.total);
                    }
                }
            }
        }
    }
}
