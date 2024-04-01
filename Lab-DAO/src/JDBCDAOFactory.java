import java.sql.Connection;
public class JDBCDAOFactory implements DAOFactory {

    private final Connection connection;

    public JDBCDAOFactory(Connection connection) {
        this.connection = connection;
    }

    @Override
    public EmpDAO getEmpDAO() {
        return new EmpDAO(connection);
    }

    @Override
    public DeptDAO getDeptDAO() {
        return new DeptDAO(connection);
    }
    public DependentsDAO getDependentsDAO() {
        return new DependentsDAO(connection);
    }
    public BonusDAO getBonusDAO() {
        return new BonusDAO(connection);
    }
}

