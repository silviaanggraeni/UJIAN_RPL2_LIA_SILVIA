/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.dao;

import com.toko.parfum.model.TokoParfum;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author salis
 */
@Repository
@Transactional
public class TokoParfumImpl implements TokoParfumDao {
    @Autowired
    private SessionFactory sessionFactory;

//    public TokoParfumImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
     
    @Override
    public String save(TokoParfum tokoparfum) { 
        Serializable res = sessionFactory.getCurrentSession().save(tokoparfum);
        return String.valueOf(res);
//        Session session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            session.save(tokoparfum);
//            session.getTransaction().commit();
//        }catch(Exception e){
//            System.err.print("Tidak dapat menyimpan data parfum");
//            session.getTransaction().rollback();
//        }
//        finally {
//            session.close();
//        }
    }   

    @Override
    public void update(TokoParfum tokoparfum) {
        sessionFactory.getCurrentSession().update(tokoparfum);
//        Session session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            session.update(tokoparfum);
//            session.getTransaction().commit();
//        }catch(Exception e){
//            System.err.print("Tidak dapat mengupdate data parfum");
//            session.getTransaction().rollback();
//        }
//        finally {
//            session.close();
//        }
    }

    @Override
    public void delete(TokoParfum tokoparfum) {
        sessionFactory.getCurrentSession().delete(tokoparfum);
//        Session session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            session.delete(tokoparfum);
//            session.getTransaction().commit();
//        }catch(Exception e){
//            System.err.print("Tidak dapat menghapus data parfum");
//            session.getTransaction().rollback();
//        }
//        finally {
//            session.close();
//        }
    }

//    @Override
//    public TokoParfum get(String kd_parfum) {
//        Session session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            TokoParfum tokoparfum = (TokoParfum) session.get(TokoParfum.class, kd_parfum);
//            session.getTransaction().commit();
//            return tokoparfum;
//        }catch(Exception e){
//            System.err.print("Tidak dapat menampilkan data parfum");
//            session.getTransaction().rollback();
//            return null;
//        }
//        finally {
//            session.close();
//        }
//    }

    @Override
    public List<TokoParfum> getList() {
        return sessionFactory.getCurrentSession().createCriteria(TokoParfum.class).list();
//        Session session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            List<TokoParfum> listparfum = session.createCriteria(TokoParfum.class).list();
//            session.getTransaction().commit();
//            return listparfum;
//        }catch(Exception e){
//            System.err.print("Tidak ada list parfum");
//            session.getTransaction().rollback();
//            return null;
//        }
//        finally {
//            session.close();
//        }
    }
    
}
