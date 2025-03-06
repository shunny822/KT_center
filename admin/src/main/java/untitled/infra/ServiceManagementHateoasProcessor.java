package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class ServiceManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ServiceManagement>> {

    @Override
    public EntityModel<ServiceManagement> process(
        EntityModel<ServiceManagement> model
    ) {
        return model;
    }
}
