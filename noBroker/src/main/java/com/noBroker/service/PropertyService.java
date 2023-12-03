package com.noBroker.service;

import com.noBroker.entity.Property;
import com.noBroker.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;

    @Autowired
    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public Property saveProperty(Property property) {
        // You can add business logic or validation here before saving
        return propertyRepository.save(property);
    }
}
