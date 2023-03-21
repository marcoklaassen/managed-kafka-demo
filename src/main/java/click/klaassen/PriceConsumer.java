package click.klaassen;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PriceConsumer {

    @Incoming("prices")
    public void consume(double price) {
        System.out.println("My Price: " + price);
    }
}
