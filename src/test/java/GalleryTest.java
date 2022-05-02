import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;

    Artwork artwork;




    @BeforeEach
    public void setUp() {
        gallery = new Gallery("The gal");
        gallery.addArtwork( new Artwork("The beggining", "Jack", 2, 4));
        gallery.addArtwork( new Artwork("The ning", "sack", 1, 8));


    }

    @Test
    public void hasName() {
        assertThat(gallery.getName()).isEqualTo("The gal");
    }

    @Test
    public void canGetArt() {
        assertThat(gallery.getArtworks().size()).isEqualTo(2);
    }

    @Test
    public void canGetTill() {
        assertThat(gallery.getTill()).isEqualTo(0.00);
    }

    @Test
    public void hasListOfArt() { assertThat(gallery.artworkCount()).isEqualTo(2);
    }


}
