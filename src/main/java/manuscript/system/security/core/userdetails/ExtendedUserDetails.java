package manuscript.system.security.core.userdetails;

import org.springframework.security.core.userdetails.UserDetails;

public interface ExtendedUserDetails extends UserDetails {

	String getUserId();
}
