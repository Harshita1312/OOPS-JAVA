/* continue lab 6 */

//import general.*;
import marketing.*;
import java.util.Scanner;

public class LAB6_1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);

        System.out.print("Enter the employee id: ");
        int empid = in.nextInt();
        System.out.print("Enter the employee name: ");
        String ename = inn.nextLine();

        System.out.print("Enter the basic salary: ");
        int basic = in.nextInt();

        Sales obj = new Sales(empid,ename);
        double totalEarning = obj.earnings(basic);
        double travelAllowance = obj.travelAllowance(totalEarning);

        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarning);
        System.out.println("The travel allowance is " + travelAllowance);


    }
}
