package com.example.mbtiapi.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser {
    @Id
    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "e_score", nullable = false)
    private int eScore;

    @Column(name = "i_score", nullable = false)
    private int iScore;

    @Column(name = "n_score", nullable = false)
    private int nScore;

    @Column(name = "s_score", nullable = false)
    private int sScore;

    @Column(name = "f_score", nullable = false)
    private int fScore;

    @Column(name = "t_score", nullable = false)
    private int tScore;

    @Column(name = "p_score", nullable = false)
    private int pScore;

    @Column(name = "j_score", nullable = false)
    private int jScore;
}
