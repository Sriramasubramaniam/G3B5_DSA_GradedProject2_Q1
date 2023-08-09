package Construction;

import java.util.*;

public class ConstructionOrder {
    Queue<Integer> floorSizes = new LinkedList<>();
    ArrayList<Integer> waitingArray = new ArrayList<>();
 public void insertIntoQueue(int value){
     floorSizes.add(value);
 }
 private int findLargestFloor(int largestFloor){
     int currentLargestFloor = largestFloor;
     if(waitingArray.contains(largestFloor)){
         System.out.print(currentLargestFloor);
         System.out.print(" ");
         currentLargestFloor-=1;
         currentLargestFloor = findLargestFloor(currentLargestFloor);
     }else{
         System.out.println(" ");
     }
     return currentLargestFloor;
 }
 public void compareFloorSize(int totalFloors){
     int largestFloor = totalFloors;
     for(int i = 1; i<=totalFloors; i++){
         int currentElement = floorSizes.poll();
         waitingArray.add(currentElement);
         System.out.println("Day: "+i);
         largestFloor =  findLargestFloor(largestFloor);
     }

 }
}
