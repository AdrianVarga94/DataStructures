package DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexandra", 25));
        linkedList.addFirst(new Person("Radu", 27));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }


    }

    private static void queues() {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Radu", 19));
        queue.add(new Person("Ana", 36));

//      showing that peek doesn't remove the head of the queue after retrieving, only poll
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    static record Person(String name, int age){}
}
