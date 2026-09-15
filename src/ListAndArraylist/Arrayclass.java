package ListAndArraylist;
import java.util.Arrays;
public class Arrayclass
{
    public static void main(String[] args)
    {
      int []arr={2,9,3,8,5};
      Arrays.sort(arr);
      for (int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
}
