package com.alura.api.controller;

import com.alura.api.Model.ICommentModel;
import com.alura.api.Model.commentsModel;
import com.alura.api.foroManager.commentsManager;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class commentsController {

    @Autowired
    private ICommentModel commentModel;

    //Obtener los datos de la BD MySQL
    @GetMapping
    public String getComments(){
        return "Tenga pa que se entretenga.";
    }

    //Registrar los comentarios, y meterlos en la base de datos.
    @PostMapping
    public void postComments(@RequestBody  @Valid commentsManager commentJson){
        commentsModel model = new commentsModel(commentJson);
        commentModel.save(model);
        System.out.println("Se agrego un nuevo comentario.");
    }

    //Borrar comentarios.
    @DeleteMapping
    public void deleteComments(){
        commentModel.deleteAll();
        System.out.println("Se ha borrado el comentario.");
    }

    //Actualizar comentarios.i
    @PutMapping
    public void putComments(){
        System.out.println("Actualizar comentario.");
    }
}
