package DAO;

public class DaoImpl implements IDAO{

    @Override
    public double getData() {
        System.out.println("Version Base de Donnees");
        double temp = 25;
        return temp;
    }
}
