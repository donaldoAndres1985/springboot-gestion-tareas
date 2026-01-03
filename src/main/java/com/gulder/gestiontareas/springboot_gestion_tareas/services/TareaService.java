package com.gulder.gestiontareas.springboot_gestion_tareas.services;

import com.gulder.gestiontareas.springboot_gestion_tareas.entities.Tarea;

import java.util.List;
import java.util.Optional;

public interface TareaService {

    List<Tarea> getAllTareas();

    Optional<Tarea> getTareaById(Long id);

    Tarea createTarea(Tarea tarea);

    Tarea updateTarea(Long id,Tarea tarea);

    void deleteTarea(Long id);
}