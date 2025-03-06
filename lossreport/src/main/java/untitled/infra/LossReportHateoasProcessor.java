package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class LossReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LossReport>> {

    @Override
    public EntityModel<LossReport> process(EntityModel<LossReport> model) {
        return model;
    }
}
