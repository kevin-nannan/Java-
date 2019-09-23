package com.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestArrayList {
        public static void main(String[] args) {
                test3();
        }
        public static void test1(){
                Collection<String> c=new ArrayList<String>();
                c.add("高老二");
                String a="213";
                c.add(a);
                c.add("高老大");
                System.out.println(c.toString());
                c.remove(a);
                System.out.println(c);
                System.out.println(a); //remove只是移除 不是删除
                
                Object[] objs =c.toArray();
                System.out.println(objs);
                
                c.clear();
                System.out.println(c);
                
               
        }
        
        public static void test2() {
                List<String> list1=new ArrayList<String>();
                list1.add("aa");
                list1.add("bb");
                list1.add("cc");
                
                List<String> list2=new ArrayList<String>();
                list2.add("aa");
                list2.add("ee");
                
                list1.replaceAll(t->t+1);
                System.out.println(list1);
        }
        
        public static void test3() {
                List<String> list1=new ArrayList<String>();
                list1.add("aa");
                list1.add("bb");
                list1.add("cc");
                
                System.out.println(list1.get(1));
                
                list1.add(1, "hh");
                System.out.println(list1);
                list1.set(2, "hh");
                System.out.println(list1);
                list1.remove(1); //移除不是删除
                System.out.println(list1);
        }
}
