
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteGame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteGame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteGame", propOrder = {
    "gid",
    "uid"
})
public class DeleteGame {

    protected int gid;
    protected int uid;

    /**
     * Gets the value of the gid property.
     * 
     */
    public int getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     */
    public void setGid(int value) {
        this.gid = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     */
    public int getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     */
    public void setUid(int value) {
        this.uid = value;
    }

}
