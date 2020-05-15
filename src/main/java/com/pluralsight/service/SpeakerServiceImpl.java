package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("SpeakerServiceImpl")
public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerServiceImpl(SpeakerRepository speakerRepository)
    {
        System.out.println("SpeakerServiceImpl repository constructor");
        repository=speakerRepository;
    }


    @PostConstruct
    private void initialize()
    {
        System.out.println("we are called after constructors");

    }

        public SpeakerServiceImpl()
    {
        System.out.println("SpeakerServiceImpl no arg constructor");
    }

    private SpeakerRepository repository;

   @Autowired
    public void setRepository(SpeakerRepository repository) {


        System.out.println("SpeakerServiceImpl Setter");
        this.repository = repository;
    }
            //=new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> FindAll()
    {
        System.out.println("FindAll of SpeakerServiceImpl");
       return repository.findAll();
    }

}
