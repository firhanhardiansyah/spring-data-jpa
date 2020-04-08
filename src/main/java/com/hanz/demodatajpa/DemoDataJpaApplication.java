package com.hanz.demodatajpa;

import java.util.Date;

import com.hanz.demodatajpa.model.AppUser;
import com.hanz.demodatajpa.repository.AppUserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDataJpaApplication implements CommandLineRunner {

	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Creating AppUser object: appUser1");
		AppUser appUser1 = new AppUser();
		AppUser appUser2 = new AppUser();

		appUser1.setUsername("username1");
		appUser1.setFirstName("Firhan");
		appUser1.setLastName("Hardiansyah");
		appUser1.setJoinDate(new Date());
		System.out.println("AppUser 1 created");
		
		appUser2.setUsername("username2");
		appUser2.setFirstName("Maman");
		appUser2.setLastName("Racing");
		appUser2.setJoinDate(new Date());
		System.out.println("AppUser 2 created");

		System.out.println("Saving AppUser1 . . .");
		this.appUserRepository.save(appUser1);
		System.out.println("Saved");

		System.out.println("Saving AppUser2 . . .");
		this.appUserRepository.save(appUser2);
		System.out.println("Saved");

	}

}
