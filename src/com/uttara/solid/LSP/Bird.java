package com.uttara.solid.LSP;

/*
Subtypes must be substitutable for their base types
❌ Bad example (violates expectations)

class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
			❗ Penguins are birds… but can’t fly → broken substitution.
This breaks LSP because:
A Penguin is not safely substitutable for Bird

*/

//✅ Good
public interface Bird {
}
interface FlyingBird extends Bird {
    void fly();
}
class Sparrow implements FlyingBird {
    public void fly() { }
}
class Penguin implements Bird {
}
/*
    ✔ No surprises at runtime
	✔ No broken contracts
*/
