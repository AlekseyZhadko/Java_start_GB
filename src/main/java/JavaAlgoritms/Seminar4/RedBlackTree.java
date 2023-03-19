package JavaAlgoritms.Seminar4;

public class RedBlackTree {
    private Node root;

    private boolean addNode(Node current, int value) {
        if (current.value == value) {
            return false;
        } else {
            if (current.value > value) {
                if (current.leftChild != null) {
                    boolean result = addNode(current.leftChild, value);
                    current.leftChild = rebalnce(current.leftChild);
                    return result;
                } else {
                    current.leftChild = new Node();
                    current.leftChild.color = Color.RED;
                    current.leftChild.value = value;
                    return true;
                }
            } else {

                if (current.rightChild != null) {
                    boolean result = addNode(current.rightChild, value);
                    current.rightChild = rebalnce(current.rightChild);
                    return result;
                } else {
                    current.rightChild = new Node();
                    current.rightChild.color = Color.RED;
                    current.rightChild.value = value;
                    return true;
                }
            }
        }
    }

    private void colorSwap(Node current) {
        current.rightChild.color = Color.BLACK;
        current.leftChild.color = Color.BLACK;
        current.color = Color.RED;
    }

    private Node leftSwap(Node current) {
        Node leftChild = current.leftChild;
        Node betweenChild = leftChild.rightChild;
        leftChild.rightChild = current;
        current.leftChild = betweenChild;
        leftChild.color = current.color;
        current.color = Color.RED;
        return leftChild;
    }

    private Node rightSwap(Node current) {
        Node rightChild = current.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = current;
        current.rightChild = betweenChild;
        rightChild.color = current.color;
        current.color = Color.RED;
        return rightChild;
    }

    private Node rebalnce(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED &&
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    (result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED)) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    (result.rightChild != null && result.rightChild.color == Color.RED)) {
                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalnce(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }
}


