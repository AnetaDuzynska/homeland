package honestit.projects.homeland.starters;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class LocalDataLoader {

  @PostConstruct
  public void loadData() {

  }
}
