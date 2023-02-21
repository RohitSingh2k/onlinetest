package com.onlinetestmanagementsystem.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue
	private Long userId;

	@NotEmpty(message = "UserName must not be empty")
	@Pattern(regexp = "^[A-Z].*", message = "UserName must starts with capital letter")
	private String userName;

	private boolean isAdmin;

	@Size(min = 8, message = "Password must be 8 digit long")
	private String userPassword;

	@OneToMany(mappedBy = "user")
	private Set<UserTestDetails> details;
}
