import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomerTest {

    Customer customer;

    Artwork artwork;

    Artist artist;

    Gallery gallery;



    @BeforeEach
    public void setUp() {
        customer = new Customer("Wells", 10);
        gallery = new Gallery("The gal");
        gallery.addArtwork( new Artwork("The beggining", "Jack", 2, 4));
        gallery.addArtwork( new Artwork("The ning", "sack", 1, 8));
        customer.buyArtwork(gallery.getArtworks().get(1));




    }

    @Test
    public void hasName() {
        assertThat(customer.getName()).isEqualTo("Wells");
    }

    @Test
    public void walletAmount(){ assertThat(customer.getWallet()).isEqualTo(9);}




}


