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
    public void append(INode myNode) {
        if(this.head==null) {
            this.head=myNode;
        }
        if(this.tail==null) {
            this.tail=myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    public void insert(INode myNode, INode newNode) {
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);

    }

}
