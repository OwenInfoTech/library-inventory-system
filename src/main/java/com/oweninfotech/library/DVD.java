package com.oweninfotech.library;

public class DVD extends Item{
    private String director;
    private int runtimeMinutes;

public DVD(int Id, String title, String director, int runtimeMinutes){
    super(Id, title);
    this.director = director;
    this.runtimeMinutes = runtimeMinutes;
}
public String getDirector(){
    return director;
}
public int getRuntimeMinutes(){
    return runtimeMinutes;
}
@Override
    public String getDetails(){
    return getTitle() + ",  directed by " + director + ", " + runtimeMinutes + "min" ;
}

}
