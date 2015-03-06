package com.github.vladislav719.config;

import com.google.common.primitives.Ints;

/**
 * Created by Владислав on 07.03.2015.
 */
public class Test {

    public static void main(String[] args) {
        String cpu = "Intel 2.3 GHz";

//        int cpu2 = Integer.parseInt(cpu.replaceAll("[\\D]", ""));


//        System.out.println(cpu2);

//        int id = Integer.parseInt(cpu);
        String s = cpu;
        int p1 = s.indexOf("GHz");
        int p2 = s.indexOf(" ");
        String s1 = s.substring(0, p2);
        String s2 = s.substring(p1, s.length());
        System.out.println(s1 + " " + s2);
        double before = Double.parseDouble(s.substring(p2+1, p1));
        before = before + 0.1;
        String after = " " + String.valueOf(before);
        System.out.println(after);
    }


}
