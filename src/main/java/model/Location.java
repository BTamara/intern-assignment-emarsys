package model;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by bt on 2017.03.21..
 */
public class Location {

    private String name;
    private Integer counter;
    private String relation;

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void setCounter(Integer counter) {
        if(counter!= null){
            this.counter = counter;

        }else{
            this.counter = counter;

        }
    }

    public Integer getId(){

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
