package model;

/**
 * Created by bt on 2017.03.21..
 */
public class Location {

    private String name;
    private Integer id;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public Location(String name, Integer id){
        this.name = name;
        this.id = id;
    }
}
