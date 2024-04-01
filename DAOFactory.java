public interface DAOFactory {
    EmpDAO getEmpDAO();
    DeptDAO getDeptDAO();
    DependentsDAO getDependentsDAO();
    BonusDAO getBonusDAO();
}
