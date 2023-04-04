package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryConfirmeds extends AbstractEvent {

    private Long id;

    public DeliveryConfirmeds(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryConfirmeds() {
        super();
    }
}
