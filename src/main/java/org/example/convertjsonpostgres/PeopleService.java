package org.example.convertjsonpostgres;

public interface PeopleService {
    People getPerson(String id);
    People createPerson();
}
