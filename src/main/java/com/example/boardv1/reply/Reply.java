package com.example.boardv1.reply;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.example.boardv1.board.Board;
import com.example.boardv1.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 게시글 1 : 댓글 n1
 * 유저 1 : 댓글 n
 * 
 */

@NoArgsConstructor
@Data
@Entity
@Table(name = "reply_tb")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;

    @ManyToOne
    private Board board; // board_id

    @ManyToOne
    private User user;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
