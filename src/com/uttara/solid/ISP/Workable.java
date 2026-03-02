package com.uttara.solid.ISP;

/*
	Don’t force clients to depend on methods they don’t use.
	❌ Bad example (fat interface)
		interface Worker {
			void work();
			void eat();
		}

		class RobotWorker implements Worker {
			public void work() { }
			public void eat() { } // 🤖 ???
		}

	✅ Good example (small, focused interfaces)
 */
public interface Workable {
    void work();
}
interface Eatable {
    void eat();
}
class HumanWorker implements Workable, Eatable {
    public void work() { }
    public void eat() { }
}
class RobotWorker implements Workable {
    public void work() { }
}


