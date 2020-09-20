package honestit.projects.homeland.domain.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.apache.tomcat.jni.Address;

@Entity
public class UserDetails extends BaseEntity {
  @AttributeOverrides(@AttributeOverride(name = "street", column = @Column(name = "home_address_street")))
  private Address homeAddress;
  private Address contactAddress;

}
