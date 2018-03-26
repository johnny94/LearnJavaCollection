package com.learnjavacollection.map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Johnny on 2018/3/25.
 */
public class MapMethod {
    public void practice() {
        Map<String, LocalDate> cal = new HashMap<>();
        cal.put("Party", LocalDate.of(2018, Month.MARCH, 25));
        cal.put("ChristmasParty", LocalDate.of(2018, Month.DECEMBER, 25));
        cal.put("BirthdayParty", LocalDate.of(2018, Month.NOVEMBER, 22));
        System.out.println(cal.size());

        cal.forEach((key, value) -> System.out.printf("On %TD you have %s\n", value, key));

        // If the key exists in this map and null is returned, this key-valye entry will be deleted.
        cal.compute("Party", (key, value) -> null);
        
        System.out.println("--------------------------------");
        System.out.println(cal.size());
        cal.forEach((key, value) -> System.out.printf("On %TD you have %s\n", value, key));
    }
}
