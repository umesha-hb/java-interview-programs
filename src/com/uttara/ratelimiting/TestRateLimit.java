package com.uttara.ratelimiting;

public class TestRateLimit {
    public static void main(String[] args)  {
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