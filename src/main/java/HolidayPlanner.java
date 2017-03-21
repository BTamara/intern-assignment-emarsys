import model.Location;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bt on 2017.03.21..
 */
public class HolidayPlanner {

    private ArrayList<Location> routeList = new ArrayList<Location>();

    public ArrayList<Location> routePlanner(Location location){

        routeList.add(location);


        for (int i = 0; i < routeList.size(); i++){
            for (int j = 0; j < routeList.size(); j++)
                {
                    if (routeList.get(i).getRelation() == routeList.get(j).getName()) {

                        if(routeList.get(j).getCounter() >= routeList.get(i).getCounter()){
                            routeList.get(j).setCounter(routeList.get(i).getCounter()-1);
                        }else{
                            routeList.get(j).setCounter();
                        }
                    }
                }

        }

        Collections.sort(routeList, new IdComparator());
        return routeList;
    }

    public void printableArray(){
        System.out.println("Your planned route:");
        for(Location location : routeList){
            System.out.println(" location name: " + location.getName()+ "; relation: " + location.getRelation() + "; priorityCounter: " + location.getCounter()
                    );

        }
    }
}
