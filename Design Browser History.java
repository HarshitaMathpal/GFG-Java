class Node{
    String data;
    Node next;
    Node prev;

    Node(String data){
        this.data = data;
    }
}

class BrowserHistory {
     // constructor to initialize object with homepage
     
     Node temp = null;
    Node head = null;
    
    BrowserHistory(String homepage) {
        head = new Node(homepage);
        temp = head;
    }
    
    // visit current url
    void visit(String url) {
        Node newnode = new Node(url);
            temp.next = newnode;
            newnode.prev = temp;
            temp = newnode;
    }
    
    // 'steps' move backward in history and return current page
    String back(int steps) {
        while(temp.prev != null && steps>0){
            temp = temp.prev;
            steps--;
        }
        return temp.data;
    }
    
    // 'steps' move forward and return current page
    String forward(int steps) {
        while(temp.next != null && steps>0){
            temp = temp.next;
            steps--;
        }
        return temp.data;
    }
}
