package com.example.listycityunittest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Red Deer", "AB");
    }

    @Test
    public void testAddCity(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        cityList.addCity(new City("Saskatoon", "SK"));
        assertEquals(2, cityList.getCities().size());
    }

    @Test
    public void testDeleteCity(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        cityList.deleteCity(0);
        assertEquals(0, cityList.getCities().size());
    }
}
