package com.set.map;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
        public static void main(String[] args) {
             test2();   
        }
        static void test1() {
                Map<Integer,String> m1=new HashMap<>();
                m1.put(1,"one");
                m1.put(2, "two");
                for(int i=0;i<10;i++) {
                        m1.put(i+3,"gao+"+i);
                }
                System.out.println(m1);
                System.out.println(m1.isEmpty());
                System.out.println(m1.size());
                System.out.println(m1.containsKey(12));
                System.out.println(m1.containsValue("gao+13"));
                Map<Integer,String> m2=new HashMap<>();
                m2.putAll(m1);
                m2.put(2,"one");
                System.out.println(m2);
        }
        static void test2() { //value为对象
                
                Employee e1=new Employee(1001, "zck", 1234);
                Employee e2=new Employee(1002, "sd", 4321);
                Employee e3=new Employee(1003, "we", 10000);
                Employee e4=new Employee(1001, "ssss", 0);
                Map<Integer,Employee> m1=new HashMap<>();
                m1.put(1001, e1);
                m1.put(1002, e2);
                m1.put(1003, e3);
                m1.put(1001, e4);  //e4会覆盖
                Employee emp=m1.get(1001);
                System.out.println(emp.ename);
                System.out.println(emp.toString());
        }
        static class Employee{
                private int id;
                private String ename;
                private double salary;
                public Employee(int id, String ename, double salary) {
                        super();
                        this.id = id;
                        this.ename = ename;
                        this.salary = salary;
                }
                @Override
                public String toString() {
                        return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
                }
                
                
        }
}
