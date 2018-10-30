package brtest.assets;

import java.util.Date;

public class video extends asset {
    public String videoType;

    public video (int ID, String name, String type, String url, String expires, String videoType) {
        super(ID, name, type, url, expires);
        this.videoType = videoType;
    }

    public String GetDisplayLine()
    {
        return "(" + this.ID + ") <a href=\"" + this.url + "\" target=\"blank\">" + this.name + "</a> [" + this.type + " Type: " + this.videoType + " Expires: " + this.expires.toString() + "]";
    }
}
