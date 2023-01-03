/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.service;

import com.toko.parfum.dao.TokoParfumDao;
import com.toko.parfum.model.TokoParfum;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author salis
 */
@Service("TokoParfumService")
@Transactional
public class TokoParfumServiceImpl implements TokoParfumService{
    @Autowired
    private TokoParfumDao tokoParfumDao;
    
    @Override
    public void save(TokoParfum tokoparfum) {
        tokoParfumDao.save(tokoparfum);
    }

    @Override
    public void update(TokoParfum tokoparfum) {
        tokoParfumDao.update(tokoparfum);
    }

    @Override
    public void delete(TokoParfum tokoparfum) {
        tokoParfumDao.delete(tokoparfum);
    }

    @Override
    public List<TokoParfum> getList() {
        return tokoParfumDao.getList();
    }
    
}
