package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ServiceRestarted extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;

    public ServiceRestarted(ServiceManagement aggregate) {
        super(aggregate);
    }

    public ServiceRestarted() {
        super();
    }
}
//>>> DDD / Domain Event
