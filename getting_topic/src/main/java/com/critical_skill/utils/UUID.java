package com.critical_skill.utils;

public class UUID {
    public static String getUUID(){
        return java.util.UUID.randomUUID().toString().replaceAll("-","");
    }
}
