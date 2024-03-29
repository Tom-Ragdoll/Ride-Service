package accountservice;

import java.util.List;

import accountservice.Model.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends
        CrudRepository<Driver, Long> {

    List<Driver> findByFirstName(String firstName);
    List<Driver> findByLastName(String lastName);
    List<Driver> findByFirstNameAndLastName(String firstName, String lastName);
}
