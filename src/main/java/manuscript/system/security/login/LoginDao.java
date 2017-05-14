package manuscript.system.security.login;

import java.util.List;

public interface LoginDao {

	public String loadUserIdByUsername(String username);

	public String loadPasswordByUserId(String userId);

	public List<String> loadAuthorityListByUserId(String userId);
}
