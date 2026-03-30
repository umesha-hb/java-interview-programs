package com.uttara.circuitbreaker;

public class CircuitBreaker {

    enum State {
        CLOSED, OPEN, HALF_OPEN
    }

    private State state = State.CLOSED;

    private int failureCount = 0;
    private final int failureThreshold;
    private final long retryTimeout;
    private long lastFailureTime = 0;

    public CircuitBreaker(int failureThreshold, long retryTimeout) {
        this.failureThreshold = failureThreshold;
        this.retryTimeout = retryTimeout;
    }

    public synchronized boolean allowRequest() {
        if (state == State.OPEN) {
            if (System.currentTimeMillis() - lastFailureTime > retryTimeout) {
                state = State.HALF_OPEN;
                return true;
            }else
            return false;
        }
        return true;
    }

    public synchronized void recordSuccess() {
        failureCount = 0;
        state = State.CLOSED;
    }

    public synchronized void recordFailure() {
        failureCount++;
        lastFailureTime = System.currentTimeMillis();

        if (failureCount >= failureThreshold) {
            state = State.OPEN;
        }
    }

    public State getState() {
        return state;
    }
}
