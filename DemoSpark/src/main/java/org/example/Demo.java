package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*******************************************************************************
 * - Copyright (c)  2020  changSuper.com
 *
 *   @author chr
 * - File Name: org.example.Demo
 * - Description:
 *
 *
 * - Function List:
 *
 *
 * - History:
 * Date         Author          Modification
 * 2020/05/27   chr             Create file
 *******************************************************************************/
public class Demo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(4);
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.forEach(System.out::printf);

        new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });

    }
}
