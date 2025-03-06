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
    ServiceManagementRepository serviceManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LossReportCreated'"
    )
    public void wheneverLossReportCreated_StopService(
        @Payload LossReportCreated lossReportCreated
    ) {
        LossReportCreated event = lossReportCreated;
        System.out.println(
            "\n\n##### listener StopService : " + lossReportCreated + "\n\n"
        );

        // Sample Logic //
        ServiceManagement.stopService(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LossReportEnd'"
    )
    public void wheneverLossReportEnd_RestartService(
        @Payload LossReportEnd lossReportEnd
    ) {
        LossReportEnd event = lossReportEnd;
        System.out.println(
            "\n\n##### listener RestartService : " + lossReportEnd + "\n\n"
        );

        // Sample Logic //
        ServiceManagement.restartService(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
