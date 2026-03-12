package com.uttara.multithreading;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentHashMap;

public class TestRateLimit {
    public static void main(String[] args) throws Exception {
       RateLimiter limiter = new RateLimiter(3, 10000); // 3 requests per 10 sec
        String user = "user1";
        for (int i = 0; i < 5; i++)
        {
            boolean allowed = limiter.allowRequest(user);
            if (allowed)
            {
                System.out.println("Request Allowed");
            }
            else
            {
                System.out.println("Rate limit exceeded");
            }
        }
    }
}
class RateLimiter
{
    private final int LIMIT;
    private final long WINDOW_SIZE_MS;
    private final ConcurrentHashMap<String, Deque<Long>> userRequest = new ConcurrentHashMap<>();
    public  RateLimiter(int limit, long windowSizeMs)
    {
        this.LIMIT=limit;
        this.WINDOW_SIZE_MS = windowSizeMs;
    }
    public boolean allowRequest(String userId)
    {
        long currentTimeMs = System.currentTimeMillis();
        userRequest.putIfAbsent(userId,new ArrayDeque<>());
        Deque<Long> queue = userRequest.get(userId);
        //remove exipried requests
        synchronized (queue) {
            while (!queue.isEmpty() && currentTimeMs - queue.peekFirst() > WINDOW_SIZE_MS) {
                queue.pollFirst();
            }
            if (queue.size() < LIMIT) {
                queue.addLast(currentTimeMs);
                return true;
            }
        }
       return false;

    }
}
