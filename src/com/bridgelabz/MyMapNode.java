package com.bridgelabz;

public class MyMapNode {

    String data;
    int frequency;
    MyMapNode next;

    MyMapNode(String data){
        this.data=data;
        this.next=null;
        this.frequency +=1;
    }
}