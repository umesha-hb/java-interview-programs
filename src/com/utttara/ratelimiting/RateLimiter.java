package com.utttara.ratelimiting;

public class RateLimiter {

    private final int capacity;
    private int tokens;
    private long lastRefillTime;
    private final long refillInterval;

    public RateLimiter(int capacity, long refillIntervalMillis) {
        this.capacity = capacity;
        this.tokens = capacity;
        this.refillInterval = refillIntervalMillis;
        this.lastRefillTime = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest() {

        refill();

        if(tokens > 0){
            tokens--;
            return true;
        }

        return false;
    }

    private void refill() {

        long now = System.currentTimeMillis();

        if(now - lastRefillTime >= refillInterval){
            tokens = capacity;
            lastRefillTime = now;
        }
    }
    public static void main(String args[])
    {
        RateLimiter limiter = new RateLimiter(5,1);
        for(int i=1;i<=10000;i++){
            System.out.println(limiter.allowRequest());
        }
    }
}
