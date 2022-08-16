import java.util.*;

public class intro{
    public static void main(String args[]){

    // Stack declaration    
    Stack <Integer> st = new Stack<>();

    // push
    st.push(10);
    System.out.println(st+" top -> " +st.peek()+" size -> "+st.size());
    st.push(20);
    System.out.println(st+" top -> " +st.peek()+" size -> "+st.size());
    st.push(30);
    System.out.println(st+" top -> " +st.peek()+" size -> "+st.size());
    st.push(40);
    System.out.println(st+" top -> " +st.peek()+" size -> "+st.size());

    // pop
    st.pop();
    System.out.println(st+" top -> " +st.peek()+" size -> "+st.size());
    st.pop();
    System.out.println(st+" top -> " +st.peek()+" size -> "+st.size());

    System.out.println(st.empty());
    }
}