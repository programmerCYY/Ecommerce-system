package com.example.ecommerce.common.utils;

import com.alibaba.druid.util.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

public class TranslateToToken {
    //生成token
    public static String GetGUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    public static Date parseSync8(String dateStr, String pattern) {
        if (StringUtils.isEmpty(pattern)) {

            pattern = DATE_PATTERN;
        }
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern(pattern);

        java.time.LocalDate date = java.time.LocalDate.parse(dateStr, formatter);

        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = date.atStartOfDay(zoneId);

        return Date.from(zdt.toInstant());
    }

    public static String formatSync8(Date date, String pattern) {
        if (StringUtils.isEmpty(pattern)) {

            pattern = DATE_PATTERN;
        }

        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern(pattern);
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime now = date.toInstant().atZone(zoneId).toLocalDateTime();

        return now.format(formatter);

    }


}
