package org.example;

import java.nio.charset.Charset;
import java.util.Locale;

public class toDel {
   public static void main(String[] args) {
       System.out.println(Locale.getISOCountries().length);
       for (int i = 0; i < Locale.getISOCountries().length; i++) {
           System.out.println(Locale.getISOCountries()[i]);
       }
      Charset platformEncoding = Charset. defaultCharset ( ) ;
       System.out.println(platformEncoding);

   } }
