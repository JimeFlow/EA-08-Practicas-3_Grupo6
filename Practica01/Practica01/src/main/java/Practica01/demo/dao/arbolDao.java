package Practica01.demo.dao;

import Practica01.demo.domain.arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface arbolDao extends JpaRepository <arbol,Long> {
    
}
