import java.util.*;
public class hw_week2 
{
    public static void main(String[] args)
    {
        TreeSet <Integer> arr = new TreeSet<>();
        TreeSet <Integer> arr2 = new TreeSet<>();
        Random rand = new Random();
        Random rand2 = new Random();
        
        for(int i=1;i<=10;i++)
        {
            int bound = rand2.nextInt(100)+1;
            int randnum = rand.nextInt(bound);
            
            for(;;)
            {
                if(arr.contains(randnum))
                    randnum = rand.nextInt(bound);
                else
                    break;
            }
            arr.add(randnum);
            if(randnum>=30 && randnum<=70)
                arr2.add(randnum);
            System.out.println("第"+i+"個號碼:"+randnum);
        }
        System.out.println("物件內元素個數為:"+arr.size());
        System.out.println("物件內元素的內容"+arr);
        System.out.println("第一個元素內容為:"+arr.first());
        System.out.println("最後一個元素內容為:"+arr.last());
        System.out.println("內容介於30~˙70者:"+arr2);
    }    
}
