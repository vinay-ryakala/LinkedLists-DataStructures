package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> MySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(MySecondNode);
        myLinkedList.add(myThirdNode);

        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(MySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);

    }
    @Test
    public void given3NumbersWhenAppendedToLinkedListShouldAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new  MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }

}

