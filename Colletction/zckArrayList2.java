package com.set.mycolletction;

import javax.management.RuntimeErrorException;

//实现get（index）
public class zckArrayList2<E> {
        private Object[] elementDate;
        private int size;
        
        public void remove(E element) {
                //element,将它和所有元素挨个比较 获得第一个为true的 ，返回
                for(int i=0;i<size;i++) {
                        if(element.equals(get(i))) {
                          remove(i);      
                        }     
                }
        }
        public void remove(int index) {
                if(elementDate.length-index-1>0) {
                System.arraycopy(elementDate, index+1, elementDate, index, elementDate.length-index-1);
                elementDate[size-1]=null;
                size--;
                }else {
                        elementDate[size-1]=null;
                        size--;
                }
        }
        public zckArrayList2() {
                elementDate =new Object[10];
                
        }
        public zckArrayList2(int capacity) {
                if(capacity<0) {
                        throw new RuntimeException("容器的容量不能为负数");
                }else if(capacity==0) {
                        elementDate=new Object[10];
                }else {
                elementDate=new Object[capacity];
                }
        }
        public void add(E element) {
                elementDate[size++]=element;
                if(size==elementDate.length) {
                        Object[] newArray=new Object[elementDate.length+(elementDate.length>>1)];
                        System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
                        elementDate=newArray;
                }
        }
        public E get(int index) {
                checkindex(index);
              return (E) elementDate[index];
        }
        @Override
        public String toString() {
                StringBuilder sb=new StringBuilder();
                sb.append("[");
                for(int i=0;i<size;i++) {
                        sb.append(elementDate[i]+",");
                }
                sb.setCharAt(sb.length()-1, ']');
                return sb.toString();
        }
        public void checkindex(int index) {
              //判断索引合不合法[0,size)
                if(index<0||index>size-1) {
                        throw new RuntimeException();
                }
        }
        public void set(E element,int index) {
                checkindex(index);
                elementDate[index]=element;
        }
        public static void main(String[] args) {
                zckArrayList2<String> s1=new zckArrayList2<String>(20);
                for(int i=0;i<40;i++) {
                        s1.add("gao"+i);
                }
                System.out.println(s1.get(12));
               // s1.get(54);
               
                System.out.println(s1);
                zckArrayList2<String> s2=new zckArrayList2<String>(0);
                System.out.println(s2);
        }
        
}
