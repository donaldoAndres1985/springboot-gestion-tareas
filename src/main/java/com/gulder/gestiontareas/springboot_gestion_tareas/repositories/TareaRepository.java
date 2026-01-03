package com.gulder.gestiontareas.springboot_gestion_tareas.repositories;

import com.gulder.gestiontareas.springboot_gestion_tareas.entities.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
