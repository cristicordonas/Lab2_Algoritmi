import java.util.ArrayList;
public class Stack {
    private int top = -1;
    private ArrayList<Integer> S = new ArrayList<>();
    public void PUSH(int x){
        top++;
        S.add(top,x);
    }
    public boolean STACK_EMPTY(){
        return top < 0;
    }
    public int POP(){
        int val;
        if (STACK_EMPTY()){
            System.out.println("underflow");
            return -1;
        }
        else {
            val = S.get(top);
            S.remove(top);
            top--;
        }
        return val;
    }
    public int POSTFIX_EXP(String exp){
        int rez = 0;
        int op1,op2;
        for(char c:exp.toCharArray()){
            if(c == ' ')
                continue;
            if(c>='0' && c<='9'){
                PUSH(Character.getNumericValue(c));
            }
            else {
                op2 = POP();
                op1 = POP();
                switch (c){
                    case '+':
                        rez = op1 + op2;
                        break;
                    case '-':
                        rez = op1 - op2;
                        break;
                    case '*':
                        rez = op1 * op2;
                        break;
                    case '/':
                        rez = op1 / op2;
                        break;
                }
                PUSH(rez);
            }
        }
        return POP();
    }
}
