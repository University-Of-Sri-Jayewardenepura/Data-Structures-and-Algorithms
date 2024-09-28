class Node {
    int key;
    Node leftChild, rightChild;

    public Node(int item) {
        key = item;
        leftChild = rightChild = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Helper method to find the minimum value node in the right subtree (in-order successor)
    Node minValueNode(Node node) {
        Node current = node;
        // Find the leftmost leaf node
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current;
    }

    // Recursive method to delete a node from the BST
    Node deleteNode(Node root, int key) {
        // Base case: if the tree is empty
        if (root == null) {
            return root;
        }

        // Recur down the tree to find the node to delete
        if (key < root.key) {
            root.leftChild = deleteNode(root.leftChild, key);
        } else if (key > root.key) {
            root.rightChild = deleteNode(root.rightChild, key);
        } else {
            // Case 1: Node is a leaf (no children)
            if (root.leftChild == null && root.rightChild == null) {
                return null; // Node is simply removed
            }

            // Case 2: Node has one child (either left or right)
            else if (root.leftChild == null) {
                return root.rightChild; // Replace with right child
            } else if (root.rightChild == null) {
                return root.leftChild; // Replace with left child
            }

            // Case 3: Node has two children
            // Find the in-order successor (smallest in the right subtree)
            Node successor = minValueNode(root.rightChild);
            
            // Replace root's key with the successor's key
            root.key = successor.key;
            
            // Delete the in-order successor
            root.rightChild = deleteNode(root.rightChild, successor.key);
        }

        return root;
    }

    // Insert a node into the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive helper function to insert a new key in the BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.leftChild = insertRec(root.leftChild, key);
        } else if (key > root.key) {
            root.rightChild = insertRec(root.rightChild, key);
        }

        return root;
    }

    // Method to do an in-order traversal of the BST
    void inOrder() {
        inOrderRec(root);
    }

    // A recursive helper function for in-order traversal
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.leftChild);
            System.out.print(root.key + " ");
            inOrderRec(root.rightChild);
        }
    }
}

public class Tree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal of the tree before deletion:");
        tree.inOrder();  // Output: 20 30 40 50 60 70 80

        System.out.println("\n\nDelete node with no children (leaf): 20");
        tree.deleteNode(tree.root, 20);
        tree.inOrder();  // Output: 30 40 50 60 70 80

        System.out.println("\n\nDelete node with one child: 30");
        tree.deleteNode(tree.root, 30);
        tree.inOrder();  // Output: 40 50 60 70 80

        System.out.println("\n\nDelete node with two children: 50");
        tree.deleteNode(tree.root, 50);
        tree.inOrder();  // Output: 40 60 70 80
    }
}
