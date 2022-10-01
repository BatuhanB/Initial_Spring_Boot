package com.initial.initial;

import com.initial.initial.model.Account;
import com.initial.initial.model.Transaction;
import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@SpringBootApplication
public class InitialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InitialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
		Account b = new Account("b", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
		//Set<Account> aa = Set.of(a,b);
	}
}