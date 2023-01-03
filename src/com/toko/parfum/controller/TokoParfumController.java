/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.controller;

//import com.toko.parfum.config.HibernateUtil;
//import com.toko.parfum.dao.TokoParfumDao;
import static com.toko.parfum.app.TokoParfumApp.getTokoParfumService;
import com.toko.parfum.model.TokoParfum;
import com.toko.parfum.model.TokoParfumTableModel;
import com.toko.parfum.view.TokoParfumView;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author salis
 */
public class TokoParfumController {
    private TokoParfumView tokoParfumView;
    private List<TokoParfum> listTokoParfum;
    private TokoParfumTableModel tokoParfumTableModel;
//    private final TokoParfumDao tokoParfumDao = HibernateUtil.getTokoParfumDao();

public TokoParfumController(TokoParfumView tokoParfumView) {
    this.tokoParfumView = tokoParfumView;
}

    public void clear() {
        this.tokoParfumView.getTxtKode().setText("");
        this.tokoParfumView.getTxtNama().setText("");
        this.tokoParfumView.getTxtJenis().setText("");
        this.tokoParfumView.getTxtUkuran().setText("");
        this.tokoParfumView.getTxtHarga().setText("");
    }

    public void saveParfum() {
        TokoParfum tokoParfum = new TokoParfum();
        tokoParfum.setKd_parfum(this.tokoParfumView.getTxtKode().getText());
        tokoParfum.setNama(this.tokoParfumView.getTxtNama().getText());
        tokoParfum.setJenis(this.tokoParfumView.getTxtJenis().getText());
        tokoParfum.setUkuran(this.tokoParfumView.getTxtUkuran().getText());
        tokoParfum.setHarga(Integer.parseInt(this.tokoParfumView.getTxtHarga().getText()));

        try{
            getTokoParfumService().save(tokoParfum);
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan Parfum","Success", JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan parfum", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void updateParfum(){
        TokoParfum tokoParfum = new TokoParfum();
        tokoParfum.setKd_parfum(this.tokoParfumView.getTxtKode().getText());
        tokoParfum.setNama(this.tokoParfumView.getTxtNama().getText());
        tokoParfum.setJenis(this.tokoParfumView.getTxtJenis().getText());
        tokoParfum.setUkuran(this.tokoParfumView.getTxtUkuran().getText());
        tokoParfum.setHarga(Integer.parseInt(this.tokoParfumView.getTxtHarga().getText()));

        try {
            getTokoParfumService().update(tokoParfum);
            JOptionPane.showMessageDialog(null, "Berhasil mengubah Parfum", "Success", JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah Parfum", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void deleteParfum() {
        if(this.tokoParfumView.getTxtKode().getText() == null) {
            JOptionPane.showMessageDialog(null, "Data Belum Dipilih", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else{
            TokoParfum tokoParfum = new TokoParfum();
            tokoParfum.setKd_parfum(this.tokoParfumView.getTxtKode().getText());

            int option = JOptionPane.showConfirmDialog(null, "Apakah ingin menghapus ini?", "Warning", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
            if(option == JOptionPane.YES_OPTION) {
                try{
                    getTokoParfumService().delete(tokoParfum);
                    JOptionPane.showMessageDialog(null, "Berhasil menghapus Parfum", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    getAllData();
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus Parfum", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    public void getAllData(){
        listTokoParfum = getTokoParfumService().getList();
        tokoParfumTableModel = new TokoParfumTableModel (listTokoParfum);
        this.tokoParfumView.getTblParfum().setModel(tokoParfumTableModel);
    }

    public void getdata(){
        int rowIndex = this.tokoParfumView.getTblParfum().getSelectedRow();
        this.tokoParfumView.getTxtKode().setText(String.valueOf(this.tokoParfumView.getTblParfum().getValueAt(rowIndex, 0)));
        this.tokoParfumView.getTxtNama().setText(String.valueOf(this.tokoParfumView.getTblParfum().getValueAt(rowIndex, 1)));
        this.tokoParfumView.getTxtJenis().setText(String.valueOf(this.tokoParfumView.getTblParfum().getValueAt(rowIndex, 2)));
        this.tokoParfumView.getTxtUkuran().setText(String.valueOf(this.tokoParfumView.getTblParfum().getValueAt(rowIndex, 3)));
        this.tokoParfumView.getTxtHarga().setText(String.valueOf(this.tokoParfumView.getTblParfum().getValueAt(rowIndex, 4)));

    }
}

