package com.example.codejava;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
//	 @Autowired
//	    private TestEntityManager entityManager;
//	     
//	    @Autowired
//	    private UserRepository repo;
//	    
//	   @Test
//	   public void testCreateUser() {
//		    user user = new user();
//		    user.setID("MinhTan123");
//		    user.setEmail("Nguyenminhtan0@gmail.com");
//		    user.setPassword("qu5UmtJ5@");
//		    user.setUsername("NguyenMinhTan");
//		    user.setAddress("Can Tho");
//		    user.setPhonenumber("0943.093.368");
//		     
//		    user savedUser = repo.save(user);
//		    user existUser = entityManager.find(user.class, savedUser.getID());
//		     
//		    assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
//		
//		}
	   
}
