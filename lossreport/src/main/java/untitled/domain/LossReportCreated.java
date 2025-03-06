package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LossReportCreated extends AbstractEvent {

    private Long id;
    private Long phoneId;
    private Long userId;
    private Date reportDate;

    public LossReportCreated(LossReport aggregate) {
        super(aggregate);
    }

    public LossReportCreated() {
        super();
    }
}
//>>> DDD / Domain Event
