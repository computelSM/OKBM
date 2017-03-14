package csm.beans.asset;

import psdi.util.MXException;
import psdi.webclient.system.beans.DataBean;

import java.rmi.RemoteException;

/**
 * Created by AMilko on 14.03.2017.
 */
public class AssetSpecDataSource extends DataBean {
    @Override
    protected void initialize() throws MXException, RemoteException {
        super.initialize();
        this.getMboSet().setUserWhere("section='1'");
    }
}
