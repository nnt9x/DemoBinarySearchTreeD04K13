public class BinarySearchTree {
    private Node root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }
    public void insert(int data){
        if(root == null){
            this.root = new Node(data);
            size ++;
        }
        else{
            // Node dang duyet
            Node node = root;
            while (node != null){
                if(node.getData() > data){
                    // Duyet sang
                    if(node.getLeft() == null){
                        node.setLeft(new Node(data));
                        size ++;
                        break;
                    }
                    else{
                        node = node.getLeft();
                    }
                }
                else{
                    if(node.getRight() == null){
                        node.setRight(new Node(data));
                        size++;
                        break;
                    }
                    else{
                        node = node.getRight();
                    }
                }
            }
        }

    }
}
