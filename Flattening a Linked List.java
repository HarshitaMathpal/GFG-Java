class GfG
{
    public Node merge(Node l1,Node l2)
    {
	// Your code here
	Node temp = new Node(0);

        Node res = temp;

        while(l1 != null && l2 != null){

            if(l1.data  <= l2.data){

                res.bottom = l1;

                l1= l1.bottom;

                res = res.bottom;

            }else{

                res.bottom = l2;

                l2 = l2.bottom;

                res = res.bottom;

            }

        }

        if(l1 != null) res.bottom = l1;

        if(l2 != null) res.bottom = l2;

        temp =temp.bottom;

        return temp;

    }

    Node flatten(Node root)

    {

        if(root.next == null) return root;

        

        Node l2 = flatten(root.next);

        

        Node ans = merge(root, l2);

        return ans;
    }
}
