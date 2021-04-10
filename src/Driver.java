/**
 * Driver used For testing and Showcasing use of data Structure
 * @author Abhrajit Ghosh
 *
 */

public class Driver {
    public static void main(String[] arg)
    {
        Helper.start();
    }


}

    class Helper{
    public static void start(){
    //Create an empty priority queue and save its reference.
       
   //name Comparator
     PriorityQueue pQueue = new  PriorityQueue (new nameComparator());
    //Pass the reference to create method.
        create(pQueue);
    //Pass the reference to display method.
       System.out.println("printing new compare");
      display(pQueue);
    //Sort the queue.
        pQueue.sort();
    //Display the queue again.
        System.out.println("printing new name compare after sort");
        display(pQueue);
    //Delete from the queue.
        pQueue.delete();
    //Display the queue again.
        System.out.println("printing new name compare after delete");
        display(pQueue);
        
    //payComparator
        System.out.println("printing new pay compare");
        PriorityQueue p2Queue = new  PriorityQueue (new payComparator());
        create(p2Queue);
        display(p2Queue);
        pQueue.sort();
        System.out.println("printing new pay compare after sort");
        display(p2Queue);
        
    }
    public static void create(PriorityQueue pQueue) {
    	pQueue.insert(new Employee("James Butt", 30000));
    	pQueue.insert(new Employee("Josephine Darakjy", 4500));
    	pQueue.insert(new Employee("Art Venere", 12000));
    	pQueue.insert(new Employee("Lenna Paprock", 500));
    	pQueue.insert(new Employee("Donette Foller", 30005));
    	pQueue.insert(new Employee("Simona Morasca", 30060));
    	pQueue.insert(new Employee("Kiley Caldarera", 2000));
    	pQueue.insert(new Employee("Leota Dilliard",    10000));
    	pQueue.insert(new Employee("Sage Wieser", 32000));
    	pQueue.insert(new Employee("Kris Marrier", 30030));
    	pQueue.insert(new Employee("Minna Amigon", 3000));
    	pQueue.insert(new Employee("Abel Maclead", 1000));
    	pQueue.insert(new Employee("Mitsue Tollner", 90000));
    	pQueue.insert(new Employee("Graciela Ruta", 100));
    }
    public static void display(PriorityQueue pQueue) {
    	pQueue.print();
    }
   
}

