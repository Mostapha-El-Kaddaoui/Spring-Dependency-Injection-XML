package EXT;

import DAO.IDAO;

public class DaoImplV2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("Get Data via un web service ");
        double temp = 21;
        return temp;
    }
}
