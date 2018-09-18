package topic0.exercise2.abstractfactory;

public class SqlConnectionFactory extends AbstractFactory{
	   @Override
	   public SqlConnection getSqlConnection(String dbType){
	   
	      if(dbType == null){
	         return null;
	      }		
	      
	      if(dbType.equalsIgnoreCase("MYSQL")){
	         return new MySqlConnection();
	         
	      }else if(dbType.equalsIgnoreCase("POSTGRE")){
	         return new PostgreConnection();
	      }
	      
	      return null;
	   }
	   

	NoSqlConnection getNoSqlConnection(String dbType) {
		return null;
	}
}
