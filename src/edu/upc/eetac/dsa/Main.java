package edu.upc.eetac.dsa;

public class Main {
    public static void main(String[] args) {
        QueueInter<Integer> iq = new QueueInter<Integer>(6);

        System.out.println("\t\t\t\t\t\t QUEUE GESTOR");

        try {
            iq.push(1);

            int p = iq.pop();
            System.out.println(p);

            p = iq.pop();

        } catch(FullQueueException full){
            full.printStackTrace();
        } catch(EmptyQueueException empty){
            empty.printStackTrace();
        }
    }
}
