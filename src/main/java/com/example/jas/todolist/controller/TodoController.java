package com.example.jas.todolist.controller;

import com.example.jas.todolist.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.jas.todolist.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo> list(Todo todo){
        return todoService.list();
    }
    @PutMapping("{id}")
//    List<Todo> update(@PathVariable("id") Long id, @RequestBody Todo todo){
//        return todoService.update(id, todo);
//    }
    Todo update(@PathVariable("id") Long id, @RequestBody Todo todo){
        return todoService.update(id, todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
