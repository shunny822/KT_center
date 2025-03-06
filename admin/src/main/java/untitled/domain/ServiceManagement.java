package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.AdminApplication;
import untitled.domain.ServiceRestarted;
import untitled.domain.ServiceStoped;

@Entity
@Table(name = "ServiceManagement_table")
@Data
//<<< DDD / Aggregate Root
public class ServiceManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long phoneId;

    private String serviceStatus;

    public static ServiceManagementRepository repository() {
        ServiceManagementRepository serviceManagementRepository = AdminApplication.applicationContext.getBean(
            ServiceManagementRepository.class
        );
        return serviceManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void stopService(LossReportCreated lossReportCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        ServiceManagement serviceManagement = new ServiceManagement();
        repository().save(serviceManagement);

        ServiceStoped serviceStoped = new ServiceStoped(serviceManagement);
        serviceStoped.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lossReportCreated.get???()).ifPresent(serviceManagement->{
            
            serviceManagement // do something
            repository().save(serviceManagement);

            ServiceStoped serviceStoped = new ServiceStoped(serviceManagement);
            serviceStoped.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void restartService(LossReportEnd lossReportEnd) {
        //implement business logic here:

        /** Example 1:  new item 
        ServiceManagement serviceManagement = new ServiceManagement();
        repository().save(serviceManagement);

        ServiceRestarted serviceRestarted = new ServiceRestarted(serviceManagement);
        serviceRestarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lossReportEnd.get???()).ifPresent(serviceManagement->{
            
            serviceManagement // do something
            repository().save(serviceManagement);

            ServiceRestarted serviceRestarted = new ServiceRestarted(serviceManagement);
            serviceRestarted.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
