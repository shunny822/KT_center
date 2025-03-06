package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LossInfoUpdated extends AbstractEvent {

    private Long id;
    private String status;

    public LossInfoUpdated(LossInfoManagement aggregate) {
        super(aggregate);
    }

    public LossInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
