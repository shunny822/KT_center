package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.AlarmApplication;

@Entity
@Table(name = "AlarmManagement_table")
@Data
//<<< DDD / Aggregate Root
public class AlarmManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String userEmail;

    private String content;

    public static AlarmManagementRepository repository() {
        AlarmManagementRepository alarmManagementRepository = AlarmApplication.applicationContext.getBean(
            AlarmManagementRepository.class
        );
        return alarmManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void sendAlarm(LossInfoUpdated lossInfoUpdated) {
        //implement business logic here:

        /** Example 1:  new item 
        AlarmManagement alarmManagement = new AlarmManagement();
        repository().save(alarmManagement);

        */

        /** Example 2:  finding and process
        

        repository().findById(lossInfoUpdated.get???()).ifPresent(alarmManagement->{
            
            alarmManagement // do something
            repository().save(alarmManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
