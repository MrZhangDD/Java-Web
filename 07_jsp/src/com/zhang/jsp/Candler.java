package com.zhang.jsp;

import java.util.Calendar;

public class Candler {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.get(Calendar.MONTH));
    }
}
