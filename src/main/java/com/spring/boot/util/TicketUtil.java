package com.spring.boot.util;

import java.util.UUID;

public class TicketUtil {

    public static String createUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
