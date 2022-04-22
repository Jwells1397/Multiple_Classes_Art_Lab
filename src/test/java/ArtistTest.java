import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Blank");
        artwork = new Artwork("Blank", "Blank",0.00, 0);


    }
    @Test
    public void hasName(){ assertThat(artist.getName()).isEqualTo("Blank");
    }

    @Test
    public void hasListOfArt() { assertThat(artist.getArtworks().size()).isEqualTo(0);
    }





}
