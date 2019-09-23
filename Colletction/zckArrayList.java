package com.set.mycolletction;
//自定义实现一个Arraylist
public class zckArrayList<E> {
        private Object[] elementDate;
        private int size;
        
       
        public zckArrayList() {
                elementDate =new Object[10];
                
        }
        public zckArrayList(int capacity) {
                elementDate=new Object[capacity];
        }
        public void add(E element) {
                elementDate[size++]=element;
                if(size==elementDate.length) {
                        Object[] newArray=new Object[elementDate.length+(elementDate.length>>1)];
                        System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
                        elementDate=newArray;
                }
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
        public static void main(String[] args) {
                zckArrayList<String> s1=new zckArrayList<String>(20);
                for(int i=0;i<40;i++) {
                        s1.add("gao"+i);
                }
                System.out.println(s1);
        }
        
}
