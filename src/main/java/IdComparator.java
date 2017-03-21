import model.Location;

import java.util.Comparator;

/**
 * Created by bt on 2017.03.21..
 */
public class IdComparator implements Comparator<Location> {

    public int compare(Location loc1, Location loc2){
        return loc1.getCounter().compareTo(loc2.getCounter());

    }
}
