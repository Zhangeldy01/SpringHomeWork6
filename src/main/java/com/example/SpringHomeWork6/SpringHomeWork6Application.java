package com.example.SpringHomeWork6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Базовое задание:
 * Условие:
 * Важно! В проекте используем обязательно Spring Data и Lombok!
 * Разработайте небольшое веб-приложение на Spring Boot, которое будет представлять из себя сервис для учета личных
 * заметок. Приложение должно поддерживать следующие функции:
 * Все методы контроллера возвращают ResponseEntity(как на семинаре)
 * 1. Добавление заметки. (Подсказка @PostMapping )
 * 2. Просмотр всех заметок.(Подсказка @GetMapping )
 * 3. Получение заметки по id. (Подсказка @GetMapping("/{id}") )
 * 4. Редактирование заметки.(Подсказка @PutMapping("/{id}") )
 * 5. Удаление заметки.(Подсказка @DeleteMapping("/{id}") )
 * Структура заметки:
 * - ID (автоинкрементное)(тип - Long)
 * - Заголовок (не может быть пустым)(тип - String)
 * - Содержимое (не может быть пустым)(тип - String)
 * - Дата создания (автоматически устанавливается при создании заметки)(тип - LocalDateTime)
 * Подсказка:
 * Репозиторий насладует JpaRepository<Note, Long>. В репозитории добавляем метод Optional<Note> findById(Long id);
 * Подсказка:
 * В проект добавляем зависимости: spring data jpa, h2, lombok, spring web
 */
@SpringBootApplication
public class SpringHomeWork6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringHomeWork6Application.class, args);
	}

}

/*
spring.application.name=SpringHomeWork6
spring.datasource.url=jdbc:mysql://localhost:8080/notes
spring.datasource.username=root
spring.datasource.password=12pass
spring.sql.init.mode=always
spring.jpa.defer-datasource-initialization=true
spring.jpa.hibernate.ddl-auto=none
 */