package untitled.domain;

import untitled.domain.LossReportCreated;
import untitled.domain.LossReportEnd;
import untitled.LossreportApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="LossReport_table")
@Data

//<<< DDD / Aggregate Root
public class LossReport  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long userId;
    
    
    
    
    private Long phoneId;
    
    
    
    
    private Date reportDate;
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){
    LossInfoManagement lossInfoManagement = LossReportApplication.applicationContext
        .getBean(untitled.external.LossInfoManagementService.class)
        .lossInformation(get??);
    LossInfoManagement lossInfoManagement = LossReportApplication.applicationContext
        .getBean(untitled.external.LossInfoManagementService.class)
        .lossInformation(get??);


        LossReportCreated lossReportCreated = new LossReportCreated(this);
        lossReportCreated.publishAfterCommit();



        LossReportEnd lossReportEnd = new LossReportEnd(this);
        lossReportEnd.publishAfterCommit();

    
    }

    public static LossReportRepository repository(){
        LossReportRepository lossReportRepository = LossreportApplication.applicationContext.getBean(LossReportRepository.class);
        return lossReportRepository;
    }






}
//>>> DDD / Aggregate Root
