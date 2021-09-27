package com.springboot_cities.cities.model;

public class city {
    private Integer id = null;
    private String name = null;

    private Integer idCountry = null;
    private String countryName;
    public  static  Integer autoincrementId =  0 ;

    city(Integer idCountry) {

    }

    public city(String name, Integer idCountry, String countryName) {
        city.autoincrementId++;
        this.id = city.autoincrementId;
        this.name = name;
        this.idCountry = idCountry;
        this.countryName = countryName;
    }

    public  Integer  getId () {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getidCountry() {
        return idCountry;
    }

    public void setidCountry(Integer idCountry) {
        this.idCountry = country.autoincrementId;
    }

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityId=" + idCountry +
                ", cityName=" + this.getCountryName() +
                ' } ' ;
    }
}
