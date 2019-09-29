import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import pers.swmmm.common.CustomRealm;

public class ShiroTest {
    @Test
    public void authenticationTest(){
        CustomRealm customRealm=new CustomRealm();
        DefaultSecurityManager securityManager=new DefaultSecurityManager();
        securityManager.setRealm(customRealm);
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("admin","admin");
        subject.login(token);
        System.out.println(subject.isAuthenticated());
    }
}
