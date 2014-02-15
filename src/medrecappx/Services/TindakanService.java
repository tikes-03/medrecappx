/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecappx.Services;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import medrecappx.Dao.TindakanDao;
import medrecappx.Entity.Tindakan;
import medrecappx.Interfaces.TindakanInterface;
import medrecappx.KoneksiDatabase.KoneksiDB;

/**
 *
 * @author Hernawati
 */
public class TindakanService {
    private Connection connection;
    private TindakanInterface ti;

    public TindakanService() {
        this.connection = KoneksiDB.getConnection();
        this.ti = new TindakanDao(connection);
    }

    public void serviceInsertTindakan(Tindakan t){
        try{
            connection.setAutoCommit(false);
            ti.insertTindakan(t);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public void serviceUpdateTindakan(Tindakan t, String noTindakan){
        try{
            connection.setAutoCommit(false);
            ti.updateTindakan(t, noTindakan);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public void serviceDeleteTindakan(String noTindakan){
        try{
            connection.setAutoCommit(false);
            ti.deleteTindakan(noTindakan);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public List serviceGetAllTindakan(){
        try{
            return ti.getAllTindakan();
        }catch(SQLException se){
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

    public List serviceGetAllTindakanByNo(String noTindakan){
        try{
            return ti.getAllTindakanByNo(noTindakan);
        }catch(SQLException se){
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

    public List serviceGetAllTindakanByNm(String nmTindakan){
        try{
            return ti.getAllTindakanByNm(nmTindakan);
        }catch(SQLException se){
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

    public String serviceGetMaxNoTindakan(){
        try{
            return ti.getMaxNoTindakan();
        }catch(SQLException se){
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

    public List serviceGetAllDataTindakanByNo(String noTindakan){
        try{
            return ti.getAllDataTindakanByNo(noTindakan);
        }catch(SQLException se){
            Logger.getLogger(TindakanService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }
}
