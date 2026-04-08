package Oops_Java;

public class Marks {
    public static class StudentData{
        String name;
        int roll;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }

    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 95;
        s1.marks[2] = 100;
        s1.marks[3] = 45;
    }
}
