import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Class1
{
	public void GetTwiceNumbers( ArrayList<Integer> arrayListA, ArrayList<Integer> arrayListB )
    {
		// Let's write your code here !!
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        HashSet<Integer> count2ElementsSet = new HashSet<Integer>();
		for(int key : arrayListA)
        {
            int currentCount = countMap.get(key) == null ? 1 : countMap.get(key) + 1;
            countMap.put(key, currentCount);
            if(currentCount == 2) count2ElementsSet.add(key);
            else if(currentCount == 3) count2ElementsSet.remove(key);
        }
        for(int key : count2ElementsSet)
        {
            arrayListB.add(key);
        }
    }
}