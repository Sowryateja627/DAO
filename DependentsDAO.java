import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DependentsDAO extends DAO<Dependents>{


    public DependentsDAO(Connection connection)
    {
        super(connection);
    }
    public  Dependents find(int Deptno)
    {
        Dependents dependents01 = new Dependents();
        try{
            PreparedStatement findDept =
                    connect.prepareStatement("select * from dependents where dno=?");
            findDept.setInt(1,Deptno);
            ResultSet result = findDept.executeQuery();
            while (result.next())
            {
                dependents01.setDno(result.getInt("dno"));
                dependents01.setDname(result.getString("dname"));
                dependents01.setDfirst(result.getString("dfirst"));

                int empNo = result.getInt("empno");
                // Fetch associated employee
                EmpDAO empDAO = new EmpDAO(connect);
                Emp emp = empDAO.find(empNo);
                dependents01.setEmp(emp);

            }
            result.close();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return dependents01;
    }

    @Override
    public boolean create(Dependents object) {
        return false;
    }

    @Override
    public boolean update(Dependents object) {
        return false;
    }

    @Override
    public boolean delete(Dependents object) {
        return false;
    }
}