import java.util.ArrayList;
public class Queue{
    private int head = -1;
    private int tail = -1;
    private ArrayList<Integer> Q = new ArrayList<>();
    public void ENQUEUE(int x){
        if(head == -1)
            head = 0;
        tail++;
        Q.add(tail,x);
    }
    public int DEQUEUE(){
        int x;
        if (head != -1 && head <= tail) {
            x = Q.get(head);
            head++;
            return x;
        }
        else {
            System.out.println("The queue is empty");
            return -1;
        }
    }
}