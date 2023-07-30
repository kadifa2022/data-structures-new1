package com.cydeo.dsa06Tree;

public class Trunk {

    Trunk prev;
    String str;

    public Trunk(Trunk prev, String str) {
        this.prev = prev;
        this.str = str;
    }
}
