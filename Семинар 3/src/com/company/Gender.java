package com.company;

public enum Gender{
    MALE (1, "Мужчина"),
    FEMALE (2, "Женщина"),
    OTHER (1024, "Другое");
    private final int value;
    private final String strvalue;
    private Gender(int value, String strvalue){
        this.value = value;
        this.strvalue = strvalue;
    }
    int getValue(){
        return this.value;
    }
    String getStrvalue(){
        return this.strvalue;
    }
}