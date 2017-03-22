import model.Location;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by bt on 2017.03.22..
 */
public class HolidayPlannerTest {
    HolidayPlanner holidayPlanner = new HolidayPlanner();

    ArrayList<Location> allLocation;

    @Test(expected=NullPointerException.class)
    public void locationIsNull() throws Exception {
        allLocation.clear();
        holidayPlanner.routePlanner(allLocation);
    }

    @Test
    public void addedOneLocation() throws Exception {
        Location location1 = new Location("UUU");
        location1.setCounter();
        ArrayList<Location> allLocation = new ArrayList<Location>(Arrays.asList(location1));
        holidayPlanner.routePlanner(allLocation);
        assertEquals(" location name: UUU; relation: null; priorityCounter: 1", holidayPlanner.printableArray(allLocation));

    }

    @Test
    public void addedMoreLocation() throws Exception {
        Location location1 = new Location("UUU");
        Location location2 = new Location("VVV");
        location1.setCounter();
        location2.setCounter();
        location2.setRelation(null);
        location2.setRelation(null);
        ArrayList<Location> allLocation = new ArrayList<Location>(Arrays.asList(location1, location2));
        holidayPlanner.routePlanner(allLocation);
        holidayPlanner.sortTheLocations(allLocation);
        assertEquals(" location name: UUU; relation: null; priorityCounter: 1", holidayPlanner.printableArray(allLocation));

    }

    @Test
    public void checkSetCounter() throws Exception {
        Location location1 = new Location("UUU");
        Location location2 = new Location("VVV");
        location1.setCounter(3);
        location2.setRelation(null);
        ArrayList<Location> allLocation = new ArrayList<Location>(Arrays.asList(location1));
        holidayPlanner.routePlanner(allLocation);
        assertEquals(" location name: UUU; relation: null; priorityCounter: 3", holidayPlanner.printableArray(allLocation));

    }

    @Test
    public void checkPriorityCounterForTheRightNumber() throws Exception {
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

        assertEquals(1, (Object)location1.getCounter());
        assertEquals(2, (Object)location2.getCounter());
        assertEquals(3, (Object)location3.getCounter());
        assertEquals(0, (Object)location4.getCounter());
        assertEquals(1, (Object)location5.getCounter());
        assertEquals(4, (Object)location6.getCounter());
    }


}