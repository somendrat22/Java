import java.util.Scanner;

public class Maxheap {
    int [] heap;
    int size;
    int maxsize;
    public Maxheap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize];
    }
    public int parent(int pos){
        return (pos-1)/2;
    }
    public int leftchild(int pos){
        return (2*pos) + 1;
    }
    public int rightchild(int pos){
        return (2*pos) + 2;
    }
    public boolean isleaf(int pos){
        if(pos >= (size/2) && pos <= size){
            return true;
        }
        return false;
    }
    public void swap(int p1, int p2){
        int temp = p1;
        heap[p1] = heap[p2];
        heap[p2] = heap[p1];
    }
    public void insert(int val){
        heap[size] = val;
        int current = size;
        while(heap[current] > heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
        size++;
    }
    public void print(){
        for(int i = 0; i<=size/2; i++){
            System.out.println(heap[i] + " " + heap[2*i + 1] + " " + heap[2*i + 2]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        Maxheap maxheap = new Maxheap(n);
        maxheap.insert(5);
        maxheap.insert(3);
        maxheap.insert(17);
        maxheap.insert(10);
        maxheap.insert(84);
        maxheap.print();
    }
}
