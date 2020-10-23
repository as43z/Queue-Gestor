package edu.upc.eetac.dsa;

public class Main {
    public static void main(String[] args) {
        QueueInter<Integer> iq = new QueueInter<Integer>(6);

        System.out.println("\t\t\t\t\t\t QUEUE GESTOR");

        try {
            System.out.println("STARTING AT " + iq);
            iq.push(1);
            System.out.println("FULL QUEUE " + iq);
            iq.push(2);
            System.out.println("FULL QUEUE " + iq);
            iq.push(3);
            System.out.println("FULL QUEUE " + iq);
            iq.push(4);
            System.out.println("FULL QUEUE " + iq);
            iq.push(5);
            System.out.println("FULL QUEUE " + iq);
            iq.push(6);
            System.out.println("FULL QUEUE " + iq);
            System.out.println("SIZE " + iq.size());
            //throw push exception
            iq.push(7);

            iq.pop();
            System.out.println("FULL QUEUE " + iq);
            iq.pop();
            System.out.println("FULL QUEUE " + iq);
            iq.pop();
            System.out.println("FULL QUEUE " + iq);
            iq.pop();
            System.out.println("FULL QUEUE " + iq);
            iq.pop();
            System.out.println("FULL QUEUE " + iq);
            iq.pop();
            System.out.println("FULL QUEUE " + iq);
            System.out.println("SIZE " + iq.size());
            //throw pop exception
            //iq.pop();

        } catch(FullQueueException full){
            full.printStackTrace();
        } catch(EmptyQueueException empty){
            empty.printStackTrace();
        }
    }
}
