package Classes;

public class Stack {
    int st[] = new int[10];
    int top;

    Stack(){
        top = -1;
    }

    void push(int num){

        if (top == 9){
            System.out.println("Classes.Stack is Full");
        } else {
            st[++top] = num;
        }
    }
    int pop(){
        if (top < 0) {
            System.out.println("Classes.Stack is Empty");
        }
        return st[top--];
    }
}