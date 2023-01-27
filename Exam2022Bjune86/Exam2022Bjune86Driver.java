//*******************************************************
// Exam2022Bjune86Driver.java
// tester for the exam 
// Author: liron mizrahi
//*******************************************************
public class Exam2022Bjune86Driver
{
    public static void main(String[] args)
    {
        Exam2022Bjune86 classObject = new Exam2022Bjune86();
        int[][] mat = { {12,22,23,54,11}, {43,35,21,20,30}, {34,23,43,22,30}, {25,31,2,20,34}, {10,22,10,11,10}, {40,13,3,1,23} };
        System.out.println(classObject.maxPath(mat));
        int[] arr = new int[9];
        arr[0] = 35;
        arr[1] = 17;
        arr[2] = 13;
        arr[3] = 252;
        arr[4] = 4;
        arr[5] = 128;
        arr[6] = 7;
        arr[7] = 3;
        arr[8] = 81;
        classObject.sortmod(arr, 10);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        // first tree
        Node root = new Node(20);
        root._leftSon = new Node(30);
        root._rightSon = new Node(5);
        root._rightSon._leftSon = new Node(50);
        root._rightSon._rightSon = new Node(10);
        root._rightSon._rightSon._leftSon = new Node(40);
        System.out.println(root.what(root));
        // second tree
        Node root1 = new Node(2);
        root1._leftSon = new Node(15);
        root1._rightSon = new Node(4);
        root1._rightSon._leftSon = new Node(30);
        root1._rightSon._rightSon = new Node(7);
        System.out.println(root.what(root1));
        // three tree
        Node root2 = new Node(42);
        root2._leftSon = new Node(24);
        root2._leftSon._rightSon = new Node(45);
        root2._leftSon._leftSon = new Node(10);
        root2._leftSon._leftSon._leftSon = new Node(5);
        root2._rightSon = new Node(41);
        root2._rightSon._rightSon = new Node(6);
        root2._rightSon._leftSon = new Node(38);
        root2._rightSon._leftSon._rightSon = new Node(11);
        System.out.println(root.what1(root2));
        A ab = new B(2);
        B bb = new B(3);
        A ac = new C(4);
        B bc = new C(5);
        System.out.println(ab.f(bb));
        System.out.println(ab.f((A)bb));
        System.out.println(bb.f(ab));
        System.out.println(bb.f(bc));
        System.out.println(ac.f(bc));
        System.out.println(ac.f(bb));
        System.out.println(bc.f(ab));
        System.out.println(bc.f(bb));
        System.out.println(bc.f((C)ab));
        IntNode node12 = new IntNode(0,null);
        IntNode node11 = new IntNode(0,node12);
        IntNode node10 = new IntNode(1, node11);
        IntNode node9 = new IntNode(1, node10);
        IntNode node8 = new IntNode(1, node9);
        IntNode node7 = new IntNode(1, node8);
        IntNode node6 = new IntNode(0, node7);
        IntNode node5 = new IntNode(1, node6);
        IntNode node4 = new IntNode(1, node5);
        IntNode node3 = new IntNode(0, node4);
        IntNode node2 = new IntNode(1, node3);
        IntNode node1 = new IntNode(1, node2);
        IntList list = new IntList();
        list.setHead(node1);
        System.out.println(list.what(0));
    }// end of method main
}// end of class Exam2022Bjune86Driver
