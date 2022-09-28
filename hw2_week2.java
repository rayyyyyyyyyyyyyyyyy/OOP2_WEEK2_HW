import java.util.*;
public class hw2_week2 
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> month = new HashMap<Integer,String>();
        month.put(1,"January");
        month.put(2,"Feburary");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"September");
        month.put(10,"November");
        month.put(11,"October");
        month.put(12,"December");

        
        for(;;)
        {
            System.out.println("請輸入1~12?");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if(num>=1 && num<=12)
            {
                System.out.println("第"+num+"月的英文單字為"+month.get(num));
                break;
            }
            else
                System.out.println("範圍錯誤!");
        }
    }    
}
