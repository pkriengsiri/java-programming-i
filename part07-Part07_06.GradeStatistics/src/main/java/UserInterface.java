import java.util.Scanner;

/**
 *
 * @author Pete
 */
public class UserInterface {
    private Scanner scanner;
    private GradeBook grades;
    
    public UserInterface(GradeBook grades, Scanner scanner) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }
            
            grades.addGrade(input);
            
        }
        grades.averageAll();
        grades.averagePassing();
        grades.passPercentage();
        grades.gradeDistribution();
    }
}
