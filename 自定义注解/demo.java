package com.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;



//使用反射读取注解信息，模拟处理注解信息的流程
public class demo {
        public static void main(String[] args) {
                
        
                try {
                        Class clazz=Class.forName("com.Annotation.Student");
                        Annotation[] annotations=clazz.getAnnotations();
                        for(Annotation a:annotations) {
                                System.out.println(a);
                        }
               
                zckTable zt=(zckTable)clazz.getAnnotation(zckTable.class);
                System.out.println(zt.value());
                
                //获得类的属性的注解
                
                Field f=clazz.getDeclaredField("studentName");
                zckFiled zckfiled=f.getAnnotation(zckFiled.class);
                System.out.println(zckfiled.columnName()+"--"+zckfiled.length());
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
