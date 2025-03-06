package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class AlarmManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AlarmManagement>> {

    @Override
    public EntityModel<AlarmManagement> process(
        EntityModel<AlarmManagement> model
    ) {
        return model;
    }
}
