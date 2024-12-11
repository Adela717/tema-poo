import java.util.ArrayList;
import java.util.SortedSet;

public class Account{
    private Information information;
    private ArrayList<Character> characters;
    private int mapsCompleted;

    public Account(ArrayList<Character> characters, int mapsCompleted, Information information) {
        this.information = information;
        this.characters = characters;
        this.mapsCompleted = mapsCompleted;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public int getMapsCompleted() {
        return mapsCompleted;
    }

    public void setMapsCompleted(int mapsCompleted) {
        this.mapsCompleted = mapsCompleted;
    }

    public static class Information{
        private Credentials credentials;
        private String name;
        private String country;
        private SortedSet<String> favoriteGames;

        public Information(Credentials credentials, SortedSet<String> favoriteGames, String name, String country) {
            this.credentials = credentials;
            this.favoriteGames = favoriteGames;
            this.name = name;
            this.country = country;
        }

        public Credentials getCredentials() {
            return credentials;
        }

        public void setCredentials(Credentials credentials) {
            this.credentials = credentials;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public SortedSet<String> getFavoriteGames() {
            return favoriteGames;
        }

        public void setFavoriteGames(SortedSet<String> favoriteGames) {
            this.favoriteGames = favoriteGames;
        }

    }
}