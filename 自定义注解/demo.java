package com.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;



//ʹ�÷����ȡע����Ϣ��ģ�⴦��ע����Ϣ������
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
                
                //���������Ե�ע��
                
                Field f=clazz.getDeclaredField("studentName");
                zckFiled zckfiled=f.getAnnotation(zckFiled.class);
                System.out.println(zckfiled.columnName()+"--"+zckfiled.length());
                } catch (ClassNotFoundException e) {
                        // TODO �Զ����ɵ� catch ��
                        e.printStackTrace();
                } catch (NoSuchFieldException e) {
                        // TODO �Զ����ɵ� catch ��
                        e.printStackTrace();
                } catch (SecurityException e) {
                        // TODO �Զ����ɵ� catch ��
                        e.printStackTrace();
                }
}
}
