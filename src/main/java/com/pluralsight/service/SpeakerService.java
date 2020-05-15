package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


public interface SpeakerService {
    List<Speaker> FindAll();
}
