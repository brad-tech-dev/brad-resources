package brad.tech.res.img;

import java.net.URL;

public enum ImageResource {

    // a
    ADD_COLUMN("add-column"),
    ADD_DATABASE("add-database"),
    ADD_NODE("add-node"),
    ADD_SUBNODE("add-subnode"),
    ADD_TAB("add-tab"),
    ADJUST("adjust"),
    ADMINISTRATOR_MALE("administrator-male")


    // b
    // c
    // d
    // e
    // f
    // g
    // h
    // i
    // j
    // k
    // l
    // m
    // n
    // o
    // p
    // q
    // r
    // s
    // t
    // u
    // v
    // w
    // x
    // y
    // z
    ;

    private String resource;

    ImageResource(String resource) {
        this.resource = resource;
    }

    public URL url() {
        return ImageResource.class.getResource(this.resource + ".png");
    }

    public static URL find(String resource) {
        return ImageResource.class.getResource(resource);
    }
}
