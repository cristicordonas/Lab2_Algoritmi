import java.util.Stack;
public class TheMaze {

    private int[][] entry;
    private int[][] visited;
    private int finali;
    private int finalj;
    private boolean mazedSolved;
    private Stack<Point> myStack;
    public  Stack<Point> getStack(){
        return myStack;
    }
    public TheMaze(int[][] entry, int[][] visited, int finali, int finalj) {
        this.entry = entry;
        this.visited = visited;
        myStack = new Stack<>();
        this.finali = finali;
        this.finalj = finalj;
        mazedSolved = false;
    }
    void Check(int i, int j) {
        if (i == finali && j == finalj) {
            System.out.println("The maze was solved!");
            mazedSolved = true;
            return;
        }
        visited[i][j] = 1;
        if (Valid(i - 1, j)) {
            myStack.push(new Point(i - 1, j));
            Check(i - 1, j);
        }
        if (Valid(i, j + 1)) {
            myStack.push(new Point(i, j + 1));
            Check(i, j + 1);
        }
        if (Valid(i + 1, j)) {
            myStack.push(new Point(i + 1, j));
            Check(i + 1, j);
        }
        if (Valid(i, j - 1)) {
            myStack.push(new Point(i, j - 1));
            Check(i, j - 1);
        }
        if (!mazedSolved) {
            if(myStack.isEmpty())
                System.out.println("The maze was not solved!");
            else myStack.pop();
        }
    }
    boolean Valid(int i, int j) {
        if (i < 0)
            return false;
        if (j <0 )
            return false;
        if (i >= entry.length)
            return false;
        if (j >= entry[0].length)
            return false;
        if (entry[i][j] == 1 && visited[i][j]==0)
            return true;
        return false;
    }

}