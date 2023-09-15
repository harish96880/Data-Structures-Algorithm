package Heap;

import java.util.ArrayList;
import java.util.List;

/* 1. Heap is like a binary tree. But the maximum node or minimum node always represent as the root or parent node here.

   2. we can also store the distinct elements in heap.

   3. There are two types of heap, Maxheap and Min heap.

   4. Maxheap contains the max element as its parent, minheap has its lowest one as its parent.

   5. We use Array List to implement a heap.

   6. Unless other trees, we don't have pointers here, instead we use some basic calculation to find left
   and right child.

   7. leftchild = 2 * arrayIndex, rightchild = 2  * arrayIndex + 1

   8. parentNodeIndex = lefChildIndex / 2 or rightChildIndex / 2
*/
public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return (index * 2) + 1;
    }

    private int rightChild(int index) {
        return (index * 2) + 2;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;
        while(current > 0 &&  heap.get(current) > heap.get(parentIndex(current))) {
            swap(current, parentIndex(current));
            current = parentIndex(current);
        }
    }

    public Integer remove() {
        if(heap.size() == 0) {
            return null;
        }
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxValue;
    }

    private void sinkDown(int index) {
        int maxIndex = index;
        while(true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }
            if(index != maxIndex) {
                swap(index, maxIndex);
                index = maxIndex;
            }
            else {
                return;
            }
        }
    }
}
