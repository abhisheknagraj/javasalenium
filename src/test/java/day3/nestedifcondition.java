package day3;

public class nestedifcondition {

    public static void main(String[] args) {

        int marks = 10;
        if (marks < 35) {

             System.out.println("FAIL");
        } else if (marks >= 35 && marks < 50) {
            System.out.println("pass class");
        } else if (marks > 50 && marks < 65) {
            System.out.println("second class");
        } else if (marks > 65 && marks < 85) {
            System.out.println("first class");
        } else if (marks > 85 && marks <= 100) {
            System.out.println("top class");
        } else
            System.out.println("contact administrator");

        }
    }
















