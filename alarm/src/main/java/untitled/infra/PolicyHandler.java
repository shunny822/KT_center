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
    AlarmManagementRepository alarmManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LossInfoUpdated'"
    )
    public void wheneverLossInfoUpdated_SendAlarm(
        @Payload LossInfoUpdated lossInfoUpdated
    ) {
        LossInfoUpdated event = lossInfoUpdated;
        System.out.println(
            "\n\n##### listener SendAlarm : " + lossInfoUpdated + "\n\n"
        );

        // Sample Logic //
        AlarmManagement.sendAlarm(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
