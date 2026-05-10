package com.uttara.desginpatterns.behavioral.observer;

public interface Channel {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers();
}
