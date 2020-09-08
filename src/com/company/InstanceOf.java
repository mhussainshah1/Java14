package com.company;

public class InstanceOf {

    public static void main(String[] args) {
        Object obj = "jdk11";
        if (obj instanceof String) {
            String s = (String) obj;
            if ("jdk11".equalsIgnoreCase(s)) {
                System.out.println("It is string");
            } else {
                System.out.println("not a String");
            }
        }

        obj = "jdk14";
        if (obj instanceof String s) {
            if ("jdk14".equalsIgnoreCase(s)) {
                System.out.println("It is string");
            } else {
                System.out.println("not a String");
            }
        }

    }
}