class Solution{
    Node divide(int N, Node head){
        // code here
        if(head==null || head.next==null)return head;
        Node even=new Node(-1);

        Node pe=even;

        Node odd=new Node(-1);

        Node po=odd;

       Node curr=head;

        while(curr!=null){

            if(curr.data%2!=0){

                po.next=curr;

                po=po.next;
            }

            else{
                pe.next=curr;
                pe=pe.next;

            }
            curr=curr.next;

        }
        pe.next=odd.next;

        po.next=null;
        return even.next;
    }
}
