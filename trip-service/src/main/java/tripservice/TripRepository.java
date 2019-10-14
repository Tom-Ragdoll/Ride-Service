package tripservice;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import tripservice.Model.Trip;

public interface TripRepository extends
        CrudRepository<Trip, Long> {

    List<Trip> findByDriverId(long driverId);
    List<Trip> findByRiderId(long riderId);
    List<Trip> findByDriverIdAndRiderId(long driverId, long riderId);
}
