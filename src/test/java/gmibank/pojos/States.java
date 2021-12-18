package gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class States {

    private int id;
    private String name;

    private String tpcountry;
    /*{
    "id": 103694,
    "name": "xxxxxxxVirginiaxxxxx",
    "tpcountry": null
}*/

    public States() {
    }

    public States(int id, String name, String tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }

    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(String tpcountry) {
        this.tpcountry = tpcountry;
    }

    @Override
    public String toString() {
        return "StatePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tpcountry='" + tpcountry + '\'' +
                '}';
    }
}


