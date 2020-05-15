package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("SpeakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll()
    {
        List<Speaker> speakers=new ArrayList<>();
        Speaker speaker=new Speaker();

        speaker.setFirstName("Saurabh");
        speaker.setLatsName("Mishra");

        speakers.add(speaker);

        System.out.println(speakers.get(0).getFirstName());
        return speakers;
    }
}
