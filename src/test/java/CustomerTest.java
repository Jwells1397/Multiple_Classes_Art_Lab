import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;

    Artist artist;

    Gallery gallery;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Name", 0);
        gallery = new Gallery("Arty",0);
    }

    @Test
    public void hasName() {
        assertThat(customer.getName()).isEqualTo("Name");
    }

    @Test
    public void canGetWallet() {
        assertThat(customer.getWallet()).isEqualTo(0);
    }

    /*@Test
    public void canPurchaseArtworks(){ gallery.purchaseArtworks(gallery);
        assertThat(gallery.purchaseArtworks()).isEqualTo(0)*/
    /*@Test
    public void canBuyArtworkFromGallery(){assertThat(customer.buyArtworkFromGallery()).isEqualTo(0);}*/

    @Test
    public void canBuyArtworkFromGallery() {
        customer.buyArtworkFromGallery(gallery);
        assertThat(customer.buyArtworkFromGallery()).isEqualTo(1);
    }


}
