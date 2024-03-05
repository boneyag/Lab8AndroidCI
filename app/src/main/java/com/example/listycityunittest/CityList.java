package com.example.listycityunittest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a custom list class for City objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */


    public void addCity(City city){
        if (cities.contains((city))) {
            throw new IllegalArgumentException();
        } else {
            cities.add(city);
        }
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Delete a city for a given position of the ArrayList
     * @param position integer
     */
    public void deleteCity(int position){
//        if ((position > -1) && (position < cities.size())){
//            cities.remove(position);
//        }
//        else{
//            throw new IllegalArgumentException("Invalid array index - must be between zero and size-1 ");
//        }
    }
}
