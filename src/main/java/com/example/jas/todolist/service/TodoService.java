package com.example.jas.todolist.service;

import com.example.jas.todolist.entity.Todo;
import com.example.jas.todolist.exceptionHandler.TodoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.jas.todolist.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {

    // tem duas formas de fazer injeção de dependencias:
    // via annotation: @autowired
    @Autowired
    private TodoRepository todoRepository;

    // via construtor: onde não precisa colocar o annotation.
    // a galera do framework recomenda usar dessa forma, pois o annotaion está sendo implicitamente usado aqui
    // public TodoService(TodoRepository todoRepository){
    //    this.todoRepository = todoRepository;
    //}

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list(){
        //podemos usar aqui um objeto de ordenação da lista da seguinte forma:
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending());
        return todoRepository.findAll();
    }
//    public List<Todo> update(Todo todo){
//        todoRepository.save(id, todo);
//        return list();
//    }

    public Todo update(Long id, Todo todo) {
        // Busca o registro existente
        Todo existing = todoRepository.findById(id)
                .orElseThrow(() -> new TodoNotFoundException("Todo não encontrado"));

        // Atualiza os campos desejados
        existing.setNome(todo.getNome());
        existing.setDescricao(todo.getDescricao());
        existing.setRealizado(todo.isRealizado());
        existing.setPrioridade(todo.getPrioridade());
        existing.setData(todo.getData());

        // Salva e retorna o objeto atualizado
        return todoRepository.save(existing);
    }


    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
