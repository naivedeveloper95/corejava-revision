package com.dating.controller;

import com.dating.dao.UserAccountDAO;
import com.dating.dao.UserAccountDAOImpl;
import com.dating.model.Interest;
import com.dating.model.UserAccount;

public class UserAccountController {
	public static void main(String[] args) {
		UserAccountController userAccountController = new UserAccountController();
		userAccountController.registerUser();
	}

	public void registerUser() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		UserAccount userAccount = new UserAccount();

		userAccount.setId(1);
		userAccount.setAge(30);
		userAccount.setUserName("John");
		userAccount.setCity("Austin");
		userAccount.setCountry("USA");
		userAccount.setEmail("a@b.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("1234567890");

		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Watching Movies");
		interest.setDislikes("Blabbering");
		interest.setHobbies("Playing chess");
		interest.setProfileUrl("https://github.com/naivedeveloper95");
		interest.setAbout("Nice Human Being");

		userAccount.setInterest(interest);

		dao.save(userAccount);
		System.out.println(dao.findById(1));
	}

	public void findAll() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		UserAccount userAccount1 = new UserAccount();

		userAccount1.setId(1);
		userAccount1.setAge(30);
		userAccount1.setUserName("John");
		userAccount1.setCity("Austin");
		userAccount1.setCountry("USA");
		userAccount1.setEmail("a@b.com");
		userAccount1.setGender("M");
		userAccount1.setPassword("password");
		userAccount1.setPhoneNumber("1234567890");

		Interest interest1 = new Interest();
		interest1.setId(1);
		interest1.setLikes("Watching Movies");
		interest1.setDislikes("Blabbering");
		interest1.setHobbies("Playing chess");
		interest1.setProfileUrl("https://github.com/naivedeveloper95");
		interest1.setAbout("Nice Human Being");

		userAccount1.setInterest(interest1);

		dao.save(userAccount1);

		UserAccount userAccount2 = new UserAccount();

		userAccount2.setId(2);
		userAccount2.setAge(30);
		userAccount2.setUserName("John");
		userAccount2.setCity("Austin");
		userAccount2.setCountry("USA");
		userAccount2.setEmail("a@b.com");
		userAccount2.setGender("M");
		userAccount2.setPassword("password");
		userAccount2.setPhoneNumber("1234567890");

		Interest interest2 = new Interest();
		interest2.setId(1);
		interest2.setLikes("Watching Movies");
		interest2.setDislikes("Blabbering");
		interest2.setHobbies("Playing chess");
		interest2.setProfileUrl("https://github.com/naivedeveloper95");
		interest2.setAbout("Nice Human Being");

		userAccount2.setInterest(interest2);

		dao.save(userAccount2);
		System.out.println(dao.findById(1));
	}
}
