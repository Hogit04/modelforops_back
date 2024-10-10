package modelforops.infra;

import modelforops.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FeedHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Feed>> {

    @Override
    public EntityModel<Feed> process(EntityModel<Feed> model) {
        return model;
    }
}
