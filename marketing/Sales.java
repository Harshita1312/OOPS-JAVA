
/* continue lab 6.1*/

package marketing;
import general.*;
public class Sales extends employee
{
    public Sales(int empid, String ename)
    {
        super(empid,ename); // Call parent constructor
    }
    public double travelAllowance(double totalEarning)
    {
        return (totalEarning * 0.05);
    }
}