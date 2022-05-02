import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtistTest {

    Artist artist;

    Artwork artwork;

    Gallery gallery;

    Artwork artwork1;
    Artwork artwork2;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Blank");




    }
    @Test
    public void hasName(){ assertThat(artist.getArtist()).isEqualTo("Blank");
    }







}
