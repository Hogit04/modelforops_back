package modelforops.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforops.domain.*;
import modelforops.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FeedRegistered extends AbstractEvent {

    private Long id;

    public FeedRegistered(Feed aggregate) {
        super(aggregate);
    }

    public FeedRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
