package week5;

public class Queue {

        private int front, rear, size;
        private int capacity;
        private int[] queue;
    
        // Konstruktor untuk Queue
        public Queue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = this.size = 0;
            this.rear = -1;
        }
    
        // Cek apakah Queue kosong
        public boolean isEmpty() {
            return size == 0;
        }
    
        // Cek apakah Queue penuh
        public boolean isFull() {
            return size == capacity;
        }
    
        // Menambahkan elemen ke dalam Queue
        public void insert(int value) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println("Queue = " + value);
        }
    
        // Menghapus elemen dari Queue
        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.println("Removed: " + queue[front]);
            front = (front + 1) % capacity;
            size--;
    
            if (isEmpty()) {
                System.out.println("Queue is empty!");
            }
        }
    
        // Melihat elemen pertama dalam Queue
        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
            } else {
                System.out.println("Front Element: " + queue[front]);
            }
        }
    
        // Menampilkan jumlah elemen dalam Queue
        public void getSize() {
            System.out.println("Queue Size: " + size);
        }
    
}
