package com.set.map;
/*
 * �Զ���һ��hashmap
 */
public class HashMap1 {
        static Node[] table;
        int size;
        
        public HashMap1() {
                table=new Node[16]; //����һ����2����������
        }
        
        public void put(Object key,Object value) {
                Node up=null;
                Node newnode=new Node();
                boolean repeat=false;
                newnode.hash=myHash(key.hashCode(), table.length);
                newnode.key=key;
                newnode.value=value;
                newnode.next=null;
                Node temp=table[newnode.hash];
                
                if(temp==null) {
                        table[newnode.hash]=newnode;
                }else {
                        //��Ϊ�գ��������� �滻������ֵ�ظ���node
                        while(temp!=null) {
                                if(temp.key.equals(key)) {
                                        System.out.println("key�ظ��ˣ�");
                                        temp.value=value;
                                        repeat=true;
                                        break;
                                }
                                else {
                                        up=temp;
                                        temp=temp.next; //���ظ���һ�±����ҵ���Ȼ�����
                                }
                        }
                        if(!repeat) {
                                up.next=newnode;
                        }
                }
        }
        public static int myHash(int v,int length) {
                return v&(length-1);
        }
        public static Object get(Object key) {
                Object value = null;
                int hash=myHash(key.hashCode(), table.length);
                if(table[hash]!=null) {
                        Node temp=table[hash];
                        while(temp!=null) {
                                if(temp.key.equals(key)) { 
                                        value= temp.value;
                                        break;
                                }else {
                                        temp=temp.next;
                                }
                        }
                        
                }
                
                
                return value;
        }
        @Override
        public String toString() {
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<table.length;i++) {
                        Node temp=table[i];
                        while(temp!=null) {
                                sb.append(temp.key+""+temp.value+",");
                                temp=temp.next;
                        }
                }
                return sb.toString();
        }
        
        static class Node{
                int hash;
                Object key;
                Object value;
                Node next;
        }
        public static void main(String[] args) {
                HashMap1 map=new HashMap1();
                map.put(10, "zck");
                map.put(14, "zck1223");
//                map.put(14, "zc");
//                map.put(11, "zc123k");
               //53��69��85�����hashֵһ�� Ϊ5 �����������������洢
                map.put(53, "gg");
                map.put(69, "dd");
                map.put(85,"dzd");
                System.out.println(map);    
                System.out.println(map.get(53));
                
               
        }
}

