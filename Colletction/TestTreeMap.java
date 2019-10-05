package com.set.map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
        public static void main(String[] args) {
                Map<Integer,String> treemap1=new TreeMap<>();
                treemap1.put(20, "aa");
                treemap1.put(3, "bb");
                treemap1.put(6, "cc");
                for(Integer key:treemap1.keySet()) {
                        System.out.println(key+"---"+treemap1.get(key));
                }
                Map<Emp,String> treemap2=new TreeMap<>();
                treemap2.put(new Emp(100,"张三",5000),"张三是个好小伙");
                treemap2.put(new Emp(200,"李四",6000),"李四是个好小伙");
                treemap2.put(new Emp(300,"赵武",5000),"赵武是个好小伙");
                for(Emp key:treemap2.keySet()) {
                        System.out.println(key+treemap2.get(key));
                }
        }
}
class Emp implements Comparable<Emp>{
        int id;
        String name;
        double salary;
        public Emp(int id, String name, double salary) {
                super();
                this.id = id;
                this.name = name;
                this.salary = salary;
        }
        @Override
        public int compareTo(Emp o) {
                if(this.salary>o.salary) {
                        return 1;
                }else{
                        if(this.salary<o.salary) {
                                return -1;
                        }else if(this.id>o.id) {
                                return 1;
                        }else if(this.id<o.id) {
                                return -1;
                        }
                        return 0;
                }
        
        }
        @Override
        public String toString() {
                return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }
       

}
