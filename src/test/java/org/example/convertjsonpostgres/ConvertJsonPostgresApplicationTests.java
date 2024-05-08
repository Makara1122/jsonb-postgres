package org.example.convertjsonpostgres;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@AllArgsConstructor
class ConvertJsonPostgresApplicationTests {
    private final PeopleRepository peopleRepository;

    @Test
    void contextLoads() {
    }



}
