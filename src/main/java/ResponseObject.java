public class ResponseObject {

    private String status;
    private String description;
    private String version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ResponseObject(String status, String description, String version) {
        this.status = status;
        this.description = description;
        this.version = version;
    }

    public ResponseObject() { }

    /*
    *
    * { status: "Ok",  description: "Im alive", version: 0.0.1 }
    * */

}
