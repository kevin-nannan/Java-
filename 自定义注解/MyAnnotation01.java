package com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.METHOD)
public @interface MyAnnotation01 {
        String studentName() default ""; //ʹ��ע��ʱҪ��studentname ����default 
                                          //Ĭ��ֵΪ-1 ��ʾ������
        String[] schools() default {"1","2"};
}
