package com.example.software_architecture_backend.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "sensor")
public class Sensor {

    @Id
    private String id;

    private String sensor_id;

    private String date;

    private String data_value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value;
    }
}
