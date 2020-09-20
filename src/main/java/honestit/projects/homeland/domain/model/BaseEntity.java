package honestit.projects.homeland.domain.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "created_on", nullable = false, updatable = false)
  private LocalDateTime createdOn;
  @Column(name = "updated_on")
  private LocalDateTime updatedOn;

  @PrePersist
  public void prePersist() {
    createdOn = LocalDateTime.now();
    updatedOn = null;
  }

  @PreUpdate
  public void preUpdate() {
    updatedOn = LocalDateTime.now();
  }

}
