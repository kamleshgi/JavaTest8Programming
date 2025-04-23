package com.nic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 
public class HashMapShort 
{
    public static void main(String[] args) 
    {
        //Define one HashMap called idNameMap
         
        Map<String, String> idNameMap = new HashMap<String, String>();
         
        //Insert Id-Name pairs into idNameMap
         
        idNameMap.put("WB0310117", "WB0310117");
        idNameMap.put("WB0310118", "WB0310118");
        idNameMap.put("WB0310120", "WB0310120");
        idNameMap.put("WB0310123", "WB0310123");
        idNameMap.put("WB0310121", "WB0310121");
        idNameMap.put("WB0310119", "WB0310119");
        //Get listOfEntry through entrySet() method
         
        List<Entry<String, String>> listOfEntry = new LinkedList<>(idNameMap.entrySet());
         
        //Sort listOfEntry using Collections.sort() by passing customized Comparator
         
        Collections.sort(listOfEntry, new Comparator<Entry<String, String>>() 
        {
            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) 
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
         
        //Insert all elements of listOfEntry into new LinkedHashMap which maintains insertion order
         
        Map<String, String> sortedIdNameMap = new LinkedHashMap<String, String>();
         
        for (Entry<String, String> entry : listOfEntry) 
        {
            sortedIdNameMap.put(entry.getKey(), entry.getValue());
        }
         
        //Print idNameMap before and after sorting
         
        System.out.println("Before Sorting : ");
         
        System.out.println(idNameMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedIdNameMap);
    }
}