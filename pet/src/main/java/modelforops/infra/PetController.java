package modelforops.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import modelforops.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/pets")
@Transactional
public class PetController {

    @Autowired
    PetRepository petRepository;

    @RequestMapping(
        value = "/pets/{id}/deletepet",
        method = RequestMethod.DELETE,
        produces = "application/json;charset=UTF-8"
    )
    public Pet deletepet(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/deletepet  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.deletepet();

        petRepository.delete(pet);
        return pet;
    }
}
//>>> Clean Arch / Inbound Adaptor
