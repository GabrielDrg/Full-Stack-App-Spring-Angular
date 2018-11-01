package api.controller;

import api.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import api.repo.TodosRepo;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodosRepo todosRepo;

    @Autowired
    public TodoController(TodosRepo todosRepo) {
      this.todosRepo = todosRepo;
    }

    @GetMapping ("/all")
    public @ResponseBody List<Todo> getAllTodos () {
        return this.todosRepo.findAll();
    }

    @GetMapping ("/{todoId}")
    public @ResponseBody Todo getOneTodo (@PathVariable(value = "todoId") Integer todoId) {
        return this.todosRepo.findOne(todoId);
    }

}
