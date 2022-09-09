package nl.simpliphi.orderservice.customer;

import com.github.easysourcing.messages.events.annotations.HandleEvent;
import lombok.extern.slf4j.Slf4j;
import nl.simpliphi.shopdomain.customer.CustomerEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerEventHandler {

    @HandleEvent
    public void handle(CustomerEvent.FirstNameChanged event){
        log.info("Send confirmation mail to customer or update all orders of this customer");
    }

}
