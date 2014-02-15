/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecappx.Services;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import medrecappx.Dao.PelayananTindakanDao;
import medrecappx.Entity.PelayananTindakan;
import medrecappx.Interfaces.PelayananTindakanInterface;
import medrecappx.KoneksiDatabase.KoneksiDB;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class PelayananTindakanService {

    private Connection connection;
    private PelayananTindakanInterface pti;

    public PelayananTindakanService() {
        this.connection = KoneksiDB.getConnection();
        this.pti = new PelayananTindakanDao(connection);
    }

    public void serviceInsertPelayananTindakan(PelayananTindakan pt){
        try{
            connection.setAutoCommit(false);
            pti.insertPelayananTindakan(pt);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public void serviceUpdatePelayananTindakan(String noTindakan,PelayananTindakan pt){
        try{
            connection.setAutoCommit(false);
            pti.updatePelayananTindakan(noTindakan, pt);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public void serviceDeletePelayananTindakan(String noDaftar){
        try{
            connection.setAutoCommit(false);
            pti.deletePelayananTindakan(noDaftar);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public List serviceGetAllPelayananTindakan(){
        try{
            return pti.getAllPelayananTindakan();
        }catch(SQLException se){
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

    public List serviceGetAllByNoDaftar(String noDaftar){
        try{
            return pti.getAllByNoDaftar(noDaftar);
        }catch(SQLException se){
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

}
