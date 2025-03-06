package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LossReportEnd extends AbstractEvent {

    private Long id;
    private Long phoneId;
    private Long userId;

    public LossReportEnd(LossReport aggregate) {
        super(aggregate);
    }

    public LossReportEnd() {
        super();
    }
}
//>>> DDD / Domain Event
