package com.set.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {
        public static void main(String[] args) {
                testList();
                testSet();
                testMap();
        }
        public static void testList() {
                List<String> list=new ArrayList<String>();
                list.add("aa");
                list.add("bb");
                list.add("cc");
                for(Iterator<String> iter=list.iterator();iter.hasNext();) {
                        String temp = iter.next();
                        System.out.println(temp);
                }
        }
        public static void testSet() {
                Set<String> set= new HashSet<>();
                set.add("aaa");
                set.add("bbb");
                set.add("ccc");
                for(Iterator<String> iter=set.iterator();iter.hasNext();) {
                        String temp = iter.next();
                        System.out.println(temp);
                }
        }
        public static void testMap() {
                Map<Integer,String> map=new HashMap<>();
                map.put(1, "aa");
                map.put(2, "bb");
                map.put(3, "cc");
                Set<Entry<Integer,String>> entry=map.entrySet();
                for(Iterator<Entry<Integer,String>> iter=entry.iterator();iter.hasNext();) {
                        Entry<Integer, String> temp = iter.next();
                        System.out.println(temp);
                }
        }
}
