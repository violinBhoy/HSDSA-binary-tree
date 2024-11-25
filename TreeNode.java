public class TreeNode implements Treeable {
    private Comparable treeNodeValue;//every value is comparable to each other - same types
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;

    public TreeNode() {
        treeNodeValue = null;
        leftTreeNode = null;
        rightTreeNode = null;
    }

    public TreeNode(Comparable value) {
        treeNodeValue = value;
        leftTreeNode = null;
        rightTreeNode = null;
    }
}