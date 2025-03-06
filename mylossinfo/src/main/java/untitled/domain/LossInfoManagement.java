package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.MylossinfoApplication;
import untitled.domain.LossInfoUpdated;

@Entity
@Table(name = "LossInfoManagement_table")
@Data
//<<< DDD / Aggregate Root
public class LossInfoManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long phoneId;

    private Date reportDate;

    private String status;

    public static LossInfoManagementRepository repository() {
        LossInfoManagementRepository lossInfoManagementRepository = MylossinfoApplication.applicationContext.getBean(
            LossInfoManagementRepository.class
        );
        return lossInfoManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateLossInfo(LossReportCreated lossReportCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        LossInfoManagement lossInfoManagement = new LossInfoManagement();
        repository().save(lossInfoManagement);

        LossInfoUpdated lossInfoUpdated = new LossInfoUpdated(lossInfoManagement);
        lossInfoUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lossReportCreated.get???()).ifPresent(lossInfoManagement->{
            
            lossInfoManagement // do something
            repository().save(lossInfoManagement);

            LossInfoUpdated lossInfoUpdated = new LossInfoUpdated(lossInfoManagement);
            lossInfoUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateLossInfo(ServiceStoped serviceStoped) {
        //implement business logic here:

        /** Example 1:  new item 
        LossInfoManagement lossInfoManagement = new LossInfoManagement();
        repository().save(lossInfoManagement);

        LossInfoUpdated lossInfoUpdated = new LossInfoUpdated(lossInfoManagement);
        lossInfoUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(serviceStoped.get???()).ifPresent(lossInfoManagement->{
            
            lossInfoManagement // do something
            repository().save(lossInfoManagement);

            LossInfoUpdated lossInfoUpdated = new LossInfoUpdated(lossInfoManagement);
            lossInfoUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateLossInfo(ServiceRestarted serviceRestarted) {
        //implement business logic here:

        /** Example 1:  new item 
        LossInfoManagement lossInfoManagement = new LossInfoManagement();
        repository().save(lossInfoManagement);

        LossInfoUpdated lossInfoUpdated = new LossInfoUpdated(lossInfoManagement);
        lossInfoUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(serviceRestarted.get???()).ifPresent(lossInfoManagement->{
            
            lossInfoManagement // do something
            repository().save(lossInfoManagement);

            LossInfoUpdated lossInfoUpdated = new LossInfoUpdated(lossInfoManagement);
            lossInfoUpdated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
