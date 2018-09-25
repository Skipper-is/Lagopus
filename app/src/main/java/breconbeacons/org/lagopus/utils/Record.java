package breconbeacons.org.lagopus.utils;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by David Caplin on 25/09/2018.
 */
@Entity(tableName = "record_table")
public class Record {
    @PrimaryKey(autoGenerate = true)
    int id;

    String date, time;
    float lat, lon;
    String name;
    int count;
    String distance, droppings, feathers, other, comments;

    public Record(int id, String date, String time, float lat, float lon, String name, int count, String distance, String droppings, String feathers, String other, String comments) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.count = count;
        this.distance = distance;
        this.droppings = droppings;
        this.feathers = feathers;
        this.other = other;
        this.comments = comments;
    }

    public Record(String date, String time, float lat, float lon, String name, int count, String distance, String droppings, String feathers, String other, String comments) {
        this.date = date;
        this.time = time;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.count = count;
        this.distance = distance;
        this.droppings = droppings;
        this.feathers = feathers;
        this.other = other;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDroppings() {
        return droppings;
    }

    public void setDroppings(String droppings) {
        this.droppings = droppings;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
