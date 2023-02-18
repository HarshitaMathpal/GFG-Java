static int i = 0;
public static Node post_order(int pre[], int size) {
    i=0;
    return solve(pre, Integer.MIN_VALUE, Integer.MAX_VALUE);
} 

public static Node solve(int arr[], int min, int max){
    if(i > arr.length -1) return null;
    else if(arr[i] < min || arr[i] > max) return null;
    Node root = new Node(arr[i++]);
    root.left = solve(arr, min, root.data);
    root.right = solve(arr, root.data, max);
    return root;
}
