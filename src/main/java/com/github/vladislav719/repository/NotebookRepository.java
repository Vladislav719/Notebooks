package com.github.vladislav719.repository;

import com.github.vladislav719.model.Notebook;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Владислав on 06.03.2015.
 */
@Repository
public interface NotebookRepository extends CrudRepository<Notebook, Long> {

    @Query("from Notebook n where n.hdd LIKE ?1 and n.ram LIKE ?2 and n.gpu LIKE ?3 and n.cpu LIKE ?4 ")
    public List<Notebook> getByConditionAnd(String hdd, String ram, String gpu, String cpu );

    @Query("from Notebook n where " +
            "n.hdd like ?1 or " +
            "n.hdd like ?2 or " +
            "n.hdd like ?3 or " +
            "n.hdd like ?4 or " +
            "n.hdd like ?5 ")
    public List<Notebook> getByConditionOr(String s1, String s2, String s3, String s4, String s5);


    @Query("update Notebook n set n.cpu = ?1")
    public void setNotebook(String cpu);

    @Query("from Notebook n where n.cpu like '%Intel%'")
    public List<Notebook> getAllIntel();


}
