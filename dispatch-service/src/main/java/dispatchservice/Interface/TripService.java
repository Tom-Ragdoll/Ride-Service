package dispatchservice.Interface;

import dispatchservice.Model.Trip;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TripService {
    @RequestMapping(value = "/trips", method = RequestMethod.POST, produces = "application/json")
    Trip create(
            @RequestBody(required = true) Trip inputTrip);

    @RequestMapping(value="/trips", method=RequestMethod.GET)
    List<Trip> getAll(
            @RequestParam(value = "driverId", defaultValue = "") String driverId,
            @RequestParam(value = "riderId", defaultValue = "") String riderId);

    @RequestMapping(value="/trips/{id}", method=RequestMethod.GET)
    Trip get(@PathVariable("id") String id);

    @RequestMapping(value="/trips/{id}", method=RequestMethod.PUT)
    Trip update(@PathVariable("id") String id,
                @RequestBody(required = true) Trip inputTrip);
}

