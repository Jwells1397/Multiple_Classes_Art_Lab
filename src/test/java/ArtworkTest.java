import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


    public class ArtworkTest {

        Artwork artwork;

        @BeforeEach
        public void setUp() {
            artwork = new Artwork("Blank", "Blank", 0, 0);
        }

        @Test
        public void hasTitle() {
            assertThat(artwork.getTitle()).isEqualTo("Blank");
        }

        @Test
        public void hasArtist() {
            assertThat(artwork.getArtist()).isEqualTo("Blank");
        }

        @Test
        public void hasPrice() {
            assertThat(artwork.getPrice()).isEqualTo(0);
        }

        @Test
        public void hasNft() {
            assertThat(artwork.getNft()).isEqualTo(0);
        }
    }


