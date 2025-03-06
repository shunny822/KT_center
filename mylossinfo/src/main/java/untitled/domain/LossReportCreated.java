package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class LossReportCreated extends AbstractEvent {

    private Long id;
    private Long phoneId;
    private Long userId;
    private Date reportDate;
}
