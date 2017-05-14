package manuscript.system.security.holder;

import org.springframework.security.core.context.SecurityContextHolder;

import manuscript.system.security.core.userdetails.ExtendedUserDetails;

public final class ManuscriptSecurityContext {

	public static ExtendedUserDetails getContext() {
		return (ExtendedUserDetails) SecurityContextHolder.getContext().getAuthentication();
	}
}
