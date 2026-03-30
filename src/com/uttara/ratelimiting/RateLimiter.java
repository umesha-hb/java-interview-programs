package com.uttara.ratelimiting;

 import java.util.*;
 import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {

    private final int LIMIT;
    private final long WINDOW_SIZE_MS;

    private final ConcurrentHashMap<String, Deque<Long>> userRequests = new ConcurrentHashMap<>();

    public RateLimiter(int limit, long windowSizeMs) {
        this.LIMIT = limit;
        this.WINDOW_SIZE_MS = windowSizeMs;
    }
    public boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();
        userRequests.putIfAbsent(userId, new ArrayDeque<>());
        Deque<Long> queue = userRequests.get(userId);
        synchronized (queue) {
            // Remove expired requests
            while (!queue.isEmpty() && currentTime - queue.peekFirst() > WINDOW_SIZE_MS) {
                queue.pollFirst();
            }
            if (queue.size() < LIMIT) {
                queue.addLast(currentTime);
                return true;
            }
            return false;
        }
    }
}


