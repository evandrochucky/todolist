package com.example.jas.todolist.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste da entidade Todo")
public class todoTeste {
    private Todo todo;

    @BeforeEach
    void setup(){
        todo = new Todo();
    }

    @Test
    @DisplayName("Deve criar um Todo com sucesso")
    void testCriarTodo(){
        todo.setNome("Estudar Java 1");
        todo.setDescricao("Estudo da linguagem de programação Java");
        todo.setRealizado(false);
        todo.setPrioridade(1);
        todo.setData(LocalDateTime.now());

        assertNotNull(todo);

        assertEquals("Estudar Java 1", todo.getNome());
        assertEquals("Estudo da linguagem de programação Java", todo.getDescricao());
        assertFalse(todo.isRealizado());
        assertEquals(1,todo.getPrioridade());
        assertNotNull(todo.getData());

    }


}
