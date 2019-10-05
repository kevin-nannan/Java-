package com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.METHOD)
public @interface MyAnnotation01 {
        String studentName() default ""; //使用注解时要加studentname 除非default 
                                          //默认值为-1 表示不存在
        String[] schools() default {"1","2"};
}
