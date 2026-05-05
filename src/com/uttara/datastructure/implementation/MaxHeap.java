package com.uttara.datastructure.implementation;

import java.util.Arrays;


public class MaxHeap {

    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    // 🟢 Insert element
    public void insert(int value) {
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    // 🔼 Move element up to maintain max heap
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap[index] > heap[parent]) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    // 🔽 Remove max element (root)
    public int removeMax() {
        if (size == 0) throw new RuntimeException("Heap is empty");

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);
        return max;
    }

    // 🔽 Restore heap after removal
    private void heapifyDown(int index) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);
        maxHeap.insert(15);

        maxHeap.printHeap(); // Max heap structure

        System.out.println("Removed Max: " + maxHeap.removeMax());
        System.out.println("Removed Max: " + maxHeap.removeMax());
        System.out.println("Removed Max: " + maxHeap.removeMax());

        maxHeap.printHeap();
    }
}
