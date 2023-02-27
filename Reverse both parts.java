class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node temp=head;
        while(k-->1){
            temp=temp.next;
        }
        //Take head1 at next to the temp node.
        Node head1=temp.next;
        //break the node at position k.
        temp.next=null;
        //reverse first half.
        Node r=null; 
        Node p=head;
        Node q=null;
        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        //reverse second half.        
        r=null; 
        p=head1;
        q=null;
        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        head.next=q;
        return temp;
    }
}
      
