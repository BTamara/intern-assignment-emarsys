import model.Location;

/**
 * Created by bt on 2017.03.21..
 */
public class Main {


    public static void main(String[] args) {

        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        Location location4 = new Location();
        Location location5 = new Location();
        Location location6 = new Location();
        Location location7 = new Location();
        Location location8 = new Location();

        /*location1.setName("UUU");
        location2.setName("VVV");
        location3.setName("WWW");
        location4.setName("XXX");
        location5.setName("YYY");
        location6.setName("ZZZ");

        location1.setRelation(null);        // u =>
        location2.setRelation(location3);   //v => w
        location3.setRelation(location6);   //w => z
        location4.setRelation(location1);   //x => u
        location5.setRelation(location2);   //y => v
        location6.setRelation(null);        //z =>
        */

        location1.setName("AAA");
        location2.setName("BBB");
        location3.setName("CCC");
        location4.setName("DDD");
        location5.setName("EEE");
        location6.setName("FFF");
        location7.setName("GGG");
        location8.setName("HHH");

        location1.setRelation(location7);        // AAA => GGG
        location2.setRelation(location4);        // BBB => DDD
        location3.setRelation(location8);       // CCC => HHH
        location4.setRelation(location3);       // DDD => CCC
        location5.setRelation(location6);       // EEE => FFF
        location6.setRelation(location2);       // FFF => BBB
        location7.setRelation(location5);       // GGG => EEE
        location8.setRelation(null);       // HHH =>



        HolidayPlanner routeList = new HolidayPlanner();

        routeList.routePlanner(location1);
        routeList.routePlanner(location2);
        routeList.routePlanner(location3);
        routeList.routePlanner(location4);
        routeList.routePlanner(location5);
        routeList.routePlanner(location6);
        routeList.routePlanner(location7);
        routeList.routePlanner(location8);
        routeList.printableArray();

    }
}
