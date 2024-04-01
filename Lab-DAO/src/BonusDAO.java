import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BonusDAO extends DAO<Bonus>{
    public BonusDAO(Connection connection)
    {
        super(connection);
    }
    public Bonus find(int sal)
    {
        Bonus bonus01 = new Bonus();
        try{
            PreparedStatement findBonus =
                    connect.prepareStatement("select * from bonus where sal=?");
            findBonus.setInt(1,sal);
            ResultSet result = findBonus.executeQuery();
            while (result.next())
            {

                bonus01.setEname(result.getString("ename"));
                bonus01.setJob(result.getString("job"));
                bonus01.setSal(result.getInt("sal"));
                bonus01.setComm(result.getInt("comm"));

            }
            result.close();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return bonus01;
    }

    @Override
    public boolean create(Bonus object) {
        return false;
    }

    @Override
    public boolean update(Bonus object) {
        return false;
    }

    @Override
    public boolean delete(Bonus object) {
        return false;
    }
}