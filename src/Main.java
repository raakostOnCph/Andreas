public class Main {

    public static void main(String[] args) {
	// write your code here

//     Node node1 = new Node("hej");
//     Node node2 = new Node("med");
//     Node node3 = new Node("dig");
//
//     node1.next = node2;
//     node2.next = node3;
//
//     node3.previous = node2;
//     node2.previous = node1;
//
//     Node n = node1;
//
//     Liste liste = new Liste();
//
//     liste.head = node1;
//     liste.tail = node3;

//        liste.insertFromHead(new Node("1"));
//        liste.insertFromHead(new Node("2"));
//        liste.insertFromHead(new Node("3"));
//        liste.insertFromHead(new Node("4"));


Liste liste = new Liste("virker det her mon");

        System.out.println(liste.printFromTail());

        liste.insertFromHead("du");
        System.out.println(liste.printFromTail());

        liste.insertFromHead("onkel jørgen");
        System.out.println(liste.printFromTail());



    }


}
