package com.example.demo.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.domain.user.User;

public class PrincipalDetails implements UserDetails{

	private static final long serialVersionUID = 1L;

	private User user;
		
	public PrincipalDetails(User user) {
		this.user = user;
	}
	
	@Override // 권한이 하나가 아닐 수 있기 때문에 return이 Collection(heeyaa 아이디가 ROLE_ADMIN, ROLE_USER)
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// List, Set 사용 가능
		// 여러 개 role을 사용하려면 List 사용
		Collection<GrantedAuthority> collection = new ArrayList<GrantedAuthority>();
		collection.add(new GrantedAuthority() {

			@Override
			public String getAuthority() {
				return user.getRole();
			}
		});
		return collection;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true; // 계정이 만료됐는지? false -> 계정이 만료됨 
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true; // 계정이 잠겼니? 
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub 
		return true; // 1년 이상 계정을 사용하지 않으면 휴먼계정
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true; // 계정을 임시탈퇴
	}

}
