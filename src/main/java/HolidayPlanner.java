import exception.GivenLocationIsNull;
import exception.ThereIsNotAtLeastOneLocation;
import model.Location;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bt on 2017.03.21..
 */
public class HolidayPlanner {

    private ArrayList<Location> routeList = new ArrayList<Location>();

    public ArrayList<Location> routePlanner(ArrayList<Location> routeList) throws Exception {

        if(routeList.isEmpty()){
            throw new ThereIsNotAtLeastOneLocation("For planning a route need at least one destination");
        }
        if(routeList.size() == 1){
            return routeList;
        }
        for (int i = 0; i < routeList.size(); i++){
            for (int j = 0; j < routeList.size(); j++) {
                if(routeList.get(i) ==null)
                    throw new GivenLocationIsNull("Please give a location what is not null");
                if (routeList.get(i).getRelation() == routeList.get(j).getName()) {
                        if(routeList.get(j).getCounter() <= routeList.get(i).getCounter()){
                            routeList.get(j).setCounter(routeList.get(i).getCounter()+1);
                        }else{
                            routeList.get(j).setCounter();
                        }
                    }
                }
        }
        return routeList;
    }

    public ArrayList<Location> sortTheLocations(ArrayList<Location> routeList){
        Collections.sort(routeList, new IdComparator());
        return  routeList;

    }

    public String printableArray(ArrayList<Location> routeList){
        String result = null;
        System.out.println("Your planned route:");
        for(Location location : routeList){
            result = " location name: " + location.getName()+ "; relation: "
                    + location.getRelation() + "; priorityCounter: " + location.getCounter();

            System.out.println(result);
        }return  result;
    }
}
