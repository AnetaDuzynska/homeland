package honestit.projects.homeland.domain.model;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends BaseEntity{
  @ManyToOne
  private User owner;

  private CarDetails details;

  @CollectionTable(name = "cars_comments")
  private List<String> comments;


}
