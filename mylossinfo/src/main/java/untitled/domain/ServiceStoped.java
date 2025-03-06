package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class ServiceStoped extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;
}
