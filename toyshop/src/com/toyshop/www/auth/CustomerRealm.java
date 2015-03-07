package com.toyshop.www.auth;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class CustomerRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//null usernames are invalid
        if (principals == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        //String username = (String) getAvailablePrincipal(principals);

        Set<String> roleNames = new LinkedHashSet<String>();
        roleNames.add("admin");
        Set<String> permissions = new LinkedHashSet<String>();
        permissions.add("product:query,view,create,update,delete");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
        info.setStringPermissions(permissions);
        return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		 UsernamePasswordToken upToken = (UsernamePasswordToken) token;
	        String username = upToken.getUsername();

	        // Null username is invalid
	        if (username == null) {
	            throw new AccountException("Null usernames are not allowed by this realm.");
	        }

	        SimpleAuthenticationInfo info =  new SimpleAuthenticationInfo(2, "test".toCharArray(), getName());
	            
	         

	        return info;
	}

}
