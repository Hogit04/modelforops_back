package modelforops.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import modelforops.PetApplication;
import modelforops.domain.PetRegisterd;

@Entity
@Table(name = "Pet_table")
@Data
//<<< DDD / Aggregate Root
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Integer qty;

    private String status;

    @PostPersist
    public void onPostPersist() {
        PetRegisterd petRegisterd = new PetRegisterd(this);
        petRegisterd.publishAfterCommit();
    }

    public static PetRepository repository() {
        PetRepository petRepository = PetApplication.applicationContext.getBean(
            PetRepository.class
        );
        return petRepository;
    }
}
//>>> DDD / Aggregate Root
