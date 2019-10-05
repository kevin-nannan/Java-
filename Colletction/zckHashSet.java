package com.set;

import java.util.HashMap;

public class zckHashSet {
        HashMap map;
        private static final Object PRESENT=new Object();
        public zckHashSet() {
                map=new HashMap();
        }
        public int size() {
                return map.size();
        }
        public void add(Object o) {
                map.put(o,PRESENT);
        }
        @Override
        public String toString() {
                StringBuilder sb=new StringBuilder();
                for(Object key:map.keySet()) {
                        sb.append(key+",");
                }
                return sb.toString();
        }
        public static void main(String[] args) {
                zckHashSet set=new zckHashSet();
                set.add("aaa");
                set.add("bbb");
                set.add("ccc");
                System.out.println(set);
        }
}
