package enums;

public enum MemberQuery {
	//ctrl+spacebar 로 toString 나타냄(객체를 내부적으로 상속받았을 때에 나타남. 인터페이스에선 안나옴)
	//object class 가 defualt로 
	//Enum,class 동급 =>>  object calss 는 객체의 조상이다.
	
	LOGIN, INSERT_MEMBER,FIND_ID;

	@Override
	public String toString() {
		String query ="";
		switch (this) {
		case LOGIN:
			query = " SELECT " + 
					" MEM_ID USERID, " + 
					" TEAM_ID TEAMID, " + 
					" NAME, " + 
					" AGE, " + 
					" ROLL, " +
					" PASSWORD PW " + 
					" FROM MEMBER " + 
					"  WHERE MEM_ID LIKE '%s' AND PASSWORD LIKE '%s'   ";
			break;
		case INSERT_MEMBER:
			query = "  INSERT INTO MEMBER(" + 
					"  MEM_ID, " + 
					"  NAME, " + 
					"  SSN, " + 
					"  PASSWORD " +
					"  ) VALUES"+				
					"  ('%s' ,'%s' ,'%s' ,'%s' ) ";
			break;
			
		case FIND_ID:
			query = " SELECT " + 
					" MEM_ID USERID, " + 
					" FROM MEMBER " + 
					" WHERE NAME LIKE '%s' AND SSN LIKE '%s'   ";
			break;
		}
		return query;
	}
	
}
