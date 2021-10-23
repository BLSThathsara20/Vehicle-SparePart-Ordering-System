package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author blsthathsara
 */
@Entity
public class WebUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
// <editor-fold defaultstate="collapsed" desc="Attributes">
    private String name;
    private String password;
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdAt;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date retiredAt;
    private String retireComments;
    private String loginIPs;
    private String code;

    private boolean systemAdministrator;
    private boolean superUser;
    private boolean Shop_Manager;
    private boolean Deliver_Agent;
    private boolean Seller;
    private boolean Buyer;
//  </editor-fold> 
    
// <editor-fold defaultstate="collapsed" desc="Relationships">
    @OneToOne
    private Person person;
//  </editor-fold> 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebUser)) {
            return false;
        }
        WebUser other = (WebUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.WebUser[ id=" + id + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getRetiredAt() {
        return retiredAt;
    }

    public void setRetiredAt(Date retiredAt) {
        this.retiredAt = retiredAt;
    }

    public String getRetireComments() {
        return retireComments;
    }

    public void setRetireComments(String retireComments) {
        this.retireComments = retireComments;
    }

    public String getLoginIPs() {
        return loginIPs;
    }

    public void setLoginIPs(String loginIPs) {
        this.loginIPs = loginIPs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSystemAdministrator() {
        return systemAdministrator;
    }

    public void setSystemAdministrator(boolean systemAdministrator) {
        this.systemAdministrator = systemAdministrator;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public boolean isShop_Manager() {
        return Shop_Manager;
    }

    public void setShop_Manager(boolean Shop_Manager) {
        this.Shop_Manager = Shop_Manager;
    }

    public boolean isDeliver_Agent() {
        return Deliver_Agent;
    }

    public void setDeliver_Agent(boolean Deliver_Agent) {
        this.Deliver_Agent = Deliver_Agent;
    }

    public boolean isSeller() {
        return Seller;
    }

    public void setSeller(boolean Seller) {
        this.Seller = Seller;
    }

    public boolean isBuyer() {
        return Buyer;
    }

    public void setBuyer(boolean Buyer) {
        this.Buyer = Buyer;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
