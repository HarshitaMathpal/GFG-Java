class Solution
{
	Node sortList(Node head) {
		// Your code here
		Node curr = head;
		while(curr.next != null){
		    if(curr.next.data < 0){
		        Node temp = curr.next;
		        curr.next = curr.next.next;
		        temp.next = head;
		        head = temp;
		    }else{
		        curr = curr.next;
		    }
		}
		return head;
	}
}
