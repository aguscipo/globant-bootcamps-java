package topic0.exercise2.abstractfactory;

public class NoSqlConnectionFactory extends AbstractFactory {

	@Override
	SqlConnection getSqlConnection(String dbType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	NoSqlConnection getNoSqlConnection(String dbType) {
	      if(dbType == null){
		         return null;
		      }		
		      
		      if(dbType.equalsIgnoreCase("MONGODB")){
		         return new MongoDBConnection();
		         
		      }else if(dbType.equalsIgnoreCase("CASSANDRA")){
		         return new CassandaConnection();
		      }
		      
		      return null;
   }
	

}
