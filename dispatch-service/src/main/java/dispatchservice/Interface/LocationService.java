package dispatchservice.Interface;

import dispatchservice.Model.Location;
import org.springframework.web.bind.annotation.*;

public interface LocationService {
    @RequestMapping(value = "/drivers/{id}/location", method = RequestMethod.GET, produces = "application/json")
    public Location getDriverLocation(
            @PathVariable("id") String id);

    @RequestMapping(value = "/drivers/{id}/location", method = RequestMethod.POST)
    public Location createOrUpdate(
            @PathVariable("id") String id,
            @RequestBody(required = false) Location inputLocation);

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Location findNearestDriver(
            @RequestParam(value = "locationHash", defaultValue = "") String locationHash,
            @RequestParam(value = "expirationInSec", defaultValue = "") String expirationInSec);
}
