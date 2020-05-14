import java.util.*;
import java.io.IOException;
import java.sql.Time;
import java.time.*;

public class Bookstore {

    private String name;
    private String adress;
    private String day;
    private ArrayList<String> titles;
    private int sqft;
    private String hours;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public Integer getSqft() {
        return sqft;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public void getTitles() {

        for (int i = 0; i < 10; i++) {
            System.out.println(titles.get(i));
        }
    }
}
