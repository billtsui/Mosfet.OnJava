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

public class FileNameDemo {
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        FileName myHomePage = new FileName(FPATH, '/', '.');
        IO.println("Extension = " + myHomePage.extension());
        IO.println("Filename = " + myHomePage.filename());
        IO.println("Path = " + myHomePage.path());
    }
}
