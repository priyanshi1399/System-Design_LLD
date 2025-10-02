package StackUsingArrayList;

import java.util.ArrayList;

class stack<T>{

    ArrayList<T> A;
    int top=-1;
    int size;

    public stack(int size){
        this.size=size;
        this.A=new ArrayList<T>(size);
    }

    void push(T ele){

        if(top+1==size){
            System.out.println("Stack overflow");
            return;
        }
        top=top+1;
        if(A.size()>top){
            A.set(top,ele);
        }
        else{
            A.add(ele);
        }
    }

    T top(){
        if(top==-1){
            System.out.println("Stack underflow");
            return null;
        }
        else{
           return A.get(top);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack empty");
        }
        else{
            top--;
        }
    }

    boolean isEmpty(){

        return top==-1;
    }
    @Override
    public String toString(){

        String ans="";
        for(int i=0;i<top;i++){
            ans+=String.valueOf(A.get(i)+"=>");

        }
        ans +=A.get(top);
        return ans;
    }


}
public class Example {
    public static void main(String[] args) {

        stack<Integer> s1=new stack<Integer>(3);
        s1.push(100);
        s1.push(200);
        s1.push(300);

        System.out.println("elements after pushing in 100,200 and 300 in s1 " + s1);
        s1.pop();
        System.out.println("elements after popping out first value "+s1);

        stack<String> s2=new stack<String>(4);
        s2.push("Java");
        s2.push("priaynshi");
        s2.push("hello");
        s2.push("how are you");

        System.out.println("elements after popping out first value "+s2);
        System.out.println("top element is "+s2.top());




    }
}
