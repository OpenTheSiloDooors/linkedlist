// Coded by Jacob Aaron Espinoza @ jacob.espinoza@malad.us
// For CTE Software Development 2
// Instructor: Mr. Gross
// This program creates a linked list.

public class linkedList {

    // initialize nodes
    node head;
    node tail;
    node curr;

    // linked list method | head, tail, and current set to null
    public linkedList() {
        this.head = null;
        this.tail = null;
        this.curr = null;
    }
    public void setCurrToHead() {
        curr = head;
    }
    public void setCurrToTail() {
        curr = tail;
    }
    public node getCurr() {
        return curr;
    }
    //
    public void setCurr(node curr) {
        this.curr = curr;
    }
    /*
    add method | create node | if head is null: set head, tail, and current to new node | otherwise, still set tail to new node |
    set previous tail to a new node | set next node to tail
     */
    public void add (String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            curr = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }
    /*
    push method | if head is null: set head, tail, and current to new node | otherwise, still set head to new node |
    set previous head to a new node | set next node to head
     */
    public void push (String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            curr = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }
    /*
    enQueue method | if head is null: set head, tail, and current to new node | otherwise, still set head to new node |
    set previous head to a new node | set next node to head
     */
    public void enQueue (String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            curr = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }
    // isEmpty method | set head to null for following method:
    public boolean isEmpty() {
        return head == null;
    }
    /*
    pop method | if head is null: return null | otherwise, declare data variable and set it to head.getCandyName | head is next |
    if head is not null: set previous head as null | otherwise, set tail to null | return data
     */
    public String pop () {
        if (head == null) {
            return null;
        } else {
            String data = head.getCandyName();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
            return data;
        }
    }
    /*
    deQueue method | if head is null: return null | otherwise, declare data variable and set it to tail.getCandyName | get previous tail |
    if tail is not null: set next tail as null | otherwise, set head to null | return data
     */
    public String deQueue () {
        if (head == null) {
            return null;
        } else {
            String data = tail.getCandyName();
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null;
            }
            return data;
        }
    }
    /*
    remove method | if head is null: return null | otherwise, if junk is head: declare data variable and set it to head.getCandyName |
    head is next | if head is not null: set previous head as null | otherwise, set tail to null | return data |
    otherwise, if junk is tail: declare data variable as tail.getCandyName | tail is previous | if tail is not null: set next tail as null |
    otherwise, set head to null | return data | otherwise, declare data variable as junk.getCandyName | something idk | return data
     */
    public String remove (node junk) {
        if (head == null) {
            return null;
        } else if (junk == head) {
            String data = head.getCandyName();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
            return data;
        } else if (junk == tail) {
            String data = tail.getCandyName();
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null;
            }
            return data;
        } else {
            String data = junk.getCandyName();
            junk.getNext().setPrev(junk.getPrev());
            junk.getPrev().setNext(junk.getNext());
            return data;
        }
    }
}

