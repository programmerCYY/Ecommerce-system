package com.example.ecommerce.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class WeixinGetForToken {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeixinGetForToken.class);
    public static String GET(String url){
        String result = "";
        BufferedReader in  =null;
        InputStream is = null;
        InputStreamReader isr = null;
        try{
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.connect();
            Map<String, List<String>> map = conn.getHeaderFields();
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            in = new BufferedReader(isr);
            String line;
            while ((line = in.readLine())!=null){
                result += line;
            }
        }catch (Exception e)
        {
            LOGGER.debug("from wechat request error:{}",e.getMessage());
        }finally {
            try {


                if (in != null) in.close();
                if (is != null) is.close();
                if (isr != null) isr.close();
            }catch (Exception e1)
            {
                LOGGER.debug("Stream error close:{}",e1.getMessage());
            }
        }
        return result;
    }
}
