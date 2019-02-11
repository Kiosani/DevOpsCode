package com.kravchenko.repository;

import com.kravchenko.model.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, String> {
}
