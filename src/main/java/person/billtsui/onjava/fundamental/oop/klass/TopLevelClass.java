/**
 * @author         Bill Tsui
 * @date           Nov 20 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.klass;


public class TopLevelClass {
    void accessMembers(OuterClass outer) {
        IO.println(outer.outerField);
        IO.println(OuterClass.staticOuterField);
    }
}
