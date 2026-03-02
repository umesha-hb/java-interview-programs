package com.uttara.behaviorl.observerdesignpattern;

public interface Channel {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers();
}
