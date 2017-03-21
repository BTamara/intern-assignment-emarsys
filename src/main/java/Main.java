import com.sun.deploy.util.StringUtils;
import model.Location;

/**
 * Created by bt on 2017.03.21..
 */
public class Main {


    public static void main(String[] args) {

        Location location1 = new Location("UUU", null);
        Location location2 = new Location("VVV", 3);
        Location location3 = new Location("WWW", 2);
        Location location4 = new Location("XXX", 2);
        Location location5 = new Location("YYY", 2);
        Location location6 = new Location("ZZZ", null);

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
