package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Qualifier("SpeakerServiceImpl1")
public class SpeakerServiceImpl1 implements SpeakerService {

    public SpeakerServiceImpl1(SpeakerRepository speakerRepository)
    {
        System.out.println("SpeakerServiceImpl1 repository constructor");
        repository=speakerRepository;
    }


    @PostConstruct
    private void initialize()
    {
        System.out.println("we are called after constructors1");
    }

        public SpeakerServiceImpl1()
    {
        System.out.println("SpeakerServiceImpl no arg constructor1");
    }


    private SpeakerRepository repository;

   @Autowired
    public void setRepository(SpeakerRepository repository) {


        System.out.println("SpeakerServiceImpl Setter1");
        this.repository = repository;
    }
            //=new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> FindAll()
    {
        System.out.println("FindAll of SpeakerServiceImpl1");
        return repository.findAll();
    }

}
