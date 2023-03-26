import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception {

    Queue DatasetQueue = new Queue();
    Queue Premium = new Queue();
    Queue Normal = new Queue();
    LinkedList<Dataset> MyLL = new LinkedList<Dataset>();

    BufferedReader br = new BufferedReader(new FileReader("Customer.csv")); // read file into buffer
    String header = br.readLine(); // read header
    System.out.println(header); // print header
    String data = br.readLine(); // read second line
    while (data != null) {
      StringTokenizer token = new StringTokenizer(data, ",");
      String Name = token.nextToken().trim();
      int Age = Integer.parseInt(token.nextToken().trim());
      String MemberID = token.nextToken().trim();
      String TicketID = token.nextToken().trim();
      String TicketType = token.nextToken().trim();
      String GiftType = token.nextToken().trim();
      Dataset tempProduct = new Dataset(Name, Age, MemberID, TicketID, TicketType, GiftType);

      MyLL.addLast(tempProduct);
      data = br.readLine();
    }
    br.close();

    System.out.println("Number of customer: " + MyLL.size());

    // Store Linked list customer to Queue
    for (int i = 0; i < MyLL.size(); i++) {
      DatasetQueue.enqueue(MyLL.get(i));
    }
    // to display data inside queue
    System.out.println("\nData inside queue:");
    DatasetQueue.display();

    // if data inside DatasetQueue ticket type is premium, put into Premium Queue
    // else put into Normal Queue
    int datasetSize = DatasetQueue.size();
    for (int i = 0; i < datasetSize; i++) {
      Dataset ds = (Dataset) DatasetQueue.dequeue();
      if (ds.getTicketType().equalsIgnoreCase("Premium")) {
        Premium.enqueue(ds);

      } else {
        Normal.enqueue(ds);
      }

    }
    // Display Premium Queue
    System.out.println("\nData inside Premium Queue: ");
    Premium.display();
    System.out.println("\nSize of Premium Queue: " + Premium.size());

    // Display Normal Queue
    System.out.println("\nData inside Normal Queue: ");
    Normal.display();
    System.out.println("\nSize of Normal Queue: " + Normal.size());
    int DequeuedPremium = 0;
    int DequeuedNormal = 0;
    for (int i = 0; i < 5; i++) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("\nPlease Enter your Ticket Type: ");
      String TicketType = myObj.nextLine();
      System.out.println("\nPlease Select your Gift: ");
      String Gift = myObj.nextLine();

      if (TicketType.equalsIgnoreCase("Premium")) {
        Dataset pq = (Dataset) Premium.dequeue();
        System.out.println("\nYour Name is: " + pq.getName());
        System.out.println("\nYour chosen Gift is :" + Gift);
        System.out.println("\nYour Ticket ID is: " + pq.getTicketID());
        DequeuedPremium++;

      } else if (TicketType.equalsIgnoreCase("Normal")) {
        Dataset nq = (Dataset) Normal.dequeue();
        System.out.println("\nYour Name is: " + nq.getName());
        System.out.println("\nYour chosen Gift is : " + Gift);
        System.out.println("\nYour Ticket ID is: " + nq.getTicketID());
        DequeuedNormal++;

      }
    }
    System.out.println("\nPremium Queue after queue manipulation: ");
    Premium.display();
    System.out.println("\nNormal Queue after queue manipulation: ");
    Normal.display();
    System.out.println("\nSize of Normal Queue after data manipulation: " + Normal.size());
    System.out.println("\nSize of Premium Queue after data manipulation: " + Premium.size());
    System.out.println("\nTotal Price of Normal gift given: " + "RM " + DequeuedNormal * 5);
        System.out.println("\nTotal Price of Premium gift given: "+ "RM " + DequeuedPremium * 10);

  }
}
