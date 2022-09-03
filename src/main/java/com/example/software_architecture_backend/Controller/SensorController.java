package com.example.software_architecture_backend.Controller;

import com.example.software_architecture_backend.Model.Sensor;
import com.example.software_architecture_backend.Repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SensorController {

    @Autowired
    private SensorRepository sensorRepository;

    @PostMapping("/data")
    public void insertData(@RequestBody Sensor sensor) { sensorRepository.insert(sensor); }

    @GetMapping("/")
    public List<Sensor> getSensorReadings() { return sensorRepository.findAll(); }

}
