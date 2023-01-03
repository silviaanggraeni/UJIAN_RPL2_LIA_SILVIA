/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.dao;

import com.toko.parfum.model.TokoParfum;
import java.util.List;

/**
 *
 * @author salis
 */
public interface TokoParfumDao {
    public String save(TokoParfum tokoparfum);
    public void update(TokoParfum tokoparfum);
    public void delete(TokoParfum tokoparfum);
//    public TokoParfum get(String kd_parfum);
    public List<TokoParfum> getList();
}
