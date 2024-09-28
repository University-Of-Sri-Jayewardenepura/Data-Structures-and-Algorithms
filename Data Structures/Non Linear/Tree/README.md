# Tree Data Structures

Trees are a foundational data structure in computer science, offering a blend of fast searchability, similar to ordered arrays, and efficient insertion/deletion, comparable to linked lists.

#### Key Concepts:
- **Binary Trees**: Each node has at most two children (left and right).
  - **Leaf Node**: A node with no children.
- **Binary Search Trees (BST)**: A binary tree where the left child’s key is less than its parent, and the right child’s key is greater than or equal to its parent. This organization facilitates fast searching and insertion.

#### Example Binary Search Tree:

```
        53
      /    \
    30      72
   /  \    /  \
 14   39  61   84
/  \    \
9   34   47
```

### Tree Terminology:
- **Root**: The topmost node in a tree.
- **Parent**: A node that has at least one child.
- **Child**: A node that descends from another node.
- **Subtree**: Any tree formed from a node and its descendants.
- **Path**: A sequence of nodes connected by edges.
- **Level**: The depth of a node, where the root is at level 0.
- **Traversal**: Visiting all nodes in a specific order (Pre-order, In-order, Post-order).

### Implementing a Tree in Java:

### [Full Code Example](./Tree.java)

#### Node Class:
A `Node` class represents each individual node in the tree.

```java
class Node {
    int iData; // Key or data
    Node leftChild; // Left child node
    Node rightChild; // Right child node
}
```

#### Tree Class:
A `Tree` class manages the root node and methods for operations like insertion, deletion, and searching.

```java
class Tree {
    private Node root;

    public Node find(int key) {
        // Find method implementation
    }

    public void insert(int id) {
        // Insert method implementation
    }

    public boolean delete(int key) {
        // Delete method implementation
    }
}
```

### Inserting a New Node:

```java
public void insert(int id) {
    Node newNode = new Node(); // Create a new node
    newNode.iData = id;

    if (root == null) {
        root = newNode; // Tree is empty
    } else {
        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if (id < current.iData) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }
}
```

### Tree Traversal:
Traversal methods are used to visit each node in a specific order.

#### In-order Traversal:
Visits nodes in ascending order.

```java
private void inOrder(Node localRoot) {
    if (localRoot != null) {
        inOrder(localRoot.leftChild);
        System.out.print(localRoot.iData + " ");
        inOrder(localRoot.rightChild);
    }
}
```

#### Pre-order Traversal:
Visits the root node first, then left and right subtrees.

```java
private void preOrder(Node localRoot) {
    if (localRoot != null) {
        System.out.print(localRoot.iData + " ");
        preOrder(localRoot.leftChild);
        preOrder(localRoot.rightChild);
    }
}
```

#### Post-order Traversal:
Visits left and right subtrees first, then the root node.

```java
private void postOrder(Node localRoot) {
    if (localRoot != null) {
        postOrder(localRoot.leftChild);
        postOrder(localRoot.rightChild);
        System.out.print(localRoot.iData + " ");
    }
}
```

Here's the refined version of the section with **deleting a node, deleting a leaf, and deleting a node with one child**:

---

### Deleting a Node:
When deleting a node in a binary search tree, there are three main cases to consider:

1. **Deleting a Leaf Node**: The node has no children.
2. **Deleting a Node with One Child**: The node has either a left child or a right child, but not both.
3. **Deleting a Node with Two Children**: The node has both a left and a right child (covered below but more complex).

#### Deleting a Leaf:
If the node to be deleted is a leaf (no children), there are two possible cases:

- **If the node is the root**: The tree becomes empty after deleting it, so the root is set to `null`.
- **If the node is not the root**: Set the appropriate child reference of the parent node to `null`. If the node to be deleted is the left child, set the parent's left child to `null`; if it's the right child, set the parent's right child to `null`.

##### Example:
```java
if (current.leftChild == null && current.rightChild == null) {
    if (current == root) // If it's the root
        root = null;     // The tree is empty
    else if (isLeftChild)
        parent.leftChild = null; // Remove the left child
    else
        parent.rightChild = null; // Remove the right child
}
```

#### Deleting a Node with One Child:
If the node to be deleted has one child (either left or right), the child of the deleted node must take its place. This is done by updating the parent’s pointer to point to the node's child.

##### Example:
```java
// If the node has only a left child
if (current.rightChild == null) {
    if (current == root)
        root = current.leftChild;
    else if (isLeftChild)
        parent.leftChild = current.leftChild;
    else
        parent.rightChild = current.leftChild;
}

// If the node has only a right child
else if (current.leftChild == null) {
    if (current == root)
        root = current.rightChild;
    else if (isLeftChild)
        parent.leftChild = current.rightChild;
    else
        parent.rightChild = current.rightChild;
}
```

