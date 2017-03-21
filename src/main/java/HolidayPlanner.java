import model.Location;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bt on 2017.03.21..
 */
public class HolidayPlanner {

    private ArrayList<Location> routeList = new ArrayList<Location>();

    public ArrayList<Location> routePlanner(Location location){

        location.setCounter(1);
        routeList.add(location);

        for (Location i : routeList){
            if(i.getRelation() == location.getName()){
                location.setCounter(i.getId()-1);

            }

        }



        Collections.sort(routeList, new IdComparator());
        return routeList;
    }

    public void printableArray(){
        for(Location location : routeList){
            System.out.println("name: " + location.getName() + "; id: " + location.getId()
                    + "; relation: " + location.getRelation());

        }
    }
}
