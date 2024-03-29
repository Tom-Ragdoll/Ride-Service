package dispatchservice.Model;

import java.time.LocalDateTime;

public class Order {
    public long id;

    public long tripId;

    public int status;

    public LocalDateTime createdAt;

    public Order(){
    }

    public Order(long tripId,
                 int status) {
        this.tripId = tripId;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
                "Order[id=%d, tripId='%s', "
                        + "status='%s', createdAt='%s']",
                id, tripId, status, createdAt);
    }
}


