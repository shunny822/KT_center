package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    LossInfoManagementRepository lossInfoManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LossReportCreated'"
    )
    public void wheneverLossReportCreated_UpdateLossInfo(
        @Payload LossReportCreated lossReportCreated
    ) {
        LossReportCreated event = lossReportCreated;
        System.out.println(
            "\n\n##### listener UpdateLossInfo : " + lossReportCreated + "\n\n"
        );

        // Sample Logic //
        LossInfoManagement.updateLossInfo(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceStoped'"
    )
    public void wheneverServiceStoped_UpdateLossInfo(
        @Payload ServiceStoped serviceStoped
    ) {
        ServiceStoped event = serviceStoped;
        System.out.println(
            "\n\n##### listener UpdateLossInfo : " + serviceStoped + "\n\n"
        );

        // Sample Logic //
        LossInfoManagement.updateLossInfo(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceRestarted'"
    )
    public void wheneverServiceRestarted_UpdateLossInfo(
        @Payload ServiceRestarted serviceRestarted
    ) {
        ServiceRestarted event = serviceRestarted;
        System.out.println(
            "\n\n##### listener UpdateLossInfo : " + serviceRestarted + "\n\n"
        );

        // Sample Logic //
        LossInfoManagement.updateLossInfo(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
