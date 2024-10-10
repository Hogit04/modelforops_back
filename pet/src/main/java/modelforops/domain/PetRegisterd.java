package modelforops.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforops.domain.*;
import modelforops.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetRegisterd extends AbstractEvent {

    private Long id;

    public PetRegisterd(Pet aggregate) {
        super(aggregate);
    }

    public PetRegisterd() {
        super();
    }
}
//>>> DDD / Domain Event
