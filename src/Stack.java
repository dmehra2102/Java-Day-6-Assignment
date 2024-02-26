import java.util.ArrayList;

public class Stack {
    private int top = -1;
    private ArrayList<Integer> stack;

    Stack(){
        stack = new ArrayList<Integer>();
    }

    public void addElement(int item){
        stack.add(item);
        top++ ;
    }

    public void removeElement(){
        if(top > -1) {
            stack.remove(top);
            top--;
        }else{
            System.out.println("Stack empty");
        }
    }

    public boolean isStackEmpty(){
        return top == -1;
    }
}
