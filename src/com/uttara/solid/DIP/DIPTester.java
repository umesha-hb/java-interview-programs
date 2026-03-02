package com.uttara.solid.DIP;

/*
Depend on abstractions, not concrete implementations.
🔴 Example WITHOUT Dependency Inversion (Bad Design)
class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class UserService {
    private MySQLDatabase db = new MySQLDatabase(); // tightly coupled

    public void saveUser() {
        db.connect();
    }
}
 */
 interface Database {
    void connect();
}
class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}
class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }
}
class UserService {
    private Database db;

    // Constructor Injection
    public UserService(Database db) {
        this.db = db;
    }

    public void saveUser() {
        db.connect();
    }
}
public class DIPTester
{
    public static void main(String[] args){
        Database db = new PostgreSQLDatabase();
        UserService service = new UserService(db);
        service.saveUser();
    }
}