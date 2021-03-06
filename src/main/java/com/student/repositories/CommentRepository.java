package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
