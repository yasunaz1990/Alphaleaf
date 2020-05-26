package lecture3branching;

public class ConditionalAssignmentDemo {

    public static void main(String[] args) {

        // Assignment
        int num = 10;

        // Conditional Assignment
        // [variable] = (condition)? case_true : case_false;

        double students = 65;
        double roomsWeHave = 0;

        double studentsPerRoom = (roomsWeHave == 0)? 0.0 : students/roomsWeHave;
        System.out.println(studentsPerRoom);

    }
}
