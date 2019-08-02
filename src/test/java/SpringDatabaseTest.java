import cn.edu.zju.crm4learning.mapper.CustomerMapper;
import cn.edu.zju.crm4learning.pojo.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class SpringDatabaseTest extends BaseJunit4Test {
    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void test01() {
        Customer customer = customerMapper.selectByPrimaryKey("1");
        System.out.println(customer.getCustomId()+customer.getCustomName()+customer.getCustomPhone());
    }
}
