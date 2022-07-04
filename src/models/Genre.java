package models;

public class Genre {

    String genreName;
    String description;

    public String getGenreName() {
        return genreName;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String genreName) {
        this.genreName = genreName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreName='" + genreName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
