import model.Location;

/**
 * Created by bt on 2017.03.21..
 */
public class Main {


    public static void main(String[] args) throws Exception {

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


        HolidayPlanner routeList = new HolidayPlanner();

        routeList.routePlanner(location1);
        routeList.routePlanner(location2);
        routeList.routePlanner(location3);
        routeList.routePlanner(location4);
        routeList.routePlanner(location5);
        routeList.routePlanner(location6);
        routeList.printableArray();

    }
}
