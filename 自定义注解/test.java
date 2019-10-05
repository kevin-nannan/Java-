package com.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class test {
        public static void main(String[] args) {
                try {
                        Class clazz=Class.forName("com.Annotation.Student");
                        Annotation[] annotations=clazz.getAnnotations();
                        for(Annotation  a:annotations) {
                                System.out.println(a);
                        }
                        Annotation a=clazz.getAnnotation(zckTable.class);
                        System.out.println(a);
                        
                        Field f=clazz.getDeclaredField("studentName");
                        zckFiled field=(zckFiled) f.getAnnotation(zckFiled.class);
                        System.out.println(field.columnName());
                } catch (ClassNotFoundException e) {
                        // TODO 自动生成的 catch 块
                        e.printStackTrace();
                } catch (NoSuchFieldException e) {
                        // TODO 自动生成的 catch 块
                        e.printStackTrace();
                } catch (SecurityException e) {
                        // TODO 自动生成的 catch 块
                        e.printStackTrace();
                }
                
        }
}
