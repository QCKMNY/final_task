package com.kubar.itransition.dao;

import com.kubar.itransition.model.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InstructionDao extends JpaRepository<Instruction, Long>{

    Instruction findById(Long id);
}
