package dio.person_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.person_api.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
