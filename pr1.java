// The following code should print X is greater than 0.
// However, the code has errors. Fix the code so that it compiles
// and runs correctly.
import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0){
            System.out.println("the given number is grater than 0");
        }else if(num==0) {
            System.out.println("the given number is o");
        }if(num<0){
            System.out.println("the given number is less than o");
        }
    }
}
