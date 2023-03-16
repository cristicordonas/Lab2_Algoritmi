
public class Main {
    public static void main(String[] args) {
        //EX 1 STIVA
        Stack stiva = new Stack();
        int x = stiva.POSTFIX_EXP("5 1 2 + 4 * + 3 -");
        System.out.println("Result of expresion = " + x);
        //EX 2 LABIRINT
        int[][] myMaze = new int[5][6];
        int[][] myPlaces = new int[5][6];
        myMaze[0][2]=1;
        myMaze[0][4]=1;
        myMaze[1][0]=1;
        myMaze[1][1]=1;
        myMaze[1][2]=1;
        myMaze[1][4]=1;
        myMaze[2][0]=0;
        myMaze[2][2]=1;
        myMaze[2][3]=1;
        myMaze[2][4]=1;
        myMaze[3][0]=1;
        for(int i=0;i<=5;i++)
            myMaze[4][i]=1;
        System.out.println("The maze:");
        for(int i=0;i<5;i++) {
            for(int j=0;j<6;j++){
                System.out.print(myMaze[i][j] + " ");
            }
            System.out.print("\n");
        }
        TheMaze maze = new TheMaze(myMaze,myPlaces,4,5);
        maze.Check(1,0);
        System.out.println("Result: ");
        System.out.println(maze.getStack());
        //EX 3 LISTA SIMPLA
        SimplyLinkedList listaSimpla = new SimplyLinkedList();
        listaSimpla.insertFirst(1);
        listaSimpla.insertLast(2);
        listaSimpla.insertLast(5);
        listaSimpla.insertAfter(listaSimpla.getHead().getNext(),3);
        listaSimpla.insertAfter(listaSimpla.getHead().getNext().getNext(),4);
        listaSimpla.printList();
        listaSimpla.deleteAfter(listaSimpla.getHead());
        listaSimpla.printList();
        listaSimpla.insertAfter(listaSimpla.getHead().getNext(),2);
        listaSimpla.printList();
        listaSimpla.deleteFirst();
        listaSimpla.deleteLast();
        listaSimpla.printList();
        //LISTA DUBLA
        DoublyLinkedList listaDubla = new DoublyLinkedList();
        listaDubla.insertFirst(6);
        listaDubla.insertLast(9);
        listaDubla.insertLast(10);
        listaDubla.insertAfter(listaDubla.getHead(),7);
        listaDubla.insertAfter(listaDubla.getHead().getNext(),8);
        listaDubla.printlist(listaDubla.getHead());
        listaDubla.deleteNode(listaDubla.getHead().getNext());
        listaDubla.printlist(listaDubla.getHead());
        listaDubla.insertAfter(listaDubla.getHead().getNext(),7);
        listaDubla.printlist(listaDubla.getHead());
        listaDubla.deleteNode(listaDubla.getHead());
        listaDubla.deleteNode(listaDubla.getLast());
        listaDubla.printlist(listaDubla.getHead());
        //EX 4 LISTA CIRCULARA
        DoublyLinkedList listaCirculara = new DoublyLinkedList();
        listaCirculara.insertFirst(11);
        listaCirculara.insertLast(13);
        listaCirculara.insertLast(15);
        listaCirculara.insertAfter(listaCirculara.getHead(),12);
        listaCirculara.insertAfter(listaCirculara.getLast().getPrev(),14);
        listaCirculara.circularList();
        listaCirculara.deleteNode(listaCirculara.getHead().getNext());
        listaCirculara.circularList();
        listaCirculara.insertAfter(listaCirculara.getHead().getNext(),12);
        listaCirculara.circularList();
        listaCirculara.deleteNode(listaCirculara.getLast().getNext());
        listaCirculara.deleteNode(listaCirculara.getHead().getPrev());
        listaCirculara.circularList();
    }
}