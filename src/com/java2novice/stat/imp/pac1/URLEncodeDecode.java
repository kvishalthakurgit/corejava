package com.java2novice.stat.imp.pac1;

import java.io.UnsupportedEncodingException;  
import java.net.URLDecoder;  
import java.net.URLEncoder;  
public class URLEncodeDecode {  
     public static void main(String[] args) {  
          // TODO Auto-generated method stub  
          String url="9W%40gPt%2F5%3FhGW22%2C6";  
          String url2="9W%40gPt%2F5%3FhGW22%2C6";  
          String decodeURL = decode(url);  
          System.out.println("Decoded URL: "+decodeURL);  
          String encodeURL = encode(url2);  
          System.out.println("Encoded URL2: "+encodeURL);  
     }  
     public static String decode(String url)  
     {  
               try {  
                    String prevURL="";  
                    String decodeURL=url;  
                    while(!prevURL.equals(decodeURL))  
                    {  
                         prevURL=decodeURL;  
                         decodeURL=URLDecoder.decode( decodeURL, "UTF-8" );  
                    }  
                    return decodeURL;  
               } catch (UnsupportedEncodingException e) {  
                    return "Issue while decoding" +e.getMessage();  
               }  
     }  
     public static String encode(String url)  
     {  
               try {  
                    String encodeURL=URLEncoder.encode( url, "UTF-8" );  
                    return encodeURL;  
               } catch (UnsupportedEncodingException e) {  
                    return "Issue while encoding" +e.getMessage();  
               }  
     }  
}
