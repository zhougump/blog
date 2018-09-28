package com.hzz.project.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CustomDataConverter implements Converter<String,Date> {

    @Override
    public Date convert(String source) {

        //实现将日期串转成日期类型yyyy-MM-dd HH:mm:ss

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //如果参数绑定失败返回null
        return null;
    }

}