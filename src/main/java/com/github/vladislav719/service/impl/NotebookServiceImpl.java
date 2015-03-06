package com.github.vladislav719.service.impl;

import com.github.vladislav719.model.Notebook;
import com.github.vladislav719.repository.NotebookRepository;
import com.github.vladislav719.service.NotebookService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Владислав on 06.03.2015.
 */
@Service
public class NotebookServiceImpl implements NotebookService {

    @Autowired
    private NotebookRepository notebookRepository;

    @Override
    public List<Notebook> getAll() {
        return Lists.newArrayList(notebookRepository.findAll());
    }

    @Override
    public List<Notebook> getNotebooksByConditionAnd(String hdd, String ram, String gpu, String cpu) {
        return notebookRepository.getByConditionAnd(hdd, ram, gpu, cpu);
    }

    @Override
    public List<Notebook> getNotebooksByConditionOr(String s1, String s2, String s3, String s4, String s5) {
        return notebookRepository.getByConditionOr(s1, s2, s3, s4, s5);
    }

    @Override
    public void updateIntelNotebooks() {
        List<Notebook> intels = notebookRepository.getAllIntel();
        for (Notebook notebook : intels) {
            String oldCpu = notebook.getCpu();
            notebook.setCpu(clockCpu(oldCpu));
            notebookRepository.save(notebook);
        }
//        notebookRepository.setNotebook();
    }

    private String clockCpu(String oldCpu) {
        int p1 = oldCpu.indexOf("GHz");
        int p2 = oldCpu.indexOf(" ");
        String s1 = oldCpu.substring(0, p2);
        String s2 = oldCpu.substring(p1, oldCpu.length());
//        System.out.println(s1 + " " + s2);
        double before = Double.parseDouble(oldCpu.substring(p2+1, p1));
        before = before + 0.1;
        String after = " " + String.valueOf(before);
        return "Intel " + after + "GHz";
    }

    @Override
    public void deleteNotebooksByConditionAnd() {

    }

    @Override
    public void dropTable() {

    }

    @Override
    public void dropDB() {

    }
}
