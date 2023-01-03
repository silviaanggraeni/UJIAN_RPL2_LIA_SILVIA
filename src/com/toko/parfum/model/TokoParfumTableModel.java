/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author salis
 */
public class TokoParfumTableModel extends AbstractTableModel{
    private List<TokoParfum> listTokoParfum = new ArrayList();
    private final String HEADER[] = {"Kode Parfum","Nama Parfum","Jenis Parfum","Ukuran parfum","Harga Parfum"};
    
    public TokoParfumTableModel (List<TokoParfum> listTokoParfum){
        this.listTokoParfum = listTokoParfum;
    }
    
    
    @Override
    public int getRowCount() {
     return listTokoParfum.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TokoParfum tokoParfum = listTokoParfum.get(rowIndex);
    
        switch(columnIndex) {
            case 0:
                return tokoParfum.getKd_parfum();
            case 1:
                return tokoParfum.getNama();
            case 2:
                return tokoParfum.getJenis();
            case 3:
                return tokoParfum.getUkuran();
            case 4:
                return tokoParfum.getHarga();
            default:
                return null;
        }
    }
    
    public String getColumnName(int index) {
        return HEADER[index];
    }
}
