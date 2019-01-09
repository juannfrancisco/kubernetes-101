package cl.zenta.advocate.examples.users.model;

import java.util.List;

public class User {

    private String id;
    private String name;
    private Photo[] photos;

    public User(String id) {
        this.id = id;
    }

    public User(String id, String name, Photo[] photos) {
        this.id = id;
        this.name = name;
        this.photos = photos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }
}
