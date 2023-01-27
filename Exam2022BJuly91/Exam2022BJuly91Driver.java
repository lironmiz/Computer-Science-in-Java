//*******************************************************
// tester for the class
// Semester 2022B
// Author: liron mizrahi
//*******************************************************
public class Exam2022BJuly91Driver
{
    public static void main(String[] args)
    {
        Exam2022BJuly91 classObject = new Exam2022BJuly91();
        // Ex1
        int[] stations = new int[9];
        stations[0] = 2;
        stations[1] = 4;
        stations[2] = 8;
        stations[3] = 3;
        stations[4] = 10;
        stations[5] = 1;
        stations[6] = 12;
        stations[7] = 3;
        stations[8] = 2;
        int step1= 3;
        int step2 = 2;
        int limit = 4;
        System.out.print(classObject.cheapRt(stations,3, 2, 4)); // output ->
        // 0 2 4 6 8 =34
        // 0 2 5 8 =13
        // 0 3 5 8 =8
        // 0 3 6 8 =19
        // System.out.print(classObject.cheapRt(stations, 3, 6, 4)); // Integer.MAX_VALUE
        // Ex2
        int[] arr = new int[5];
        arr[0] = -4;
        arr[1] =  1;
        arr[2] = -8;
        arr[3] = 9;
        arr[4] = 6;
        System.out.print(classObject.findTriplet(arr));
        // output 
        // -4 -8 9
        // 288
        // tree
        Node root = new Node(60);
        root._rightSon = new Node(40);
        root._leftSon = new Node(20);
        root._leftSon._leftSon = new Node(10);
        root._leftSon._leftSon._leftSon = new Node(15);
        root._leftSon._rightSon = new Node(30);
        root._leftSon._rightSon._leftSon = new Node(10);
        root._leftSon._rightSon._leftSon._rightSon = new Node(30);
        root._leftSon._rightSon._rightSon = new Node(5);
        // Ex3 Section A
        System.out.println(root.f(root, 30));// true
        // Ex3 Section C
        System.out.println(root.secret(root,25));// 0
        // Ex3 Section D
        System.out.println(root.what(root, 10)); // 50
        // Ex4
        A a;
        B b;
        // Section A
        a = new B(24);        
        System.out.println(a._x); // 25
        // Section B
        a = new B(3);
        int k = a.f(a.f(6));
        System.out.println(k); // 14
        // Section C
        b = new D(5);
        k = b.f(b.f(4));
        System.out.println(k); // 12
        // Section D
        a = new D(8);
        b = new B(6);
        b.f(a);
        System.out.println(b._x); // 7
        // Section E:
        D d = new D(4);
        a = new D(2);
        ((A)d).f(a);
        System.out.println(d._x); // 5
        //Ex5
        // first list
        IntNode node4 = new IntNode(4, null);
        IntNode node3 = new IntNode(5, node4);
        IntNode node2 = new IntNode(2, node3);
        IntNode node1 = new IntNode(8, node2);
        IntList list = new IntList();
        list.secret(); // list = 4->5->2->8
        // second list
        IntNode list2Node8 = new IntNode(4, null);
        IntNode list2Node7 = new IntNode(1, list2Node8);
        IntNode list2Node6 = new IntNode(2, list2Node7);
        IntNode list2Node5 = new IntNode(7, list2Node6);
        IntNode list2Node4 = new IntNode(9, list2Node5);
        IntNode list2Node3 = new IntNode(2, list2Node4);
        IntNode list2Node2 = new IntNode(5, list2Node3);
        IntNode list2Node1 = new IntNode(4, list2Node2);
        IntList list2 = new IntList();
        System.out.println(list2.what()); // false
    }// end of method main
}// end of class Exam2022BJuly91Driver
