package org.itstep.task03;

import org.itstep.task02.City;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities = new City[0];

    public Country() {
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
    }

    public void addCity(City city){
        cities = Arrays.copyOf(cities, cities.length + 1);
        cities[cities.length - 1] = city;
    }

    public int getInhabitants(){
        int sumInhabitants = 0;
        for (int i = 0; i < cities.length; i++) {
            sumInhabitants += cities[i].getInhabitants();
        }
        return sumInhabitants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent=" + continent +
                ", code=" + code +
                ", capital=" + capital +
                ", cities=" + cities + '}';
    }
}
