package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("SpeakerServiceImpl2")
public class SpeakerServiceimpl2 {
    @Autowired
  @Qualifier("SpeakerServiceImpl")
    private SpeakerService SpeakerServiceImpl;

    public List<Speaker> service() {

        List<Speaker> listA=SpeakerServiceImpl.FindAll();
        return listA;
    }
}
