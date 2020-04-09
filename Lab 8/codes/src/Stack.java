import java.util.*;

public class Stack{
    public static void main(String[] args){
        ReservationCounter s1 = ReservationCounter.createEmptyStack();
        s1.push("Nirav");
        s1.push("Yogesh");
        s1.push("Brijesh");
        s1.push("Asher");
        s1.printStack();
        s1.pop();
        s1.pop();
        s1.printStack();

        ReservationCounter s2 = ReservationCounter.createEmptyStack();
        s2.push("Shubham");
        s2.push("Ankit");
        s2.push("Aadesh");
        s2.push("Chinmay");
        s2.printStack();
        s2.pop();
        s2.pop();
        s2.printStack();
        s2.Top();
    }
}

class ReservationCounter{
    LinkedList ReservationQueue;
    private ReservationCounter(){
        //initializing the ReservationQueue
        ReservationQueue = new LinkedList();
    }
    //Adding an element to the linkedlist from the end just like in a queue
    public void standInLine(String customer){
        ReservationQueue.add((String)customer);
    }
    //default Removal of the element is done from the front i.e first element is removed
    public void leaveTheLine(){
        ReservationQueue.remove();
    }

    // remove last element
    public void removeLast() {
        int index = customersInLine();
        ReservationQueue.remove(index-1);
    }

    //demonstration of how the first element of list can be accessed.
    public String giveTicket(){
        return (String)ReservationQueue.getFirst();
    }

    //retrieving data from anywhere in the list
    public String checkTheCustomerAt(int position){
        return (String)ReservationQueue.get(position);
    }
    public static ReservationCounter InitializeCounter(){
        return new ReservationCounter();
    }

    //size of the list
    public int customersInLine(){
        return ReservationQueue.size();
    }

    public static ReservationCounter createEmptyStack() {
        return InitializeCounter();
    }
    
    public void push(String customer) {
        standInLine(customer);
    }

    public void pop() {
        removeLast();
    }

    public String Top() {
        int index = customersInLine();
        return checkTheCustomerAt(index-1);
    }

    public void printStack() {
        for(int position = customersInLine()-1; position >= 0; position--){
            System.out.println(checkTheCustomerAt(position));
        }
    }
}
