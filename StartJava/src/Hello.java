import java.util.*;
public class Hello {
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
        int val = 35;
        for(int y = 0; y<10;y++)
        {
            x.put(y, val);
            val++;
        }
        for(int i:x.keySet())
        {
            System.out.println("key i is: " + i + " value y is: " + x.get(i));
        }
    }
}
