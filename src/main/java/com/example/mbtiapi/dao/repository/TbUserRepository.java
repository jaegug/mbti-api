package com.example.mbtiapi.dao.repository;

import com.example.mbtiapi.dao.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserRepository extends JpaRepository<TbUser, Integer> {

}
