package org.example.convertjsonpostgres;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor
public class PeopleController {
    private final PeopleService peopleService;

    @GetMapping("/Create")
    public People createPerson() {
        return peopleService.createPerson();
    }

    @GetMapping("")
    public String getPerson() {
        return "Hello World";
    }
}
