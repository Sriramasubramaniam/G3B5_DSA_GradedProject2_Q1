import java.util.Scanner;
import Construction.ConstructionOrder;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConstructionOrder constructionOrder = new ConstructionOrder();
        System.out.println("enter the total no of floors in the building");
        final int numberOfFloors = sc.nextInt();
        for (int i = 0; i < numberOfFloors; i++) {
            System.out.println("enter the floor size given on day : "+(i+1));
            constructionOrder.insertIntoQueue(sc.nextInt());
        }
        constructionOrder.compareFloorSize(numberOfFloors);
        sc.close();
    }
}
