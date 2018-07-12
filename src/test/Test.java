package test;

import java.text.*;
import java.util.*;

import dao.*;
import domain.*;
import service.*;

public class Test {
public static void main(String[] args) {
	List<String> lst = TestDao.getInstance().selectAge();
	//age 몇년생인지 추출
	//1988년생 남자
	//880101-1
	//88+01(random)+01(random)+-+1
	//insertinto로 DB저장
	
	String today=new SimpleDateFormat("yyyy").format(new Date());
	int yearint=0;
	String month,day,ssn="";
	String birth="";
		for(int i=0;i<20;i++) {
			yearint=Integer.parseInt(today)+1 -Integer.parseInt(lst.get(i));
			month = String.format("%02d", (int)(Math.random()*12)+1);
			day = String.format("%02d", (int)(Math.random()*30)+1);
			birth = String.valueOf(yearint)+ month+day+"-";
			ssn=birth.substring(2, 9);
			TestDao.getInstance().updateSsn(ssn,i+1);
			}
		}
	
}
