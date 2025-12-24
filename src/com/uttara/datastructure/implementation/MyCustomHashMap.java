package com.uttara.datastructure.implementation;

import java.util.Objects;

class Entry<K, V> {
	final K key;
	V value;
	Entry<K, V> next;

	Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
public class MyCustomHashMap<K, V> {

	private static final int DEFAULT_CAPACITY = 16;
	private static final float LOAD_FACTOR = 0.75f;

	private Entry<K, V>[] table;
	private int size;

	@SuppressWarnings("unchecked")
	public MyCustomHashMap() {
		table = new Entry[DEFAULT_CAPACITY];
	}

	// Hash function
	private int getIndex(K key) {
		return (key == null) ? 0 :
				Math.abs(key.hashCode()) % table.length;
	}

	// PUT
	public void put(K key, V value) {
		int index = getIndex(key);
		Entry<K, V> head = table[index];

		// Update existing key
		for (Entry<K, V> curr = head; curr != null; curr = curr.next) {
			if (keyEquals(curr.key, key)) {
				curr.value = value;
				return;
			}
		}

		// Insert new entry
		Entry<K, V> newEntry = new Entry<>(key, value);
		newEntry.next = head;
		table[index] = newEntry;
		size++;

		if (size >= table.length * LOAD_FACTOR) {
			resize();
		}
	}

	// GET
	public V get(K key) {
		int index = getIndex(key);
		Entry<K, V> curr = table[index];

		while (curr != null) {
			if (keyEquals(curr.key, key)) {
				return curr.value;
			}
			curr = curr.next;
		}
		return null;
	}

	// REMOVE
	public V remove(K key) {
		int index = getIndex(key);
		Entry<K, V> curr = table[index];
		Entry<K, V> prev = null;

		while (curr != null) {
			if (keyEquals(curr.key, key)) {
				if (prev == null) {
					table[index] = curr.next;
				} else {
					prev.next = curr.next;
				}
				size--;
				return curr.value;
			}
			prev = curr;
			curr = curr.next;
		}
		return null;
	}

	// Resize
	@SuppressWarnings("unchecked")
	private void resize() {
		Entry<K, V>[] oldTable = table;
		table = new Entry[oldTable.length * 2];
		size = 0;

		for (Entry<K, V> entry : oldTable) {
			while (entry != null) {
				put(entry.key, entry.value);
				entry = entry.next;
			}
		}
	}

	private boolean keyEquals(K k1, K k2) {
		return k1 == k2 || (k1 != null && k1.equals(k2));
	}

	public int size() {
		return size;
	}
	public static void main(String[] args) {
		MyCustomHashMap<Employee, Integer> map = new MyCustomHashMap<>();
		Employee emp1 = new Employee("Alice");
		Employee emp2 = new Employee("bob");
		Employee emp3 = new Employee("Charlie");
		map.put(emp1, 50);
		map.put(emp2, 60);
		map.put(emp3, 70);

		System.out.println("Value for 'emp2': " + map.get(emp2)); // Output: 2

		map.remove(emp2);
		System.out.println("Value for 'emp2' after removal: " + map.get(emp2)); // Output: null

		System.out.println("Current size: " + map.size()); // Output: 2
	}
}
class Employee{
	private String name;


	public Employee(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
