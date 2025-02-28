//example from https://docs.openrewrite.org/running-recipes/popular-recipe-guides/migrate-to-java-17
package com.amazonaws.samples.appconfig.utils;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathNewCode {
    Boolean bool = Boolean.valueOf(false);
    Byte b = new Byte("1");
    Character c = new Character('c');
    Double d = new Double(1.0);
    Float f = new Float(1.1f);
    Long l = new Long(1);
    Short sh = new Short("12");
    short s3 = 3;
    Short sh3 = Short.valueOf(s3);
    Integer i = Integer.valueOf(1);

    public void divide() {
        BigDecimal bd = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(2);
        bd.divide(bd2, RoundingMode.DOWN);
        bd.divide(bd2, RoundingMode.DOWN);
        bd.divide(bd2, 1, RoundingMode.CEILING);
        bd.divide(bd2, 1, RoundingMode.DOWN);
        bd.setScale(2, RoundingMode.DOWN);
    }

   }