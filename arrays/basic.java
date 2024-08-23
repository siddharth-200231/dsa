import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class stack {
    int size;
    int st[];
    int top = -1;
    stack(int size) {
        this.size = size;
        this.st = new int[size];
    }
    void push(int n){
        if(top<=size){
            top++;
            st[top]=n;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }
class basic {
  
        
    }
    public static void main(String[] args) {
            stack st=new stack(10);
           st.push(1);
           st.push(2);
           
        }

}