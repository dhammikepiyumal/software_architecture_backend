package com.example.software_architecture_backend.Repository;

import com.example.software_architecture_backend.Model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends MongoRepository<Sensor, String> {
}
