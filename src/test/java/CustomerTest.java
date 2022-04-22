import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){ customer = new Customer ("Name", 0);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Name");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(0);
    }
}
