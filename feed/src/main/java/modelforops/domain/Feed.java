package modelforops.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import modelforops.FeedApplication;
import modelforops.domain.FeedRegistered;

@Entity
@Table(name = "Feed_table")
@Data
//<<< DDD / Aggregate Root
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Integer qty;

    private Long orderId;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        FeedRegistered feedRegistered = new FeedRegistered(this);
        feedRegistered.publishAfterCommit();
    }

    public static FeedRepository repository() {
        FeedRepository feedRepository = FeedApplication.applicationContext.getBean(
            FeedRepository.class
        );
        return feedRepository;
    }
}
//>>> DDD / Aggregate Root
