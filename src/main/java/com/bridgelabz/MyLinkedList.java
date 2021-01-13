package com.bridgelabz;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void add(INode node) {
        if(this.tail==null) {
            this.tail=node;
        }
        if(this.head==null) {
            this.head=node;
        } else {
            INode tempNode=this.head;
            this.head=node;
            this.head.setNext(tempNode);
        }
    }

}
