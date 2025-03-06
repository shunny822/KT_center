package untitled.external;

import java.util.Date;
import lombok.Data;

@Data
public class LossInfoManagement {

    private Long id;
    private Long userId;
    private Long phoneId;
    private Date reportDate;
    private String status;
}
