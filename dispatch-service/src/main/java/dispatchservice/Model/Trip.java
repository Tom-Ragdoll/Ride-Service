package dispatchservice.Model;

import java.time.LocalDateTime;

public class Trip {

    public long id;

    public long driverId;

    public long riderId;

    public String origin;

    public String destination;

    public int status;

    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;

    public Trip(){
    }

    // Called by the update function
    public Trip(long id,
                long driverId,
                long riderId,
                String origin,
                String destination,
                int status,
                LocalDateTime createdAt) {
        this.id = id;
        this.driverId = driverId;
        this.riderId = riderId;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
        this.updatedAt = LocalDateTime.now(); // update the timestamp
        this.createdAt = createdAt;
    }

    // Called by the create function
    public Trip(long driverId,
                long riderId,
                String origin,
                String destination,
                int status) {
        this.driverId = driverId;
        this.riderId = riderId;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
        this.updatedAt = LocalDateTime.now();
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format(
                "Trip[id=%d, driverId='%s', riderId='%s', "
                        + "origin='%s', destination='%s', status='%s', updatedAt='%s', createdAt='%s']",
                id, driverId, riderId, origin, destination, status, updatedAt, createdAt);
    }
}

