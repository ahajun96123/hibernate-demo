package com.example.test_hibernate.repo;

import com.example.test_hibernate.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findById(Long id);
    Optional<MemberEntity> findByUsername(String username);
    Optional<MemberEntity> findByName(String name);
    Optional<MemberEntity> findByNameAndAndPidIsLessThan(String name, Long id);
}