public class Customer {



    private String name;
    private double wallet;
    private int buyArtworkFromGallery;

    public Customer (String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.buyArtworkFromGallery = 0;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }
    public void buyArtworkFromGallery(Gallery gallery){
        int totalArtworks = 0;
        for(Artwork artwork : gallery.getArtworks()){
            totalArtworks += artwork.buyArtworkFromGallery();
            artwork.setArtworks(0);
        }
        this.buyArtworkFromGallery = totalArtworks;
    }

    public int buyArtworkFromGallery(){
        return this.buyArtworkFromGallery;
    }


    }
}
