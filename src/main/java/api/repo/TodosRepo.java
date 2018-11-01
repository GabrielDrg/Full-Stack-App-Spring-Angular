package api.repo;

import api.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepo extends JpaRepository <Todo,Integer> {

}
