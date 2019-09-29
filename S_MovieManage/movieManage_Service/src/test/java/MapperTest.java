import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.swmmm.mapper.AdminMapper;
import pers.swmmm.mapper.TagMapper;
import pers.swmmm.po.Tag;


/**
 * @ClassName: MapperTest
 * @description:
 * @author: swm
 * @create: 2019-08-30 10:49
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig/spring-movieManage.xml")
public class MapperTest {

    @Autowired
    TagMapper tagMapper;
    @Test
    public void txTest(){
        System.out.println(tagMapper.selectByExample(null).size());
        if (tagMapper.insert(new Tag("tag2")) > 0){
         System.out.println("insert one record");
        }
        int i = 1/0;
        System.out.println(tagMapper.selectByExample(null).size());
    }


}