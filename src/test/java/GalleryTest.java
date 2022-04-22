import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;

    Artwork artwork;


    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Blank",0);
        artwork = new Artwork("Blank", "Blank", 0, 0);
    }

    @Test
    public void hasName() {
        assertThat(gallery.getName()).isEqualTo("Blank");
    }

    @Test
    public void canGetArt() {
        assertThat(gallery.getArtworks().size()).isEqualTo(0);
    }

    @Test
    public void canGetTill() {
        assertThat(gallery.getTill()).isEqualTo(0.00);
    }

}
