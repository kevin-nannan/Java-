package com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//说明表的属性
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.FIELD)
public @interface zckFiled {
        String columnName();
        String type();
        int length();
}
