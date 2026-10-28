public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size;

    // 1. Initialize an empty array with a starting capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    // 2. Return the element at index i
    public int get(int i) {
        return arr[i];
    }

    // 3. Set the element at index i to n
    public void set(int i, int n) {
        arr[i] = n;
    }

    // 4. Push element n to the end (resizes first if full)
    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    // 5. Pop and return the element at the end
    public int popback() {
        if (size > 0) {
            size--;
            return arr[size];
        }
        return -1; // Fallback for empty array, though problem assumes non-empty
    }

    // 6. Double the capacity of the array
    public void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        
        // Copy old elements into the new bigger array
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        
        arr = newArr; // Point to the new array
    }

    // 7. Return the number of elements currently stored
    public int getSize() {
        return size;
    }

    // 8. Return the total capacity
    public int getCapacity() {
        return capacity;
    }
}