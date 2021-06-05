
import java.util.ArrayList;

public class GradeBook {

    private ArrayList<Integer> gradesAll;
    private ArrayList<Integer> gradesPassing;
    private ArrayList<Integer> grades5;
    private ArrayList<Integer> grades4;
    private ArrayList<Integer> grades3;
    private ArrayList<Integer> grades2;
    private ArrayList<Integer> grades1;
    private ArrayList<Integer> grades0;

    public GradeBook() {
        this.gradesAll = new ArrayList<>();
        this.gradesPassing = new ArrayList<>();
        this.grades5 = new ArrayList<>();
        this.grades4 = new ArrayList<>();
        this.grades3 = new ArrayList<>();
        this.grades2 = new ArrayList<>();
        this.grades1 = new ArrayList<>();
        this.grades0 = new ArrayList<>();

    }

    public void addGrade(int grade) {
        if (grade > 0 && grade <= 100) {
            this.gradesAll.add(grade);
        }

        if (grade <= 100 && grade >= 50) {
            this.gradesPassing.add(grade);
        }

        if (grade < 50 && grade > 0) {
            this.grades0.add(grade);
        }

        if (grade >= 50 && grade < 60) {
            this.grades1.add(grade);
        }

        if (grade >= 60 && grade < 70) {
            this.grades2.add(grade);
        }

        if (grade >= 70 && grade < 80) {
            this.grades3.add(grade);
        }

        if (grade >= 80 && grade < 90) {
            this.grades4.add(grade);
        }

        if (grade >= 90 && grade < 100) {
            this.grades5.add(grade);
        }

    }

    public void averageAll() {
        double average = (double) sum(this.gradesAll) / gradesAll.size();
        System.out.println("Point average (all): " + average);
    }

    public void averagePassing() {
        if (gradesPassing.isEmpty()) {
            System.out.println("Point average (passing): -");
            return;
        }
        double average = (double) sum(this.gradesPassing) / gradesPassing.size();
        System.out.println("Point average (passing): " + average);
    }

    public void passPercentage() {
        double passPercentage = 100 * (double)this.gradesPassing.size() / this.gradesAll.size();
        System.out.println("Pass percentage: " + passPercentage);
    }

    private static int sum(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public void gradeDistribution() {
        System.out.println("Grade distribution:");

        System.out.println("5: " + this.printStars(this.grades5.size()));
        System.out.println("4: " + this.printStars(this.grades4.size()));
        System.out.println("3: " + this.printStars(this.grades3.size()));
        System.out.println("2: " + this.printStars(this.grades2.size()));
        System.out.println("1: " + this.printStars(this.grades1.size()));
        System.out.println("0: " + this.printStars(this.grades0.size()));

    }

    private String printStars(int number) {
        String stars = "";
        for (int i = 1; i <= number; i++) {
            stars += "*";
        }
        return stars;
    }

}
