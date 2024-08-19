package com.example.app.service;

import com.example.app.model.Laptop;
import com.example.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }
}
