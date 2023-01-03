/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.test;

import com.toko.parfum.dao.TokoParfumDao;
import com.toko.parfum.model.TokoParfum;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author salis
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TokoParfumDaoImplTest {
    @Autowired
    TokoParfumDao tokoParfumDao;
    
    TokoParfum tokoParfum = new TokoParfum();
    
    @Test
    public void testSave() {
        String kode = "mk005";
        
        tokoParfum.setKd_parfum(kode);
        tokoParfum.setNama("TestNama");
        tokoParfum.setHarga(150000);
        tokoParfum.setJenis("EDP");
        tokoParfum.setUkuran("100 ml");
        
        String res = tokoParfumDao.save(tokoParfum);
        assertTrue(res.equals(kode));
    }
}
