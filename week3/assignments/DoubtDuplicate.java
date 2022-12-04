package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DoubtDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String text="ababababa";
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        char[] charArray= text.toCharArray();
        for(char ch : charArray)
        {
            
            map.put(ch, map.getOrDefault(ch,0)+1) ;   
            }
        System.out.println(map);
        Set<Entry<Character,Integer>> entrySet = map.entrySet();
        int maxOccurrence=0;
        char Key=0;
        char key1 = 0;
        for(Entry<Character,Integer>entry: entrySet) {
            
        
            if(entry.getValue()>maxOccurrence)
        {
            key1=entry.getKey();
            maxOccurrence=entry.getValue();
        }
            Key=entry.getKey();
            maxOccurrence=entry.getValue();
        
        }
        System.out.println("no of occurence"+  maxOccurrence);
        System.out.println("character"+ key1);

	}

}
