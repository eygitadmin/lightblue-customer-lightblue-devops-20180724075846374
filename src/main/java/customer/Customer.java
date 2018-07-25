package customer;

public class Customer {
    String _id;
    String _rev;
    String username;
    String password;
    String firstname;
    String lastname;
    String email;
    String imageurl;

    public void setCustoomerId(String _id) {
        this._id = _id;
    }

    public String getCustomerId() {
        return this._id;
    }

    public void setRev(String _rev) {
        this._rev = _rev;
    }

    public String getRev() {
        return this._rev;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImageurl() {
        return this.imageurl;
    }

}