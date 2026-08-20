package io.github.lucas_bardeli.api_java_springboot.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tasks_table")
public class TaskModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  private UUID idUser;

  @Column(length = 50)
  private String title;
  private String description;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;

  @CreationTimestamp
  private LocalDateTime createdAt;

  public void setTitle(String title) throws Exception {
    if (title.length() > 50)
      throw new Exception("O título deve conter no máximo 50 caracteres!");

    this.title = title;
  }
}
