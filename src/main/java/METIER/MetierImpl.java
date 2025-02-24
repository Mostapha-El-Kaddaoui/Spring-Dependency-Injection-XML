package METIER;

import DAO.IDAO;

public class MetierImpl implements IMETIER {
    private IDAO dao;
    public MetierImpl(IDAO dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
