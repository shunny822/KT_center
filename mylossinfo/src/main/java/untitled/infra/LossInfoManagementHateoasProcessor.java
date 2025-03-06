package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class LossInfoManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LossInfoManagement>> {

    @Override
    public EntityModel<LossInfoManagement> process(
        EntityModel<LossInfoManagement> model
    ) {
        return model;
    }
}
