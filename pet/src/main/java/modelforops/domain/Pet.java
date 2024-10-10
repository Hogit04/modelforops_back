package modelforops.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import modelforops.PetApplication;
import modelforops.domain.PetDeleted;
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

    @PostRemove
    public void onPostRemove() {
        PetDeleted petDeleted = new PetDeleted(this);
        petDeleted.publishAfterCommit();
    }

    public static PetRepository repository() {
        PetRepository petRepository = PetApplication.applicationContext.getBean(
            PetRepository.class
        );
        return petRepository;
    }

    //<<< Clean Arch / Port Method
    public void deletepet() {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
