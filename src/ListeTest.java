import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();
    Node node = new Node("1");

    @org.junit.jupiter.api.Test
    void isEmpty()
    {
        assertEquals(true, liste.isEmpty());

        liste.head = node;
        liste.tail = node;

        assertEquals(false, liste.isEmpty());
    }

    @Test
    void insertFromHead()
    {
        liste.insertFromHead(new Node("1"));
        assertEquals("1", liste.printFromHead());
    }

    @Test
    void removeFromHead()
    {
        liste.removeFromHead();
        assertEquals("",liste.printFromHead());

        liste.insertFromHead(new Node("1"));
        liste.removeFromHead();
        assertEquals("",liste.printFromHead());



        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));
        liste.insertFromHead(new Node("4"));

        liste.removeFromHead();

        assertEquals("3 2 1", liste.printFromHead());

    }

    @Test
    void smartConstructor()
    {
        Liste smartListe = new Liste("hold da op mand");

        assertEquals("hold da op mand", smartListe.printFromTail());
    }

    @Test
    void insertStringFromHead()
    {
        liste.insertFromHead("hej");
        assertEquals("hej", liste.printFromTail());
    }


    @Test
    void smartInsertFromHead()
    {
        liste.insertFromHead("hej med dig");
        assertEquals(false, liste.onlyOne());
        assertEquals("hej med dig", liste.printFromTail());


    }
}