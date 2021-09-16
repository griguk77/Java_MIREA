package com.company;

public class ClientTest {
    public static void testClient(){
        Client c = new Client("Василий");
        if (c.think().isEmpty()){
            System.out.println("Метод возвращает пустоту");
        }
    }
}
