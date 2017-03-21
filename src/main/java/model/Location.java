package model;

/**
 * Created by bt on 2017.03.21..
 */
public class Location {

    private String name;
    private Integer counter = 0;
    private String relation;

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void setCounter() {
        counter ++;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }


    public Integer getCounter(){

        return counter;
    }

    public String getRelation(){

        return relation;
    }

    public void setRelation(Location location){
        if(location != null){
            this.relation = location.getName();
        }else{
            this.relation = "No relation";
        }
    }

    public Location(String name)
    {
        this.name = name;
    }

    public  Location(){

    }
}
