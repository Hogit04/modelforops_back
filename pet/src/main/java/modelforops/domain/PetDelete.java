package modelforops.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforops.domain.*;
import modelforops.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetDelete extends AbstractEvent {

    private Long id;

    public PetDelete(Pet aggregate) {
        super(aggregate);
    }

    public PetDelete() {
        super();
    }
}
//>>> DDD / Domain Event
