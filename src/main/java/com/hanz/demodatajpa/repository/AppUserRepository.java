package com.hanz.demodatajpa.repository;

import com.hanz.demodatajpa.model.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

}