import java.util.Scanner;
import java.util.*;
public class Question5
{
  public static void main(String[] args)
  {
    List<Integer> numberList = new ArrayList<Integer>();
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    int maxCount = 0;
    int ans = 0;
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for (int i = 0; i<num; i++){
      int number = in.nextInt();
      numberList.add(number);
    }
    for (int u = 0; u<numberList.size(); u++){
      int count = 0;
      int store = (numberList.get(u));
      for (int j = 0; j<numberList.size(); j++){
        if (store ==  (numberList.get(j))){
            count ++;
        if (count > maxCount) {
            maxCount = count;
            ans = store;
        }
      }
    }
  }
  System.out.println(ans);
}
}
