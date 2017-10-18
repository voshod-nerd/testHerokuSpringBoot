/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.repository;

import com.voshodnerd.entity.Datas;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Талалаев
 */
public interface DatazRepository extends  JpaRepository<Datas, Long> {
    
}
