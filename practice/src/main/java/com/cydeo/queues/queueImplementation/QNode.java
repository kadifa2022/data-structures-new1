package com.cydeo.queues.queueImplementation;

public class QNode <T>{
    T value;
    QNode<T>next;

    public QNode(T value) {
        this.value = value;
    }
}
