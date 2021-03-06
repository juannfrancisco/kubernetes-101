package cl.zenta.advocate.examples.photos.model;

public class Photo {
    private String id;
    private String name;
    private String content;
    private String url;
    private String dateUpload;

    public Photo(String id, String name, String content, String url, String dateUpload) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.url = url;
        this.dateUpload = dateUpload;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(String dateUpload) {
        this.dateUpload = dateUpload;
    }


}
