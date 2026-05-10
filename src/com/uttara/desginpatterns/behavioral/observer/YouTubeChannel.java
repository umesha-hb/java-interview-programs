package com.uttara.desginpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;

    public void uploadVideo(String title) {
        this.latestVideo = title;
        notifySubscribers();
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(latestVideo);
        }
    }
}

