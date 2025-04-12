// Coded by Jacob Aaron Espinoza @ jacob.espinoza@malad.us
// For CTE Software Development 2
// Instructor: Mr. Gross
// This program creates a node.

public class node {
    node prev;
    node next;
    String candyName;
    public node(String data) {
        this.candyName = data;
        this.prev = null;
        this.next = null;
    }
    public void setPrev(node prev) {
        this.prev = prev;
    }
    public void setNext(node next) {
        this.next = next;
    }
    public node getPrev() {
        return this.prev;
    }
    public node getNext() {
        return this.next;
    }
    public String getCandyName() {
        return this.candyName;
    }
    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }
    @Override
    public String toString() {
        return candyName;
    }
}