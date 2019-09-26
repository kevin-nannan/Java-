package com.set.mycolletction;

public class zckLinkedList01 {
        private Node first;
        private Node last;
        private int size;
        
        public void add(Object obj) {
                Node node=new Node(obj);
                if(first==null) {
                        first=node;
                        last=node;
                }else{
                    node.previous=last;
                    node.next=null;
                    last.next=node;
                    last=node;
                }
                size++;
        }
        public void add(int index,Object obj) {
                Node node=new Node(obj);
                Node temp=getnode(index);
                Node up=temp.previous;
                Node down=temp.next;
                up.next=node;
                down.previous=node;
                node.next=down;
                size++;
        }
        public Node getnode(int index) {
                Node temp=first;
                if(index<=(size>>1)) {
                        for(int i=0;i<index;i++) {
                                temp=temp.next;
                        }
                }
                else {temp=last;
                        for(int i=0;i<size-index-1;i++) {
                        temp=temp.previous;
                        }
                }
                return temp;
        }
        public void remove(int index) {
                Node temp=getnode(index);
                Node node1=temp.previous;
                Node node2=temp.next;
                if(node1!=null) {
                        temp=temp.previous;
                }
                if(node2!=null) {
                temp.next=node2;
                }
        }
        public void checkindex(int index) {
              //判断索引合不合法[0,size)
                if(index<0||index>size-1) {
                        throw new RuntimeException("索引不合法");
                }
        }
        public Object get(int index) {
                checkindex(index);
                Node temp=first;
                
                if(index<=(size>>1)) {
                        for(int i=0;i<index;i++) {
                                temp=temp.next;
                        }
                }
                else {temp=last;
                        for(int i=0;i<size-index-1;i++) {
                        temp=temp.previous;
                        }
                }
                return temp.element;
                
        }
        @Override
        public String toString() {
                Node temp=first;
                while(temp!=null) {
                     System.out.println(temp.element);   
                     temp=temp.next;
                }
                
                return "";
        }
        public static void main(String[] args) {
                zckLinkedList01 list=new zckLinkedList01();
                list.add("c");
                list.add("a");
                list.add("b");
                list.add("c");
                list.add("a");
                list.add("b");
                System.out.println(list);
                System.out.println(list.get(5));
                list.remove(5);
                System.out.println(list);
        }
        
        
}
