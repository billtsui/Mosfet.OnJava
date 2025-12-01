/**
 * @author         Bill Tsui
 * @date           Dec 01 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.strings;

public class RegionMatchesDemo {
    public static void main(String[] args) {
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";

        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();

        boolean foundIt = false;
        
        for (int i = 0; i <= (searchMeLength - findMeLength); i++) {
            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
                foundIt = true;
                IO.println(searchMe.substring(i, i + findMeLength));
                break;
            }   
        }

        if(!foundIt) {
            IO.println("No match found");
        }
    }
}
