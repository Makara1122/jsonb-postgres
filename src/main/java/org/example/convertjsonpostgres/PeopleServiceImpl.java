package org.example.convertjsonpostgres;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;



@Service
@AllArgsConstructor
public class PeopleServiceImpl implements PeopleService{
    @Override
    public People getPerson(String id) {
        return null;
    }

    @Override
    public People createPerson() {
        People makara = new People("1","Makara", new Address("12345", "Phnom Penh"));
        makara = peopleRepository.save(makara);

        Optional<People> studentEntityOptional = peopleRepository.findById(makara.getId());

        if (studentEntityOptional.isPresent()) {
            makara = studentEntityOptional.get();
        } else {
            throw new RuntimeException("Failed to retrieve the newly created person from the database");
        }

        return makara;
    }

    private final PeopleRepository peopleRepository;




}
