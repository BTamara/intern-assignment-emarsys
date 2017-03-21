import model.Location;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bt on 2017.03.21..
 */
public class Main {


    public static void main(String[] args) throws Exception {

        HolidayPlanner holidayPlanner = new HolidayPlanner();

        Location location1 = new Location("UUU");
        Location location2 = new Location("VVV");
        Location location3 = new Location("WWW");
        Location location4 = new Location("XXX");
        Location location5 = new Location("YYY");
        Location location6 = new Location("ZZZ");

        location1.setRelation(null);        // u =>
        location2.setRelation(location3);   //v => w
        location3.setRelation(location6);   //w => z
        location4.setRelation(location1);   //x => u
        location5.setRelation(location2);   //y => v
        location6.setRelation(null);        //z =>

        ArrayList<Location> allLocation = new ArrayList<Location>(Arrays.asList(location1, location2, location3, location4,location5, location6));
        holidayPlanner.routePlanner(allLocation);
        holidayPlanner.sortTheLocations(allLocation);
        holidayPlanner.printableArray(allLocation);

    }
}
