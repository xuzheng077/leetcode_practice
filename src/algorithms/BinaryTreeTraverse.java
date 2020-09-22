package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Xu Zheng
 * @description 二叉树遍历
 */
public class BinaryTreeTraverse {
    //层序遍历 非递归 也可以认为是广度优先遍历
    public static ArrayList<Node> layerTraverse(Node root){
        Node node;
        ArrayList<Node> list = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        if (root != null){
            queue.push(root);
        }
        while(!queue.isEmpty()){
            node = queue.removeFirst();
            list.add(node);
            if (node.left !=null){
                queue.addLast(node.left);
            }
            if(node.right !=null){
                queue.addLast(node.right);
            }
        }
        return list;
    }

    //前序遍历 递归
    public static ArrayList<Node> recursivePreTraverse(Node root){
        ArrayList<Node> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.add(root);
        if (root.left != null){
            list.addAll(recursivePreTraverse(root.left));
        }
        if (root.right != null){
            list.addAll(recursivePreTraverse(root.right));
        }
        return list;
    }

    //中序遍历 递归
    public static ArrayList<Node> recursiveMiddleTraverse(Node root){
        ArrayList<Node> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        if (root.left != null){
            list.addAll(recursiveMiddleTraverse(root.left));
        }
        list.add(root);
        if (root.right != null){
            list.addAll(recursiveMiddleTraverse(root.right));
        }
        return list;
    }

    //后序遍历 递归
    public static ArrayList<Node> recursivePostTraverse(Node root){
        ArrayList<Node> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        if (root.left != null){
            list.addAll(recursivePostTraverse(root.left));
        }
        if (root.right != null){
            list.addAll(recursivePostTraverse(root.right));
        }
        list.add(root);
        return list;
    }


    public static void main(String[] args) {
        Node root = new Node(0);
        Node left1 = new Node(1);
        Node right1 = new Node(2);
        root.left = left1;
        root.right = right1;
        Node left21 = new Node(3);
        Node left22 = new Node(4);
        Node right21 = new Node(5);
        Node right22 = new Node(6);
        left1.left = left21;
        left1.right = left22;
        right1.left = right21;
        right1.right = right22;

        ArrayList<Node> list1 = layerTraverse(root);
        System.out.println("层序遍历");
        for (Node node : list1){
            System.out.print(node.value + " ");
        }
        System.out.println("\n前序遍历");
        ArrayList<Node> list2 = recursivePreTraverse(root);
        for (Node node : list2){
            System.out.print(node.value + " ");
        }
        System.out.println("\n中序遍历");
        ArrayList<Node> list3 = recursiveMiddleTraverse(root);
        for (Node node : list3){
            System.out.print(node.value + " ");
        }
        System.out.println("\n后序遍历");
        ArrayList<Node> list4 = recursivePostTraverse(root);
        for (Node node : list4){
            System.out.print(node.value + " ");
        }
    }
}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}