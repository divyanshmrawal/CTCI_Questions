//QUESTION-->
//How would you design a stack which, in addition to push and pop, has a function min
// which returns the minimum element? Push, pop and min should all operate in 0(1) time. 

//ANSWER-->
import java.util.Stack;

class Stacksgrp{
private Stack<Integer> mainStack;
private Stack<Integer> mingrp;

public Stacksgrp(){
mainStack = new Stack<>();
mingrp= new Stack<>();
}

public void push(int num){
    mainStack.push(num);

    if(mingrp.isEmpty() || num <= mingrp.peek()){
mingrp.push(num);
    }
}

public void pop(){
    if(!mainStack.isEmpty()){
        int top=mainStack.pop();
        if(top==mingrp.peek()){
            mingrp.pop();
        }
    }
}

public int min(){
    if(!mainStack.isEmpty()){
        return mainStack.peek();
    }
    throw new IllegalStateException("Stack is empty");
}


public static void main(String[] args) {
    Stacksgrp stack =new Stacksgrp();

    stack.push(5);
    stack.push(9);
    System.out.println(stack.min());
    stack.push(2);
    stack.push(1);
    System.out.println(stack.min());
    stack.pop();
    System.out.println(stack.min()); 
    stack.pop();
    System.out.println(stack.min());
}
}

