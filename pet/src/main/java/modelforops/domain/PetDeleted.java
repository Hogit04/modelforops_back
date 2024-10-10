package modelforops.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforops.domain.*;
import modelforops.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetDeleted extends AbstractEvent {

    private Long id;

    public PetDeleted(Pet aggregate) {
        super(aggregate);
    }

    public PetDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
