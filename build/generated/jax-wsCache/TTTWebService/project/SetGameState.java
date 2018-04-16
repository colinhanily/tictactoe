
package project;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setGameState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setGameState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gstate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setGameState", propOrder = {
    "gid",
    "gstate"
})
public class SetGameState {

    protected int gid;
    protected int gstate;

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
     * Gets the value of the gstate property.
     * 
     */
    public int getGstate() {
        return gstate;
    }

    /**
     * Sets the value of the gstate property.
     * 
     */
    public void setGstate(int value) {
        this.gstate = value;
    }

}
