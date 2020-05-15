import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.service.SpeakerServiceimpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Application {
//    @Autowired
//    @Qualifier("SpeakerService1")
//    SpeakerService service;
    public static void main(String args[]) {



        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


       // appContext.refresh();
     //  SpeakerService service = appContext.getBean("SpeakerService", SpeakerService.class);
        SpeakerServiceimpl2 service2 = appContext.getBean( SpeakerServiceimpl2.class);

        List<Speaker> listA=service2.service();

        appContext.close();


//        System.out.println(service);
////        SpeakerService service1 = appContext.getBean("SpeakerService", SpeakerService.class);
////        System.out.println(service1);
//        //   SpeakerService service=new SpeakerServiceImpl();
//
//        List<Speaker> listA = service.FindAll();

     System.out.println(listA.get(0).getFirstName());


    }

}
