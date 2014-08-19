package C42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by saurav on 11/8/14.
 */

public class ParkingClient {

    ParkingServer server;
    boolean isInit;

    public void fromFile(String fil) throws Exception{

        File file = new File(fil);

        if(!file.exists()){
            throw new FileNotFoundException("Not a valid location ");
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while(line != null){

        }

        br.close();
    }

    public void interactive(){

    }

//    public void options(){
//
//        try{
//
//            switch (opt){
//
//                case create_parking_lot : break;
//                case park: server.park(car);
//                case leave:
//                case registration_numbers_for_cars:
//                case slot_numbers_for_cars_with_colour:
//                case status:
//
//                default:
//                    System.out.println("not valid request");
//
//            }
//        }catch (Exception){
//
//        }
//    }


}
