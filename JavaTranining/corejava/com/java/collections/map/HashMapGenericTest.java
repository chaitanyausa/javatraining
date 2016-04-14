package com.java.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapGenericTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Map<Person, List<Account>> accntsMap = new HashMap<Person, List<Account>>();
		
		Person per1 = new Person("John", 12345666, "sfjdgsajfgsdajg");
		Person per2 = new Person("Hank", 123454332, "sfjdgsajfgsdajg");
		Person per3 = new Person("Jasmin", 12345456, "sfjdgsajfgsdajg");
		
		
		Account savngAcnt1   = new Account("saving",9876543,543.0f,12345666);
		Account loanAcnt1    = new Account("loan",98765543,547868.0f,12345666);
		Account currentAcnt1 = new Account("current",98761212,345678.0f,12345666);
		List<Account> pers1Accnts = new ArrayList<Account>();
		pers1Accnts.add(savngAcnt1);
		pers1Accnts.add(loanAcnt1);
		pers1Accnts.add(currentAcnt1);
		
		
		Account savngAcnt2   = new Account("saving",9876543,543.0f,123454332);
		Account loanAcnt2    = new Account("loan",98765543,547868.0f,123454332);
		Account currentAcnt2 = new Account("current",98761212,345678.0f,123454332);
		List<Account> pers2Accnts = new ArrayList<Account>();
		pers2Accnts.add(savngAcnt2);
		pers2Accnts.add(loanAcnt2);
		pers2Accnts.add(currentAcnt2);
		
		
		Account savngAcnt3   = new Account("saving",9876543,543.0f,12345456);
		Account loanAcnt3    = new Account("loan",98765543,547868.0f,12345456);
		Account currentAcnt3 = new Account("current",98761212,345678.0f,12345456);
		List<Account> pers3Accnts = new ArrayList<Account>();
		pers3Accnts.add(savngAcnt3);
		pers3Accnts.add(loanAcnt3);
		pers3Accnts.add(currentAcnt3);
		
		
		accntsMap.put(per1, pers1Accnts);
		accntsMap.put(per2, pers2Accnts);
		accntsMap.put(per2, pers3Accnts);
		
		
		//System.out.println(accntsMap);
		for(Person person:accntsMap.keySet()){
			List<Account> acnts = accntsMap.get(person);
			System.out.println("****** Person details ****"+person);
			System.out.println("****** accounts ****");
			System.out.println(acnts);
			System.out.println("***************************");
		}
		
		
	}

}
