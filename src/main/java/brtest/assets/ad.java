package brtest.assets;

import java.util.Date;

public class ad extends asset {
    public String proudctDesc;

    public ad (int ID, String name, String type, String url, String expires, String productDesc) {
        super(ID, name, type, url, expires);
        this.proudctDesc = productDesc;
    }

    public String GetDisplayLine()
    {
        return "(" + this.ID + ") <a href=\"" + this.url + "\" target=\"blank\">" + this.name + "</a> [" + this.type + " Description: " + this.proudctDesc + " Expires: " + this.expires.toString() + "]";
    }
}
