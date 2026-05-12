package com.uttara.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
       if(lock.tryLock())        // acquire lock
        try {
            count++;
        } finally {
            lock.unlock();  // release lock
        }
    }

    public int getCount() {
        return count;
    }
}

public class TestReentrantLock {
    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i = 0; i < 100; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
/*

1. Intrinsic Lock (Synchronized Lock)
	Every object in Java has an internal monitor lock.
	When we use synchronized, the thread must acquire this lock.

	Example:
	public synchronized void increment() {
		count++;
	}

	or

	synchronized(this) {
		count++;
	}

	Characteristics:
	Built into JVM
	Automatically released when block exits
	Simpler syntax
	Less flexible

2. Reentrant Lock

	A ReentrantLock is an explicit locking mechanism where the developer controls the lock.

	Example:
	import java.util.concurrent.locks.ReentrantLock;

	ReentrantLock lock = new ReentrantLock();

	lock.lock();
	try {
		count++;
	} finally {
		lock.unlock();
	}

	Characteristics:
	Must manually lock and unlock
	Provides advanced features
	More flexible than synchronized

3. Why It Is Called Reentrant

	Reentrant means:
	The same thread can acquire the same lock multiple times without deadlock.

	Example:

	lock.lock();
	lock.lock();

	The thread must call unlock() twice.

4. Key Differences
	| Feature            | Intrinsic Lock (`synchronized`) | ReentrantLock          |
	| ------------------ | ------------------------------- | ---------------------- |
	| Lock type          | JVM monitor lock                | Java library lock      |
	| Package            | Built-in                        | `java.util.concurrent` |
	| Lock acquisition   | Automatic                       | Manual                 |
	| Lock release       | Automatic                       | Must call `unlock()`   |
	| tryLock() support  | No                              | Yes                    |
	| Timeout locking    | No                              | Yes                    |
	| Interruptible lock | No                              | Yes                    |
	| Fairness policy    | No                              | Yes                    |


5. tryLock Example (ReentrantLock)
	if(lock.tryLock()) {
		try {
			System.out.println("Lock acquired");
		} finally {
			lock.unlock();
		}
	} else {
		System.out.println("Could not acquire lock");
	}

This prevents threads from waiting forever.

6. When to Use Which
	Use Intrinsic Lock (synchronized) when:
		Simple thread synchronization
		Small critical sections
		Basic concurrency control

	Use ReentrantLock when:
		Need tryLock()
		Need timeout locking
		Need fair scheduling
		Need interruptible lock

Intrinsic locks are built-in JVM locks used through the synchronized keyword
where lock acquisition and release are handled automatically.
ReentrantLock is a more flexible locking mechanism from the java.util.concurrent package
that provides advanced features like tryLock(), timeout, fairness, and interruptible locking.
 */
