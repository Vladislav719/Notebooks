package com.github.vladislav719.service;

import com.github.vladislav719.model.Notebook;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Владислав on 06.03.2015.
 */
public interface NotebookService {

    List<Notebook> getAll();
    List<Notebook> getNotebooksByConditionAnd(String hdd, String ram, String gpu, String cpu);
    List<Notebook> getNotebooksByConditionOr(String s1, String s2, String s3, String s4, String s5);
    void updateIntelNotebooks();
    void deleteNotebooksByConditionAnd();
    void dropTable();
    void dropDB();


}
