package com.alura.api.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentModel extends JpaRepository<commentsModel, Long> {

}
