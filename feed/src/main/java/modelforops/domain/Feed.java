package modelforops.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import modelforops.FeedApplication;

@Entity
@Table(name = "Feed_table")
@Data
//<<< DDD / Aggregate Root
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reptileId;

    private Integer reptileId;

    private Date feedDate;

    private Double qty;

    public static FeedRepository repository() {
        FeedRepository feedRepository = FeedApplication.applicationContext.getBean(
            FeedRepository.class
        );
        return feedRepository;
    }
}
//>>> DDD / Aggregate Root
