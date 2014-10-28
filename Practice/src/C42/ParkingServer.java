package C42;

import java.util.*;

/**
 * Created by saurav on 11/8/14.
 */
public class ParkingServer {

    private static int emptySlots;
    private static int totalSlots;
    private HashSet<Integer>occupiedSlots ;  //Space not matter Unique and O(1) access
    private static Map<Integer,Car>occpCarInfo = new HashMap<Integer,Car>(); //Information of car for that slots contains


    //intializing with size

    ParkingServer(int slots){
        totalSlots = slots;
        emptySlots = 0;
        occupiedSlots = new HashSet<Integer>(totalSlots);
        occpCarInfo =  new HashMap<Integer,Car>(totalSlots);
    }

    ParkingServer(){
        totalSlots = 6;
        emptySlots = 0;
        occupiedSlots = new HashSet<Integer>(totalSlots);
        occpCarInfo =  new HashMap<Integer,Car>(totalSlots);
    }

    public String  leave(int slot) throws ParkingException{

        if( !occpCarInfo.containsKey(slot) || !occupiedSlots.contains(slot)){
            throw new ParkingException("Slot is already Empty ");
        }else{
            occpCarInfo.remove(slot);
            occupiedSlots.remove(slot);
            emptySlots++;
            return "SUCCESS";
        }



    }

    public String park(String str) throws  ParkingException{

        if(emptySlots == totalSlots){
            throw new ParkingException(" Parking lot is full ");
        }else{
            Car car = popCar(str);
            for(int i=1;i<=totalSlots;i++){
                if(!occupiedSlots.contains(i)){
                    occupiedSlots.add(i);
                    occpCarInfo.put(i,car);
                    emptySlots++;
                    return "Success";
                }
            }
        }
        return "Failure";
    }

    public String getRegNo(String color) throws ParkingException{

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer,Car> entry : occpCarInfo.entrySet()){

            if(entry.getValue().getColor().equalsIgnoreCase(color)){
                sb.append(entry.getValue().getRegNo());
                sb.append(" ");
            }
        }

        if(sb.length() == 0){
            throw new ParkingException(" Car is not found for Color   " + color);
        }
        return sb.toString();
    }

    public Car getCar(int slot){
        return occpCarInfo.get(slot);
    }

    // regNo is always unique hence always have one entry
    public String getColor(String regNo) throws Exception{

        for(Map.Entry<Integer,Car> entry : occpCarInfo.entrySet()){

            if(entry.getValue().getRegNo().equalsIgnoreCase(regNo)){
               return entry.getValue().getColor();
            }

        }
        return null;
    }

    public String [] parse(String str){
        return str.split(" ");
    }

    public Car popCar(String str) throws ParkingException{
       String st [] = parse(str);
       if(st.length != 3){
          throw new ParkingException("[ Exception : Illegal no of Argument ]");
       }
       Car car = new Car();
       car.setColor(st[2]);
       car.setRegNo(st[1]);
       return car;
    }
}
